package ch04.sec07;
 
public class BreakExample {
	public static void main(String[] args) throws Exception{
		while(true) {
			int num = (int)(Math.random()*6) + 1; //주사위 1~6 뽑기
			System.out.println(num);
			if(num == 6) {
				break; //6이 나오면 while문 종료
			}
		}
		System.out.println("프로그램 종료");
	}
}