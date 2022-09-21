package tests;

import AddPlace.courses;
import io.restassured.path.json.JsonPath;

public class getCourseDetails {
	public static int totalCoursePrice;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
