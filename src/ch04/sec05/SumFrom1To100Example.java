package ch04.sec05;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0; //�հ� ����
		
		int i = 1; //ī���� ����
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + "�� ��: " +sum);
		//1~100�� ��: 5050
	}
}