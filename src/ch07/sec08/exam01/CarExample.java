package ch07.sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
//		Car ��ü ����
		Car myCar = new Car();
		
//		Tire ��ü ����
		myCar.tire = new Tire();
		myCar.run(); // ȸ���մϴ�.
		
//		HankookTire ��ü ����
		myCar.tire = new HankookTire();
		myCar.run(); // �ѱ� Ÿ�̾ ȸ���մϴ�.
		
//		KumhoTire ��ü ����
		myCar.tire = new KumhoTire();
		myCar.run(); // ��ȣ Ÿ�̾ ȸ���մϴ�.
	}

}
