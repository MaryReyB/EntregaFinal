FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceConfigPF-1.0.0jar config.jar
EXPOSE 8888
ENTRYPOINT {"java",".jar","config.jar"}