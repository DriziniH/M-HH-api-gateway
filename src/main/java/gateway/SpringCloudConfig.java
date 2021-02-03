package gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

        @Bean
        public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
                return builder.routes()
                        .route(r -> r.path("/eu/**").uri("lb://EU-SERVICE"))
                        .route(r -> r.path("/usa/**").uri("lb://USA-SERVICE"))
                        .build();
        }

        // @Bean
        // public ServerCodecConfigurer serverCodecConfigurer() {
        //     return ServerCodecConfigurer.create();
        // }

}
