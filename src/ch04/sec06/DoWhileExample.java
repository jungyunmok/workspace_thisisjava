package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in); //Scanner ����
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine(); //Ű����κ��� �б�
			System.out.println(inputString);
		} while(! inputString.equals("q")); //�Է� ������ q�� �ƴ϶�� ��� �ݺ�
		
		System.out.println();
		System.out.println("���α׷� ����");
	}
}