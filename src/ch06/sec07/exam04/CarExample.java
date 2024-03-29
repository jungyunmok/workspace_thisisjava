package ch06.sec07.exam04;
 
public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car(); //생성자1 호출
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용"); //생성자2 호출, String 입력
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강"); //생성자3 호출, String String 입력
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();
		
		Car car4 = new Car("자가용", "검정", 200); //생성자3 호출, String String int 입력
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
		System.out.println();
	}
	
//	car1.company: 현대자동차
//
//	car2.company: 현대자동차
//	car2.model: 자가용
//
//	car3.company: 현대자동차
//	car3.model: 자가용
//	car3.color: 빨강
//
//	car4.company: 현대자동차
//	car4.model: 자가용
//	car4.color: 검정
//	car4.maxSpeed: 200
}