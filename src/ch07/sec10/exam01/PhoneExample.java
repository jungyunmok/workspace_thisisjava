package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone(); -> ���Ұ�!
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn(); // Phone �޼ҵ�
		smartPhone.internetSearch();
		smartPhone.turnOff(); // Phone �޼ҵ�
		
//		�� ������ �մϴ�.
//		���ͳ� �˻��� �մϴ�.
//		�� ������ ���ϴ�.
	}
}