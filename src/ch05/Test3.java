package ch05;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
//		Ű����κ��� �л� ���� �� �л����� ������ �Է¹ް�
//		while���� Scanner�� nextLine() �޼ҵ带 �̿���
//		�ְ� ������ ��� ������ ����ϴ� �ڵ�
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("----------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------");
			System.out.print("����> ");
			int selectNum = scanner.nextInt(); //�Է¹��� ���ڿ� studentNum�� ��ġ��Ű������ int�� ����
			
			if(selectNum == 1) {
				System.out.print("�л���>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNum == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if(selectNum == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if(selectNum == 4) {
				int max = 0;
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					max = (max<scores[i])? scores[i] : max; //�ְ����� ����
					sum += scores[i];
				}
				double avg = sum / studentNum;
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
			} else if(selectNum == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}