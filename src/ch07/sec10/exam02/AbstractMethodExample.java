package ch07.sec10.exam02;
 
public class AbstractMethodExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound(); // 멍멍
		
		Cat cat = new Cat();
		cat.sound(); // 야옹
		
//		매개변수의 다형성
		animalSound(new Dog()); // 자동 타입 변환
		animalSound(new Cat()); // 자동 타입 변환
//		멍멍
//		야옹
	}
	
	public static void animalSound(Animal animal) {
		animal.sound(); // 재정의된 메소드 호출
	}
}