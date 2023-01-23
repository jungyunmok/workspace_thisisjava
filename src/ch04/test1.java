package ch04;

public class test1 {
	public static void main(String[] args) {
		//�Ʒ��� switch ���� Expression(ǥ����)���� �����ϱ�
		String grade = "B";
		
		int score1 = 0;
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		System.out.println(score1);
		
		//Expression(ǥ����)���� ����
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				yield result;
			}
			default -> 60;
		};
		
		System.out.println(score2);
	}
}