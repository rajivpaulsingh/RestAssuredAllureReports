package com.studentapp.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.studentapp.model.StudentPojo;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class CreateStudentPojoPayloadTest extends BaseTest {
	
	@DisplayName("Create a new student by sending payload as Java object")
	@Test
	void createNewStudent() {
				
		StudentPojo student = new StudentPojo();
		List<String> courses = new ArrayList<String>();
		courses.add("Calculus");
		courses.add("Algorithms");
		courses.add("Ethics");
		
		student.setFirstName("Rajiv");
		student.setLastName("Singh");
		student.setEmail("rajiv123@rajiv.com");
		student.setProgramme("Computer Science");
		student.setCourses(courses);
		
		given()
		.when()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.post()
		.then()
		.statusCode(201);
	}

}
