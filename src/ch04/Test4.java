package ch04;

public class Test4 {
	public static void main(String[] args) {
//		��ø�� for ���� �̿��� ������ 4x + 5y = 60�� ��� �ظ� ���ؼ�
//		(x, y) ���·� ���. ��, x�� y�� 10 ������ �ڿ���
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x + 5*y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
}