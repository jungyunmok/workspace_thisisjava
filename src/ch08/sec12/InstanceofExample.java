package ch08.sec12;

public class InstanceofExample {
	public static void main(String[] args) {
		// 구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		// ride() 메소드 호출 시 구현 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	// 인터페이스 매개변수를 갖는 메소드
	public static void ride(Vehicle vehicle) {
		// 방법 1
		// 매개값이 Bus인 경우에만 강제타입변환하여 checkFare() 메소드 호출
		/*if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}*/
		
		// 방법 2
		// Java 12부터 사용 가능
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		
		vehicle.run();
	}
}

/*
택시가 달립니다.

승차요금을 체크합니다.
버스가 달립니다.
*/