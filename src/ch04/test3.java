package ch04;

public class test3 {
	public static void main(String[] args) {
//		while 문과 Math.random() 메소드를 이용해 주사위 던졌을 때 나오는 눈을
//		(눈1, 눈2) 형태로 출력하고, 합이 5일때만 실행을 멈추는 코드
		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.print("(" + num1 + ", " + num2 + ")");
			System.out.println();
			
			if(num1 + num2 == 5) {
				break;
			}
		}
	}
}