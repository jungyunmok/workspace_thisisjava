package ch03.sec09;
 
public class BitShiftExample2 {
	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2, 3);
		//Math.pow(2, 3)은 2^3을 연산하고 double값을 산출
		//int 값으로 얻고 싶다면 (int)로 캐스팅해야함
		System.out.println(result1); //8
		System.out.println(result2); //8
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println(result3); //-1
		System.out.println(result4); //-1
	}
}