package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) throws Exception{
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { //홀수인 경우, 2로 나눈 나머지가 0이 아닌 경우
				continue; //증감식으로 바로 이동, 짝수만 출력됨
			}
			System.out.print(i + " "); //2 4 6 8 10 
		}
	}
}