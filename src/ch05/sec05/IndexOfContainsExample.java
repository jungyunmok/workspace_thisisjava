package ch05.sec05;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		String substring = subject.substring(location); //3
		System.out.println(substring); //���α׷���
		
		location = subject.indexOf("�ڹ�");
		if(location != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		} else {
			System.out.println("�ڹٿ� ���� ���� å�̱���.");
		}
//		�ڹٿ� ���õ� å�̱���.
		
		boolean result = subject.contains("�ڹ�");
		if(result) {
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		} else {
			System.out.println("�ڹٿ� ���� ���� å�̱���.");
		}
//		�ڹٿ� ���õ� å�̱���.
	}
}