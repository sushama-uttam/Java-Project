package com.POJO;

import java.util.ArrayList;
import java.util.List;

public class PostData_TestNG {
	public static Place_API addAll(double lat,double lng,double acc,String name,
			String phno,String addr,String type1,String type2,String web,String lang) {
		Place_API api = new Place_API();
		Location location = new Location();
		location.setLat(lat);
		location.setLng(lng);
		api.setLoc(location);
		api.setAccuracy(acc);
		api.setName(name);
		api.setPhone_number(phno);
		api.setAddress(addr);
		List<String> lst = new ArrayList<String>();
		lst.add(type1);
		lst.add(type2);
		api.setTypes(lst);
		api.setWebsite(web);
		api.setLanguage(lang);
		return api;

	}
}
