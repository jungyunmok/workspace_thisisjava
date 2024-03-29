package ch02.sec12;
 
import java.util.Scanner;
 
public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) { //중괄호 {} 안을 무한히 반복 실행
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) { //입력 문자열이 q라면 반복을 중지
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println("종료");
	}
}