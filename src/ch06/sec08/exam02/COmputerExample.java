package ch06.sec08.exam02;

public class COmputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer(); //Computer ��ü ����
		
//		sum() �޼ҵ� ȣ�� �� �Ű��� 1, 2, 3�� �����ϰ�
//		�ջ� ����� ���Ϲ޾� result1 ������ ����
		int result1 = myCom.sum(1, 2, 3);
		System.out.println(result1); //6
		
//		sum() �޼ҵ� ȣ�� �� �Ű��� 1, 2, 3, 4, 5�� �����ϰ�
//		�ջ� ����� ���Ϲ޾� result2 ������ ����
		int result2 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println(result2); //15
		
//		sum() �޼ҵ� ȣ�� �� ������ �����ϰ�
//		�ջ� ����� ���Ϲ޾� result3 ������ ����
		int[] values = { 1, 2, 3, 4, 5 };
		int result3 = myCom.sum(values);
		System.out.println(result3); //15
		
//		sum() �޼ҵ� ȣ�� �� �迭�� �����ϰ�
//		�ջ� ����� ���Ϲ޾� result4 ������ ����
		int result4 = myCom.sum(new int[] { 1, 2, 3, 4, 5 });
		System.out.println(result4); //15
	}
}