FROM java:8-jdk-alpine

COPY ./target/cursomc.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch cursomc.jar'

ENTRYPOINT ["java","-jar","cursomc.jar"]
