package ch03.sec07;

public class LogicalOperatorExample {
	public static void main(String[] args) {
//		int charCode = 'A'; //�빮���Դϴ�.
//		int charCode = 'a'; //�ҹ����Դϴ�.
		int charCode = '5'; //0~9 �����Դϴ�.
		
		if( (65<=charCode) & (charCode<=90) ) {
			System.out.println("�빮���Դϴ�.");
		}
		
		if( (97<=charCode) && (charCode<=122) ) {
			System.out.println("�ҹ����Դϴ�.");
		}
		
		if( (45<=charCode) && (charCode<=57) ) {
			System.out.println("0~9 �����Դϴ�.");
		}
		
//		int value = 6; //2 �Ǵ� 3�� ����Դϴ�.
		int value = 7; //2 �Ǵ� 3�� ����� �ƴմϴ�.
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 �Ǵ� 3�� ����Դϴ�.");
		}
		
		boolean result = (value%2==0) || (value%3==0);
		if( !result ) {
			System.out.println("2 �Ǵ� 3�� ����� �ƴմϴ�.");
		}
	}
}