package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 10000000000; //컴파일러는 기본적으로 int로 인식하기에 에러발생
		long var4 = 10000000000L; //int 허용범위 초과값은 l 혹은 L을 붙여 long타입값 인식시킴
		
		System.out.println(var1); //10
		System.out.println(var2); //20
		System.out.println(var4); //10000000000
	}
}