FROM eclipse-temurin:17
COPY target/DevProject.jar DevProject.jar
CMD [ "java","-jar","DevProject.jar" ]