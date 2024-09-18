FROM amazoncorretto:21-alpine-jdk
MAINTAINER SAMIR
COPY SI62_GRUPO_01-0.0.1-SNAPSHOT.jar TerraplanServiceBackend.jar
ENTRYPOINT ["java", "-jar","/TerraplanServiceBackend.jar"]
