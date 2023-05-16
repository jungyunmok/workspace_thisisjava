package ch02.sec03;
 
public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A'; //문자 저장
		char c2 = 65; //유니코드 직접 저장
		
		char c3 = '가'; //문자 저장
		char c4 = 44032; //유니코드 직접 저장
		
		System.out.println(c1); //A
		System.out.println(c2); //A
		System.out.println(c3); //가
		System.out.println(c4); //가
		
//		char c = ''; //컴파일 에러, 초기화할땐 공백을 포함해야 에러안남
		char c = ' '; //공백 하나를 포함해서 초기화
	}
}