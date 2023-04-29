package pack1;

import pack2.*;
import pack3.*;
import pack4.*;

public class A {
	public void method() {
		System.out.println("A methdo executed");
		
		//추가된 라
		B b = new B();
		b.method();
	}
	
	public C getC() {
		return new C();
	}
	
	public D getD() {
		return new D();
	}
}
