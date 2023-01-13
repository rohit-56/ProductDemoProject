FROM openjdk:11
EXPOSE 8080
ADD build/libs/project.jar project.jar
ENTRYPOINT ["java","-jar","/project.jar"]