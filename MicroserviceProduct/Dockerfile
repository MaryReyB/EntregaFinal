FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceProduct-1.0.0jar product.jar
EXPOSE 8082
ENTRYPOINT {"java",".jar","product.jar"}