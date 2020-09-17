package com.mypoc.test;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.junit.Test;

import io.restassured.response.Response;
/**
 * 
 * @author Krishna
 *
 */
public class CountryRandomizerApplicationTests {

	@Test
	public void contextLoads() {
		String value =getAPIResult();
		//here we can write the assertion 
		System.out.println("output String >>>"+value);
	}

	
	public static String getAPIResult() {
		HashMap<String, String> headerMap = new HashMap<>();
		headerMap.put("Content-Type", "application/json");
		String response = null;
		
		try {
			Response res = given().contentType("Content-Type").body("US").when().headers(headerMap).post("http://localhost:2345/randomizer/v1/address");
			System.out.println("statuscode in serviceBroker:" + res.statusCode());
 			response = res.getBody().asString();
 			System.out.println("response>> "+response);
		} catch (Exception e) {
			System.out.println("Exception in Api Call... resetting status code to 0");
		}

		return response;
	}
}
