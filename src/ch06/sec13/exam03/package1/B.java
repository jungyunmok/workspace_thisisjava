package ch06.sec13.exam03.package1; //A�� ���� ��Ű��

public class B {
	public void method() {
//		��ü ����
		A a = new A();
		
//		�ʵ尪 ����
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; //������ ����, private �ʵ� ���� �Ұ�
		
//		�޼ҵ� ȣ��
		a.method1();
		a.method2();
//		a.method3(); //������ ����, private �޼ҵ� ���� �Ұ�
	}
}