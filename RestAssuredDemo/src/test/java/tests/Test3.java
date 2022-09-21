package tests;

import org.testng.annotations.Test;

import AddPlace.courses;
import io.restassured.path.json.JsonPath;

public class Test3 {
	public static int totalCoursePrice;
	@Test
	public void display() {
		
		JsonPath js = new JsonPath(courses.courseDetails());
		System.out.println(js.get("dashboard.purchaseAmount"));
		System.out.println(js.get("dashboard.website"));
		System.out.println(js.get("courses[1].title"));
		System.out.println(js.get("courses[2].price"));
		int size = js.get("courses.size()");
		System.out.println("Size="+size);
		for(int i=0;i<size;i++) {
			String courseNames = js.getString("courses["+i+"].title");
			System.out.println("Course Name:"+courseNames);
			int coursePrice=js.getInt("courses["+i+"].price");
			int coursePageCopies=js.getInt("courses["+i+"].copies");
			totalCoursePrice=totalCoursePrice+coursePrice*coursePageCopies;
		}
		System.out.println("Total Purchase Price="+totalCoursePrice);			
	}
}
