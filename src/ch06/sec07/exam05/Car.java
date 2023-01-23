package ch06.sec07.exam05;

public class Car {
//	필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model) {
		this(model, "은색", 250); //18라인 생성자 호출
	}
	
	Car(String model, String color) {
		this(model, color, 250); //18라인 생성자 호출
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}