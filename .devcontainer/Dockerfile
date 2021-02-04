# See here for image contents: https://github.com/microsoft/vscode-dev-containers/tree/v0.155.1/containers/java-8/.devcontainer/base.Dockerfile

FROM mcr.microsoft.com/vscode/devcontainers/java:0-8
WORKDIR /
ADD api-gateway.jar api-gateway.jar
EXPOSE 8761
ENTRYPOINT [ "java", "-jar", "api-gateway.jar" ]

# [Optional] Uncomment this section to install additional OS packages.
# RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
#     && apt-get -y install --no-install-recommends <your-package-list-here>

# [Optional] Uncomment if you want to install an additional version of node using nvm
# ARG EXTRA_NODE_VERSION=10
# RUN su node -c "source /usr/local/share/nvm/nvm.sh && nvm install ${EXTRA_NODE_VERSION}"

# [Optional] Uncomment if you want to install more global node modules
# RUN su node -c "npm install -g <your-package-list-here>"
