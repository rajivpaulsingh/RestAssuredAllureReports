# Rest Assured API Automation Framework with Allure Reports

We are using the following elements in this API automation framework:
 - Rest Assured library
 - JUnit 5 testing framework
 - Apache Maven

## Steps
 - Install Java
 - Install Maven
 - Install Docker
 - Run the following app in docker(https://hub.docker.com/r/tejasn1/student-app)
 	1. docker pull tejasn1/student-app
 	2. docker run -p 8085:8080 -d tejasn1/student-app
 	3. Ensure the app is running in the 8085 port (http://localhost:8085/student/list)	
 - Create the maven project in Eclipse or IntelliJ 		
 - Start writing tests
 
## Other important information 
 - Don't forget to check the pom.xml file for all the dependencies
 - Use java faker api for random unique data - https://github.com/DiUS/java-faker
 - Extracting the information from JSON or XML can be done in two ways:
	1. Jayway Json path (Java based)
 	2. JsonPath (Inbuilt in rest assured but its based on Groovy)
 	3. XmlPath (Inbuilt in rest assured but its based on Groovy)
 - JsonPath online Evaluator: https://jsonpath.herokuapp.com/
 - GitHub Page: https://github.com/json-path/JsonPath	