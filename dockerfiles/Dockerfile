FROM java:8-jdk-alpine
COPY /home/jenkins/workspace/Lenin/target/*.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "calculator-1.1-SNAPSHOT.jar"]
