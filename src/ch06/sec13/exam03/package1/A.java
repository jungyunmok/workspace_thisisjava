package ch06.sec13.exam03.package1;

public class A {
//	public ���� ������ ���� �ʵ� ����
	public int field1;
//	default ���� ������ ���� �ʵ� ����
	int field2;
//	private ���� ������ ���� �ʵ� ����
	private int field3;
	
//	������ ����, Ŭ���� ������ ��� ���� �������� ������ ���� ����
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
//	public ���� ������ ���� �޼ҵ� ����
	public void method1() {
	}
	
//	default ���� ������ ���� �޼ҵ� ����
	void method2() {
	}
	
//	private ���� ������ ���� �޼ҵ� ����
	private void method3() {
	}
}