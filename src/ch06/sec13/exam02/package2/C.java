package ch06.sec13.exam02.package2; //A, B와 패키지가 다름
 
import ch06.sec13.exam02.package1.*;
 
public class C {
//	필드 선언
	A a1 = new A(true);
//	A a2 = new A(1); //컴파일 에러!, default 생성자 접근 불가
//	A a3 = new A("문자열"); //컴파일 에러!, private 생성자 접근 불가
}