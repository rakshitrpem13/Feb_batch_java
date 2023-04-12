package org.testing.testcases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC_4_postrequest_withBodaydata_jsonFile {
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("../FebBatchApi/Bodydata.json"); // file class is used for connection between json file
		FileReader fr=new FileReader(f); // reader object
		JSONTokener jr =new JSONTokener(fr); // used to read json file
		JSONObject js =new JSONObject(jr);
	Response res=
		given()
		.contentType(ContentType.JSON)
		.body(js.toString())
		.when()
		.post(" http://localhost:3000/ApiStudents");
	System.out.println("status code is");
	System.out.println(res.statusCode());
	}

}

  