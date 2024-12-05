FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceWorker-1.0.0jar worker.jar
EXPOSE 8082
ENTRYPOINT {"java",".jar","worker.jar"}