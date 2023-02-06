package ch07.sec09;

public class InstanofExample {
//	main() �޼ҵ忡�� �ٷ� ȣ���ϱ����� ���� �޼ҵ� ����
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();

//		person�� �����ϴ� ��ü�� Student Ÿ������ Ȯ��
//		�Ű����� Student�� ��쿡�� ����Ÿ�Ժ�ȯ, �ʵ� �޼ҵ� ���
		/*if (person instanceof Student) {
//			Student ��ü�� ��� ���� Ÿ�� ��ȯ
			Student student = (Student) person;
//			Student ��ü�� ������ �ִ� �ʵ� �� �޼ҵ� ���
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}*/
		
//		person�� �����ϴ� ��ü�� Student Ÿ���� ���
//		student ������ ����, Ÿ�� ��ȯ �߻�(Java12���� ��� ����)
		if(person instanceof Student) {
			Student student = (Student) person;
			System.out.println("studentNo:" + student.studentNo);
			student.study();
		}
	}

	public static void main(String[] args) {
//		Person ��ü�� �Ű������� �����ϰ� personInfo() �޼ҵ� ȣ��
		Person p1 = new Person("ȫ�浿");
		personInfo(p1);
//		name: ȫ�浿
//		�Ƚ��ϴ�.
		
		System.out.println();
		
//		Student ��ü�� �Ű������� �����ϰ� personInfo() �޼ҵ� ȣ��
		Person p2 = new Student("��浿", 10);
		personInfo(p2);
//		name: ��浿
//		�Ƚ��ϴ�.
//		studentNo:10
//		���θ� �մϴ�.
	}
}