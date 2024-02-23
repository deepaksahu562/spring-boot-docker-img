# Start with a base image containing Java runtime
FROM openjdk:10

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/dsk-spring-boot-docker-img.jar dsk-spring-boot-docker-img.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/dsk-spring-boot-docker-img.jar"]