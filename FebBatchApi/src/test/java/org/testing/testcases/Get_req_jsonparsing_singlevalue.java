package org.testing.testcases;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class Get_req_jsonparsing_singlevalue {
	public static void main(String[] args) {
	
   Response res =
	given()
	.contentType(ContentType.JSON)
	.when()
	.get("http://localhost:3000/ApiStudents");
   
   //System.out.println(res.asString());
	 JSONArray js=new JSONArray(res.asString());
	JSONObject j =js.getJSONObject(0); //js.getJsonobject is method
	System.out.println(j.get("ID"));
	
	} 
}
