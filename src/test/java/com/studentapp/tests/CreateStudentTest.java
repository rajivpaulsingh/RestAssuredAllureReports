package com.studentapp.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateStudentTest extends BaseTest {
	
	@DisplayName("Create a new student")
	@Test
	void createNewStudent() {
		
		String payload = "{\"firstName\":\"Rajiv\",\"lastName\":\"Singh\",\"email\":\"Inkjhdsf@sfsdf.com\",\"programme\":\"Criminology\",\"courses\":[\"Criminal Mind\",\"Gender, Crime and Justice \",\"Philosophy of Law \"]}";
		
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
