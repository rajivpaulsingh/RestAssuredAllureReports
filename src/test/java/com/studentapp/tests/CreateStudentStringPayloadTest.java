package com.studentapp.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateStudentStringPayloadTest extends BaseTest {
	
	@DisplayName("Create a new student by sending payload as String")
	@Test
	void createNewStudent() {
		
		String payload = "{\"firstName\":\"Rajiv\",\"lastName\":\"Singh\",\"email\":\"dsds@dasdas.com\",\"programme\":\"Criminology\",\"courses\":[\"Criminal Mind\",\"Gender, Crime and Justice \",\"Philosophy of Law \"]}";
		
		given()
		.when()
		.contentType(ContentType.JSON)
		.when()
		.body(payload)
		.post()
		.then()
		.statusCode(201);
	}

}
