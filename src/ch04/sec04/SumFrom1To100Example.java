package ch04.sec04;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0; //�հ� ����
		int i; //ī���� ����
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + "�� ��: " + sum);
		//1~100�� ��: 5050
	}
}