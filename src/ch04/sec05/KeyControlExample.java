package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in); //Scanner ����
		boolean run = true; //while ���� ���ǽ��� ���� ���� ����
		int speed = 0;
		
		while(run) {
			System.out.println("=====");
			System.out.println("1. ���� | 2. ���� | 3. ����");
			System.out.println("=====");
			System.out.println("����: ");
			
			String strNum = scanner.nextLine(); //Ű���� �Է� ������ ����
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("���� �ӵ�= " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("���� �ӵ�= " + speed);
			} else if(strNum.equals("3")) {
				run = false; //while���� ���ǽ��� false�� ����
			}
		}
		
		System.out.println("���α׷� ����");
	}
}