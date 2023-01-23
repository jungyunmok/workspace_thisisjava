package ch02.sec01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		int value; //변수 value 선언
		
//		int result = value + 10; //변수 value 값을 읽고 10으르 더해서 변수 result에 저장
		//잘못된 선언!, 초기화되지 않은 변수는 아직 메모리할당X, 메모리값 읽을 수 없음!!
		
		value = 30; //변수 value가 30으로 초기화됨
		int result = value + 10; //변수 value값(30)을 읽고 10을 더해서 변수 result에 저장
		
		System.out.println(result); //40
	}
}