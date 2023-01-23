package ch04;

public class Test5 {
	public static void main(String[] args) {
//		for문을 이용해 아래의 문자를 출력
//		*
//		**
//		***
//		****
//		*****
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
				if(i == j) {
					System.out.println();
				}
			}
		}
	}
}