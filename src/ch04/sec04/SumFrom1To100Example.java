package ch04.sec04;
 
public class SumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0; //합계 변수
		int i; //카운터 변수
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + "의 합: " + sum);
		//1~100의 합: 5050
	}
}