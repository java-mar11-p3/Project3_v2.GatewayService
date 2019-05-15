FROM java:8u111-jdk

ADD target/Project3_v2.GatewayService.jar /GatewayService.jar

CMD ["java","-jar", "GatewayService.jar", "com.java.GatewayService"]
