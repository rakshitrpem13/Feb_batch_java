package org.testing.testcases;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Tc5_postreq_dynamicinput {
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("../FebBatchApi/Bodydata.json"); // file class is used for connection between json file
		FileReader fr=new FileReader(f); // reader object
		JSONTokener jr =new JSONTokener(fr); // used to read json file
		JSONObject js =new JSONObject(jr);
	
		String bodydata=js.toString(); // this statment for storing the data in bodydata(after coverting your data into string)
		System.out.println("please enter id value");
	Scanner S =new Scanner(System.in);    // taking scanner to enter the ID value
	String idvalue=S.next();
	bodydata= bodydata.replaceAll(Pattern.quote("{{id}}"), idvalue); // pattern is the class given by java
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata) // body input will be bodydate
		.when()
		.post(" http://localhost:3000/ApiStudents");
	System.out.println("status code is");
	System.out.println(res.statusCode());
	}


}
