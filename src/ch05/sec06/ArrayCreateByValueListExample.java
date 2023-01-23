package ch05.sec06;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
//		�迭 ���� ����� �迭 ����
		String[] season = { "Spring", "Summer", "Fall", "Winter" };
		
//		�迭�� �׸� �б�
		System.out.println(season[0]); //Spring
		System.out.println(season[1]); //Summer
		System.out.println(season[2]); //Fall
		System.out.println(season[3]); //Winter
		
//		�ε��� 1�� �׸��� �� ����
		season[1] = "����";
		System.out.println(season[1]); //����
		System.out.println();
		
//		�迭 ���� ����� �迭 ����
		int[] scores = { 83, 90, 87};
		
//		���հ� ��� ���ϱ�
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("����: " + sum); //260
		double avg = (double) sum / 3;
		System.out.println("��� " + avg); //86.66666666666667
	}
}