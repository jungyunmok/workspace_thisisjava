package ch05.sec06;

public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = { 84, 90, 96 }; //�迭 ���� ����� �迭 ����
		
		int sum = 0; //�迭 �׸��� ���� ���ϱ�
		for(int i=0; i<scores.length; i++) { //length�� 3
			sum += scores[i];
		}
		System.out.println("����: " + sum); //270
		
		double avg = (double) sum / scores.length;
		System.out.println("���: " + avg); //90.0
	}
}