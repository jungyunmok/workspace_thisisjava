package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		int[][] scores = { //2���� �迭 ����
				{ 80, 90, 96 },
				{ 76, 88 }
		};
		
		System.out.println("1���� �迭 ����(���� ��): " + scores.length); //2
		System.out.println("2���� �迭 ����(ù��° ���� �л� ��): " + scores[0].length); //3
		System.out.println("2���� �迭 ����(�ι�° ���� �л� ��): " + scores[1].length); //2
		
//		ù��° ���� ����° �л��� ����
		System.out.println(scores[0][2]); //96
		
//		�ι�° ���� �ι�° �л��� ����
		System.out.println(scores[1][1]); //88
		
//		ù��° ���� ��� ����
		int class1Sum = 0;
		for(int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("ù���� ���� ��� ����: " + class1Avg); //88.66666666666667
		
//		�ι�° ���� ��� ����
		int class2Sum = 0;
		for(int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("�ι�° ���� ��� ����: " + class2Avg); // 82.0
		
//		��ü �л��� ��� ����
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<scores.length; i++) { //���� ����ŭ �ݺ�
			totalStudent += scores[i].length; //���� �л� �� �ջ�
			for(int k=0; k<scores[i].length; k++) { //�ش� ���� �л� ����ŭ �ݺ�
				totalSum += scores[i][k]; //�л� ���� �ջ�
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("��ü �л��� ��� ����: " + totalAvg); //86.0
	}
}