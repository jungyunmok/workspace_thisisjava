package ch04;

public class test2 {
	public static void main(String[] args) {
		//for���� �̿��� 1~100���� ���� �� 3�� ����� ������ ����ϱ�
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum); //1683
	}
}