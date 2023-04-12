package org.testing.testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC1 {
	public static void main(String[] args) {
	Response res=
    given()
	.contentType(ContentType.JSON)
	.when()
	.get("http://localhost:3000/ApiStudents"); 
	System.out.println("status code is"+"  "+res.statusCode());
	System.out.println("response data is");
	System.out.println(res.asString());
	}

}
