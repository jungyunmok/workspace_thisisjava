package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 }; //�迬 ���� ����� �迭 ����
		
//		�迭 �׸� ��ü �� ���ϱ�
		int sum = 0;
		for(int score : scores) { //5�׸��� �� ���� score ������
			sum = sum + score; //����ǰ� sum�� ������(�ݺ� Ƚ��: 5)
		}
		System.out.println("���� ����= " + sum); //430
		
//		�迭 �׸� ��ü ��� ���ϱ�
		double avg = (double) sum / scores.length;
		System.out.println("���� ���= " + avg); //86.0
	}
}