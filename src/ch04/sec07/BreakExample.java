package ch04.sec07;

public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1; //�ֻ��� 1~6 �̱�
			System.out.println(num);
			if(num == 6) {
				break; //6�� ������ while�� ����
			}
		}
		System.out.println("���α׷� ����");
	}
}