package ch05.sec11;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2) { //�Էµ� ������ ������ 2���� �ƴ� ���
			System.out.println("���α׷� �Է°� ����");
			System.exit(0); //���α׷� ���� ����
		}
		
		String strNum1 = args[0]; //ù��° ������ ���
		String strNum2 = args[1]; //�ι�° ������ ���
		
		int num1 = Integer.parseInt(strNum1); //���ڿ��� ������ ��ȯ
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}