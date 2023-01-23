package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y); //x: 3, y: 5
		
		int temp = x; //변수 x값 3을 변수 temp에 대입
		x = y; //변수 y값 5를 변수 x에 대입
		y = temp; //변수 temp값 3을 변수 y에 대입
		System.out.println("x: " + x + ", y: " + y); //x: 5, y: 3
	}
}