package ch08.sec04;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		// Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn(); // TV를 켭니다.
		rc.setVolume(5); // 현재 TV 볼륨: 5
		rc.turnOff(); // TV를 끕니다.
		
		// Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn(); // Audio를 켭니다.
		rc.setVolume(5); // 현재 Audio 볼륨: 5
		rc.turnOff(); // Audio를 끕니다.
	}
}