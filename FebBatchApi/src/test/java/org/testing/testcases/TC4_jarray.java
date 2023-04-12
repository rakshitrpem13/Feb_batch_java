package org.testing.testcases;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC4_jarray {
	public static void main(String[] args) {
		JSONObject inner1=new JSONObject();
		inner1.put("houseno","14");
		inner1.put("roadno","16");
		inner1.put("drivewayno","17");
		inner1.put("addresstype","primaryaddress");
		
		JSONObject inner2=new JSONObject();
		inner2.put("houseno","14");
		inner2.put("roadno","16");
		inner2.put("drivewayno","17");
		inner2.put("addresstype","secondaryaddress");
		
		JSONArray array=new JSONArray();
		array.put(0,inner1);
		array.put(1,inner2);
		
		JSONObject outer=new JSONObject();
		outer.put("firstname","kabzaa");
		outer.put("lastname","kab");
		outer.put("id","nitinnn");
		outer.put("address",array);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(outer.toString())
		.when()
		.post("http://localhost:3000/ApiStudents");
		System.out.println("status cose is"+ res.statusCode());
				
		
		
	}

}
