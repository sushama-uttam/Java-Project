package com.AddData;

public class payload {
public static String place() {
	return "{\r\n" + 
			"  \"location\": {\r\n" + 
			"    \"lat\": -38.383494,\r\n" + 
			"    \"lng\": 33.427362\r\n" + 
			"  },\r\n" + 
			"  \"accuracy\": 50,\r\n" + 
			"  \"name\": \"Frontline house\",\r\n" + 
			"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
			"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
			"  \"types\": [\r\n" + 
			"    \"shoe park\",\r\n" + 
			"    \"shop\"\r\n" + 
			"  ],\r\n" + 
			"  \"website\": \"http://google.com\",\r\n" + 
			"  \"language\": \"French-IN\"\r\n" + 
			"}\r\n"
			+ "";
}
public static String postBody(String title, String body) {
	String b = "{\n" +
		      "\"title\": \"" +title+ " \",\n" + "\"body\": \"" +body+ " \",\n" + " \"userId\": \"34\" \n}";
	return b;
}
}
