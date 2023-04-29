package main;

import pack1.A;
//import pack2.B;
import pack3.C;
import pack4.D;
public class Main {
	public static void main(String[] args) {
		A a = new A();
		//B b = new B();
		a.method();
		C c = a.getC();
		D d = a.getD();
		c.method();
		d.method();
		
	}
}
