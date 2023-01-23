package ch02.sec04;

public class FloatDoubleExample {
	public static void main(String[] args) {
		float var1 = 0.1234567890123456789F;
		double var2 = 0.1234567890123456789;
		System.out.println(var1); //0.12345679
		System.out.println(var2); //0.12345678901234568
		//double타입이 float 타입보다 약 2배정도의 유효 자릿수를 가짐
		
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println(var3); //3000000.0
		System.out.println(var4); //3000000.0
		System.out.println(var5); //0.002
	}
}