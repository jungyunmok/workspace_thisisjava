package ch04;
 
import java.util.Scanner;
 
public class Test6 {
	public static void main(String[] args) {
//		while 문과 Scanner의 nextLine() 메소드를 이용해 키보드로부터
//		입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("---------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 3. 종료");
			System.out.println("---------------");
			System.out.print("선택> ");
			
			int menuNum = scanner.nextInt();
			
			switch(menuNum) {
				case 1 -> {
					System.out.print("예금액> ");
					balance += scanner.nextInt();
				}
				case 2 -> {
					System.out.print("출금액> ");
					balance -= scanner.nextInt();
				}
				case 3 -> {
					System.out.println("잔고> " + balance);
				}
				case 4 -> {
					run = false;
				}
			}			
		}
		System.out.println("프로그램 종료");
	}
}