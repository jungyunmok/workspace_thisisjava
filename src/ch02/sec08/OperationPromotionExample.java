package ch02.sec08;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20; //������ �ܰ迡�� ����
		System.out.println(result1); //30
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2; //int Ÿ������ ��ȯ �� ����
		System.out.println(result2); //30
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5; //long Ÿ������ ��ȯ �� ����
		System.out.println(result3); //1110
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7; //int Ÿ������ ��ȯ �� ����
		System.out.println(result4); //66
		System.out.println((char)result4); //B
		
		int v8 = 10;
		int result5 = v8 / 4; //���� ������ ����� ����
		System.out.println(result5); //2
		
		int v9 = 10;
		double result6 = v9 / 4.0; //double Ÿ������ ��ȯ �� ����
		System.out.println(result6); //2.5
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11; //double Ÿ������ ��ȯ �� ����
		System.out.println(result7); //0.5
	}
}