package ch04;

public class test3 {
	public static void main(String[] args) {
//		while ���� Math.random() �޼ҵ带 �̿��� �ֻ��� ������ �� ������ ����
//		(��1, ��2) ���·� ����ϰ�, ���� 5�϶��� ������ ���ߴ� �ڵ�
		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.print("(" + num1 + ", " + num2 + ")");
			System.out.println();
			
			if(num1 + num2 == 5) {
				break;
			}
		}
	}
}