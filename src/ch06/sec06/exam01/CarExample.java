package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); //Car ��ü ����
		
//		Car ��ü�� �ʵ尪 �б�
		System.out.println("�𵨸�: " + myCar.model); //null
		System.out.println("�õ�����: " + myCar.start); //false
		System.out.println("����ӵ�: " + myCar.speed); //0
	}
}