package ch06.sec11.exam01;

public class Korean {
//	인스턴스 final 필드 선언
	final String nation = "대한민국"; //고정값이므로 선언 시에 초기값을 대입
	final String ssn; //Korean 객체가 생성될 때 부여되므로 생성자 매개값으로
	                  //주민등록번호를 받아 초기값으로 대입함
	
//	인스턴스 필드 선언
	String name;
	
//	생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}