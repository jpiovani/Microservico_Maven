FROM openjdk:11

WORKDIR /app

COPY target/lavanderia-0.0.1-SNAPSHOT.jar /app

CMD [ "java", "-jar", "/app/lavanderia-0.0.1-SNAPSHOT.jar" ]
