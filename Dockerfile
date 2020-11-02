FROM openjdk:11
EXPOSE 8890

ADD target/GoodsService-0.0.1-SNAPSHOT.jar GoodsService-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","GoodsService-0.0.1-SNAPSHOT.jar"]