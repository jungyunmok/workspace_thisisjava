package ch07.sec09;
 
public class InstanofExample {
//	main() 메소드에서 바로 호출하기위해 정적 메소드 선언
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
 
//		person이 참조하는 객체가 Student 타입인지 확인
//		매개값이 Student인 경우에만 강제타입변환, 필드 메소드 사용
		/*if (person instanceof Student) {
//			Student 객체일 경우 강제 타입 변환
			Student student = (Student) person;
//			Student 객체만 가지고 있는 필드 및 메소드 사용
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}*/
		
//		person이 참조하는 객체가 Student 타입일 경우
//		student 변수에 대입, 타입 변환 발생(Java12부터 사용 가능)
		if(person instanceof Student) {
			Student student = (Student) person;
			System.out.println("studentNo:" + student.studentNo);
			student.study();
		}
	}
 
	public static void main(String[] args) {
//		Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p1 = new Person("홍길동");
		personInfo(p1);
//		name: 홍길동
//		걷습니다.
		
		System.out.println();
		
//		Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
//		name: 김길동
//		걷습니다.
//		studentNo:10
//		공부를 합니다.
	}
}