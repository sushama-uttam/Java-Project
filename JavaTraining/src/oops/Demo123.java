package oops;

import methods1.*;
//import day13Constructor.MethodOverloading4;
public class Demo123 implements DemoInterface{

	public void display() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Method5 m1=new Method5();
//		m1.average(25, 58, 65);
//		MethodCelsius m2=new MethodCelsius();
//		
//		DisplayOverloading d1=new DisplayOverloading();
		//fullyqualified class name---> packagename.classname
		methods1.Method5 m1=new methods1.Method5();
		m1.average(25, 58, 65);
		m1.average(25, 58, 65);
		
		//Day8Methods.Method2.average();
		
		Method2.average();
		constructor.MethodOverloading4.call();
	}

}
