package ch03.sec03;

public class OverflowUnderflowExample {
	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) { //{}를 5번 반복 실행
			var1++; //var1의 값 1 증가
			System.out.println(var1); //126, 127, -128, -127, -126
		}
		
		System.out.println("=====");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--; //var2의 값 1 감소
			System.out.println(var2); //-126, -127, -128, 127, 126
		}
	}
}