package ch04;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
//		while ���� Scanner�� nextLine() �޼ҵ带 �̿��� Ű����κ���
//		�Էµ� �����ͷ� ����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ� �ۼ�
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("---------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 3. ����");
			System.out.println("---------------");
			System.out.print("����> ");
			
			int menuNum = scanner.nextInt();
			
			switch(menuNum) {
				case 1 -> {
					System.out.print("���ݾ�> ");
					balance += scanner.nextInt();
				}
				case 2 -> {
					System.out.print("��ݾ�> ");
					balance -= scanner.nextInt();
				}
				case 3 -> {
					System.out.println("�ܰ�> " + balance);
				}
				case 4 -> {
					run = false;
				}
			}			
		}
		System.out.println("���α׷� ����");
	}
}