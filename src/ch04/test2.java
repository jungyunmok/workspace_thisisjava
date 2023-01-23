package ch04;

public class test2 {
	public static void main(String[] args) {
		//for문을 이용해 1~100까지 정수 중 3의 배수의 총합을 출력하기
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum); //1683
	}
}