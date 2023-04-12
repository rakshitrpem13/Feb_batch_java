package org.testing.testcases;

import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_keyset {
	public static void main(String[] args) {
		
		   Response res =
			given()
			.contentType(ContentType.JSON)
			.when()
			.get("http://localhost:3000/ApiStudents");
		   
		   //System.out.println(res.asString());
			 JSONArray js=new JSONArray(res.asString());
			JSONObject j =js.getJSONObject(1);
			Set<String> allkey=j.keySet();
			
			for(String key:allkey)
			{
				System.out.println("key is"+key);
	System.out.println("value is"+j.get(key));
			

}
}
}
