package ch03.sec01;

public class SIgnOperationExample {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println(x); //100
		
		byte b = 100;
		int y = -b;
		System.out.println(y); //-100
	}
}