package com.studentapp.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
//import io.restassured.RestAssured;
import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;
//import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.*;

public class GetStudentsTest extends BaseTest {
	
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
				   .get("/list")
				   .then()
				   .statusCode(200)
				   .extract().response();
		res.prettyPrint();
		
	}
	
	@DisplayName("Query parameter: Getting only the 2 CS students from the list")
	@Test
	void getSingleCSStudent() {
		
		Map<String, Object> hmap = new HashMap<String, Object>();
		hmap.put("programme", "Computer Science");
		hmap.put("limit", 2);
		
		Response res = given()
//		.queryParam("programme", "Computer Science")
//		.queryParam("limit", 2)
		.queryParams(hmap)
		.when()
		.get("/list");
		
		res.prettyPrint();
		
	}
	
	@DisplayName("Path parameter: Getting the first student from the list")
	@Test
	void getFirstStudent() {
		
		Response res = given()
				.pathParam("id", 1)
				.when()
				.get("/{id}");
		
		res.prettyPrint();
		
//		RestAssured.reset(); //reset the basetest class
	}

}
