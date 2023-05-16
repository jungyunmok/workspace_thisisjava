package ch06.sec13.exam03.package2; //A, B와 다른 패키지
 
import ch06.sec13.exam03.package1.A;
 
public class C {
	public C() {
//		객체 생성
		A a = new A();
		
//		필드값 변경
		a.field1 = 1;
//		a.field2 = 1; //컴파일 에러, default 필드 접근 불가
//		a.field3 = 1; //private 피드 접근 불가
		
//		메소드 호출
		a.method1();
//		a.method2(); //컴파일 에러, default 메소드 접근 불가
//		a.method3(); //컴파일 에러, private 메소드 접근 불가
	}
}