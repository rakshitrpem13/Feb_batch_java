package org.testing.testcases;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC2_postreq {
	public static void main(String[] args) {
		JSONObject js =new JSONObject();
		js.put("firstname", "nayara");
		js.put("lastname", "narayan");
		js.put("designation", "devops");
		js.put("id", "hi");
		
		Response res=
	    given()
		.contentType(ContentType.JSON)
		.body(js.toString())
		.when()
		.post(" http://localhost:3000/ApiStudents");
		System.out.println("status code is"+res.statusCode());
	}
	
	

}
