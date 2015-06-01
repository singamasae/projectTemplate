# projectTemplate #
Java RESTful Web Service Application with JSON & XML Response 

## Development Stack ##
* Maven
* Spring Framework 4.0.2
* Spring Data JPA 1.5.1
* Hibernate 4.3.0
* Logback 1.1.2
* JUnit 4.11
* MySQL 5.x
* JAXB
* JSON jackson-mapper-asl 1.9.13

## Configuration ##
1. Database configuration : \src\main\resources\jdbc.properties
2. Log configuration : \src\main\resources\logback.xml
3. Application context : \src\main\resources\applicationContext.xml
4. Spring MVC dispatcher servlet : \WebContent\WEB-INF\app-servlet.xml

## Tools ##
* IDE : Eclipse or Spring Tool Suite
* Application Server : Tomcat 7
* Automated Test : JUnit

## Build and Run ##
1. Setup MySQL Database

    * db name :  template_db
    * username : root 
    * password : 

2. Run application (simply use maven project import tool in eclipse/STS)
3. JSON response : Browse http://localhost:8080/projectTemplate/getUser.api?&userName=yourName&format=json
	XML response : Browse http://localhost:8080/projectTemplate/getUser.api?&userName=yourName&format=xml