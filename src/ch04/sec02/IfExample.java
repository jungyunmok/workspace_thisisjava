package ch04.sec02;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("������ 90 �̻��Դϴ�.");
			System.out.println("����� A �Դϴ�.");
		}
		
		if(score < 90)
			System.out.println("������ 90 �̸��Դϴ�."); //{} ����
		System.out.println("����� B �Դϴ�."); //if ���� ������� ���๮
	}
}