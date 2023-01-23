package ch05;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
//		키보드로부터 학생 수와 각 학생들의 점수를 입력받고
//		while문과 Scanner의 nextLine() 메소드를 이용해
//		최고 점수와 평균 점수를 출력하는 코드
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("----------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------");
			System.out.print("선택> ");
			int selectNum = scanner.nextInt(); //입력받은 숫자와 studentNum과 일치시키기위해 int로 선언
			
			if(selectNum == 1) {
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNum == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if(selectNum == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if(selectNum == 4) {
				int max = 0;
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					max = (max<scores[i])? scores[i] : max; //최고점수 고르기
					sum += scores[i];
				}
				double avg = sum / studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if(selectNum == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}