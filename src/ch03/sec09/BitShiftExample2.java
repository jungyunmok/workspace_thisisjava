package ch03.sec09;

public class BitShiftExample2 {
	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2, 3);
		//Math.pow(2, 3)�� 2^3�� �����ϰ� double���� ����
		//int ������ ��� �ʹٸ� (int)�� ĳ�����ؾ���
		System.out.println(result1); //8
		System.out.println(result2); //8
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println(result3); //-1
		System.out.println(result4); //-1
	}
}