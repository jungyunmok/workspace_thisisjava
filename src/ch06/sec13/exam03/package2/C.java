package ch06.sec13.exam03.package2; //A, B�� �ٸ� ��Ű��

import ch06.sec13.exam03.package1.A;

public class C {
	public C() {
//		��ü ����
		A a = new A();
		
//		�ʵ尪 ����
		a.field1 = 1;
//		a.field2 = 1; //������ ����, default �ʵ� ���� �Ұ�
//		a.field3 = 1; //private �ǵ� ���� �Ұ�
		
//		�޼ҵ� ȣ��
		a.method1();
//		a.method2(); //������ ����, default �޼ҵ� ���� �Ұ�
//		a.method3(); //������ ����, private �޼ҵ� ���� �Ұ�
	}
}