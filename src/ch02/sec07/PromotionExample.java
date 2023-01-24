package ch02.sec07;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue); //10
		
//		char charValue = '媛�';
//		intValue = charValue;
		System.out.println("媛��쓽 �쑀�땲肄붾뱶: " + intValue); //44032
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue); //50
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValur: " + floatValue); //100.0
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue); //100.5
	}
}