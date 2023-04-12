package org.testing.testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC5_postreq_withbodydata_pojo {
	public static void main(String[] args) {
		AddressInformation[] ad = new AddressInformation[2];
		ad[0]= new AddressInformation();
		ad[0].setDoorno("444");
		ad[0].setLandmark("hoysala");
        ad[0].setType("trait");
        ad[0].setWardno("4");

        ad[1]= new AddressInformation();
		ad[1].setDoorno("66");
		ad[1].setLandmark("hararngi");
        ad[1].setType("housssss");
        ad[1].setWardno("8");

		
		Basicinformation basic = new Basicinformation();
		basic.setFirstname("nibba");
		basic.setLastname("nibbi");
		basic.setDesignation("analyst");
		basic.setId("nin123 ");
		basic.setAddress(ad);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(basic)
		.when()
		.post(" http://localhost:3000/ApiStudents");
		System.out.println("status code is"+"  "+ res.statusCode());
	}

}
