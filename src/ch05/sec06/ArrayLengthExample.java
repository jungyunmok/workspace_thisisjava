package ch05.sec06;

public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = { 84, 90, 96 }; //배열 변수 선언과 배열 대입
		
		int sum = 0; //배열 항목의 총합 구하기
		for(int i=0; i<scores.length; i++) { //length는 3
			sum += scores[i];
		}
		System.out.println("총합: " + sum); //270
		
		double avg = (double) sum / scores.length;
		System.out.println("평균: " + avg); //90.0
	}
}