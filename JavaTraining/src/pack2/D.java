package pack2;

import pack1.A;

class D extends A{
	public static void main(String args[]) {
		pack1.A obj = new pack1.A();// using fully qualified name
		obj.msg();
		pack1.Simple2 s1=new pack1.Simple2();
	}
}