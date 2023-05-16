package ch03.sec05;
 
public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z1 = x / y; //Infinity
		double z2 = x % y; //NaN
		
		System.out.println(z1 + 2);
		System.out.println(z2 + 2);
		
		if(Double.isInfinite(z1) || Double.isNaN(z1)) { //둘 중 하나가 true면 true
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z1 + 2);
		}
	}
}