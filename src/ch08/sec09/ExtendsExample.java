package ch08.sec09;

public class ExtendsExample {
	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB(); 사용 불가!
		System.out.println();
		
		InterfaceB ib = impl;
//		ib.methodA(); 사용 불가!
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
/*
InterfaceCImpl-methodA() 실행

InterfaceCImpl-methodB() 실행

InterfaceCImpl-methodA() 실행
InterfaceCImpl-methodB() 실행
InterfaceCImpl-methodc() 실행
 */