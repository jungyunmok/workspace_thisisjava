package ch06.sec06.exam02;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); //Car ��ü ����
		
//		Car ��ü�� �ʵ尪 �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ��ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
		
//		Car ��ü�� �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
	}
	
//	����ȸ��: �����ڵ���
//	�𵨸�: �׷���
//	����: ����
//	�ְ��ӵ�: 350
//	����ӵ�: 0
//	������ �ӵ�: 60
}