package ch05.sec05;

public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr = "�ڹ� ���ڿ��� �Һ��Դϴ�. �ڹ� ���ڿ��� String�Դϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldStr); //�ڹ� ���ڿ��� �Һ��Դϴ�. �ڹ� ���ڿ��� String�Դϴ�.
		System.out.println(newStr); //JAVA ���ڿ��� �Һ��Դϴ�. JAVA ���ڿ��� String�Դϴ�.
	}
}