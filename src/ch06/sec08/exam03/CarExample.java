package ch06.sec08.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); //Car ��ü ����
		
		myCar.setGas(5); //���ϰ��� ���� setGas() �޼ҵ� ȣ��
		
//		isLeftGas() �޼ҵ带 ȣ���ؼ� ���� ���ϰ��� true�� ��� if ��� ����
		if(myCar.isLeftGas()) {
			System.out.println("����մϴ�.");
			
//			���ϰ��� ���� run() �޼ҵ� ȣ��
			myCar.run();
		}
		
		System.out.println("gas�� �����ϼ���.");
	}
	
//	gas�� �ֽ��ϴ�.
//	����մϴ�.
//	�޸��ϴ�. (gas�ܷ�: 5)
//	�޸��ϴ�. (gas�ܷ�: 4)
//	�޸��ϴ�. (gas�ܷ�: 3)
//	�޸��ϴ�. (gas�ܷ�: 2)
//	�޸��ϴ�. (gas�ܷ�: 1)
//	����ϴ�. (gas�ܷ�: 0)
//	gas�� �����ϼ���.
}