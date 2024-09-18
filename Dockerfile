FROM amazoncorretto:21-alpine-jdk
MAINTAINER ERNESTO
COPY target/SI62_GRUPO_01-0.0.1-SNAPSHOT.jar TerraPlanServices.jar
ENTRYPOINT ["java", "-jar","/TerraPlanServices.jar"]