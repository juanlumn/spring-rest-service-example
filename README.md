# spring-rest-service-example
Various Spring rest service examples.

# Build instructions
Navigate to the project folder and type:
mvn clean install 

# Test instructions
Navigate to the project folder and type:
mvn clean test

# Run instructions
Navigate to the project folder and type:
mvn clean install
mvn clean spring-boot:run

http://localhost:8080/greeting displays a 'Hello World' message

http://localhost:8080/greeting?name=param displays a 'Hello {param}' message

http://localhost:8080/getMyIP retrieves the IP from a GET service and parses the JSON response
 

Note: This code is based on the guides placed at https://spring.io/guides


