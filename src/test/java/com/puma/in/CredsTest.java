package com.puma.in;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CredsTest {
	@Test
	public void CredsAuthTest() {

		RestAssured.baseURI = "https://developer.github.com/";
		Response res = given().queryParam("foo", "bar").when().get("/v3").then().assertThat().statusCode(200).and()
				.extract().response();

		String responseDetails = res.asString();

		System.out.println(" responseDetails " + responseDetails);
		JsonPath jPath = new JsonPath(responseDetails);
	}
}
