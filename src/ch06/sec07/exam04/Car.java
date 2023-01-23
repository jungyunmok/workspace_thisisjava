package ch06.sec07.exam04;

public class Car {
//	琶球 識情
	String company = "薄企切疑託";
	String model;
	String color;
	int maxSpeed;
	
//	持失切 識情
	Car() {} //持失切1
	
	Car(String model) { //持失切2
		this.model = model;
	}
	
	Car(String model, String color) { //持失切3
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) { //持失切4
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}