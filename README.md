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
	
	a. docker pull tejasn1/student-app
	b. docker run -p 8085:8080 -d tejasn1/student-app
	c. Ensure the app is running in the 8085 port (http://localhost:8085/student/list)
	
 - Create the maven project in Eclipse or IntelliJ 		
 - Start writing tests