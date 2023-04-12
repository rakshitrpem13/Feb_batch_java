package org.testing.testcases;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

public class TC3_complex {
	public static void main(String[] args)
	{
		JSONObject inner=new JSONObject();
		inner.put("houseno","14");
		inner.put("roadno","16");
		inner.put("drivewayno","17");
		inner.put("addresstype","primaryaddress");
		
		JSONObject outer=new JSONObject();
		outer.put("firstname","kabzaa");
		outer.put("lastname","kab");
		outer.put("id","nitinn");
		outer.put("address",inner);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(outer.toString())
		.when()
		.post("http://localhost:3000/ApiStudents");
		System.out.println("status code is"+ res.statusCode());
		
		
		
	  
		
	}
}
