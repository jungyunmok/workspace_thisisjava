package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores; //�迭 ���� ����
		scores = new int[] { 83, 90, 87 }; //�迭 ������ �迭�� ����
		
		int sum1 = 0;
		for(int i=0; i<3; i++) { //�迭 �׸��� ������ ���ϰ� ���
			sum1 += scores[i];
		}
		System.out.println("����: " + sum1); //260
		
		printItem( new int[] {83, 90, 87} ); //�迭�� �Ű������� �ְ�, printItem() �޼ҵ� ȣ��
	}
	
	public static void printItem( int[] scores) { //printItem() �޼ҵ� ����
		for(int i=0; i<3; i++) { //�Ű������� �����ϴ� �迭�� �׸��� ���
			System.out.println("score[" + i + "]: " + scores[i]);
		}
//		score[0]: 83
//		score[1]: 90
//		score[2]: 87
	}
}