package ch04.sec03;

public class SwitchExpressionsExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A', 'a' -> {
				System.out.println("��� ȸ���Դϴ�.");
			}
			case 'B', 'b' -> {
				System.out.println("�Ϲ� ȸ���Դϴ�.");
			}
			default -> {
				System.out.println("�մ��Դϴ�.");
			}
		}
		
		switch(grade) {
		case 'A', 'a' -> System.out.println("��� ȸ���Դϴ�."); //�߰�ȣ �ȿ� ���๮�� �ϳ����
		case 'B', 'b' -> System.out.println("�Ϲ� ȸ���Դϴ�."); //�߰�ȣ�� ������ �� ����
		default -> System.out.println("�մ��Դϴ�.");
		}
		
//		�Ϲ� ȸ���Դϴ�.
//		�Ϲ� ȸ���Դϴ�.
	}
}