package practice;

import methods1.*;
import oops.Interface3;

public class Test {

	public static void main(String[] args) {
		MethodCelsius m1 = new MethodCelsius();
		m1.temperaturecelsius(45);
		Method7 m2=new Method7();
		m2.add(25, 65);
		Method03 m3=new Method03();
		m3.display();
		m3.display(25);
		
		Interface3 m4=new Interface3();
		m4.print();
		m4.show();
		System.out.println(Interface3.age);
		
	}
	
}
