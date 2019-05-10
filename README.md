# Project3_v2.GatewayService

dependencies used in pom.xml
----------------------------
- spring-cloud-starter-netflix-eureka-client
- spring-cloud-starter-netflix-zuul
- spring-cloud-starter-config
- spring-boot-starter-web
- spring-cloud-depencies with version of Greenwich.RELEASE

application.properties
----------------------
- spring.application.name=gateway-service
    This is to set the service name
    
- spring.main.allow-bean-definition-overriding=true
- eureka.client.register-with-eureka=true
- eureka.client.fetch-registry=true
    --This is to register the API Gateway as a client instead of a server
    
- spring.cloud.config.uri=http://localhost:8888
    --This is when we have a configuration service that contains figuration files in a git repository that could contain location and         credential of our database. 


- eureka.client.serviceUrl.defaultZone=http://localhost:8086/eureka/ 
    --This is so API Gateway can register itself as client in the Eureka server we create with Discover Service

zuul.routes.candidateservice.path=/candidateservice/**
zuul.routes.candidateservice.serviceId=candidate-service

zuul.routes.screeningservice.path=/screeningservice/**
zuul.routes.screeningservice.serviceId=screening-service

zuul.routes.userservice.path=/userservice/**
zuul.routes.userservice.serviceId=user-service
  --We are creating these routes so that API Gateway can pass the requests from the frontend to the applicable service

public class GatewayService{...}
--------------------------------
Since we are using SpringBoot, it provides an embedded tomcat server. There should be a main method and run the class as Java application.

When run successfully, you should see the DiscoverService as an instance, meaning that it successfully registered itself in the Eureka server
