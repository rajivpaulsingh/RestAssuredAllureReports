package com.studentapp.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;
//import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class MyFirstTest {
	
	@DisplayName("Getting all the students from the database")
	@Test
	void getAllStudents() {
		
		//1. Authentic/Old way
//		RequestSpecification requestSpec = RestAssured.given();
//		Response response = requestSpec.get("http://localhost:8085/student/list");
//		response.prettyPrint();
//		
//		ValidatableResponse validatableResponse = response.then();
//		validatableResponse.statusCode(200);
		
		//2. Better way
//		Response res = RestAssured.given()
//				   .when()
//				   .get("http://localhost:8085/student/list")
//				   .then()
//				   .statusCode(200)
//				   .extract().response();
//		res.prettyPrint();
		
		//3. Best way - by using static methods directly - look line 11
		Response res = given()
				   .when()
				   .get("http://localhost:8085/student/list")
				   .then()
				   .statusCode(200)
				   .extract().response();
		res.prettyPrint();
		
	}
	
	@DisplayName("Getting only the 2 CS students from the list")
	@Test
	void getSingleCSStudent() {
		
		Response res = given()
		.queryParam("programme", "Computer Science")
		.queryParam("limit", 2)
		.when()
		.get("http://localhost:8085/student/list");
		
		res.prettyPrint();
		
	}

}
