package gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class APIGateway {

	public static void main(String[] args) {
		SpringApplication.run(APIGateway.class, args);
	}

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
			return builder.routes()
					.route(r -> r.path("/eu/**").uri("lb://EU-SERVICE"))
					.route(r -> r.path("/usa/**").uri("lb://USA-SERVICE"))
					.build();
	}

}
