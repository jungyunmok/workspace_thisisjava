package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); //Car 객체 생성
		
//		Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model); //null
		System.out.println("시동여부: " + myCar.start); //false
		System.out.println("현재속도: " + myCar.speed); //0
	}
}