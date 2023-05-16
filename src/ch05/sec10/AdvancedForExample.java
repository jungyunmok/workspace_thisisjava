package ch05.sec10;
 
public class AdvancedForExample {
 
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 }; //배연 변수 선언과 배열 생성
		
//		배열 항목 전체 합 구하기
		int sum = 0;
		for(int score : scores) { //5항목이 한 번씩 score 변수에
			sum = sum + score; //저장되고 sum에 누적됨(반복 횟수: 5)
		}
		System.out.println("점수 총합= " + sum); //430
		
//		배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균= " + avg); //86.0
	}
}