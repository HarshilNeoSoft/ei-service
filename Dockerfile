FROM openjdk:8-jdk-alpine
COPY /build/libs/ei-service-0.0.1-SNAPSHOT.jar ei-service.jar
CMD ["java","-jar","/ei-service.jar"]