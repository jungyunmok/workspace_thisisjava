package ch06.sec07.exam05;

public class Car {
//	�ʵ� ����
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model) {
		this(model, "����", 250); //18���� ������ ȣ��
	}
	
	Car(String model, String color) {
		this(model, color, 250); //18���� ������ ȣ��
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}