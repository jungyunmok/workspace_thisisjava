package ch03.sec03;

public class OverflowUnderflowExample {
	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) { //{}�� 5�� �ݺ� ����
			var1++; //var1�� �� 1 ����
			System.out.println(var1); //126, 127, -128, -127, -126
		}
		
		System.out.println("=====");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--; //var2�� �� 1 ����
			System.out.println(var2); //-126, -127, -128, 127, 126
		}
	}
}