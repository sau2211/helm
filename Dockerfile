FROM openjdk:17
EXPOSE 9090
ADD target/helm-0.0.1-SNAPSHOT.jar helm-0.0.1-SNAPSHOT
ENTRYPOINT ["java", "-jar", "helm-0.0.1-SNAPSHOT"]