package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) throws Exception{
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { //Ȧ���� ���, 2�� ���� �������� 0�� �ƴ� ���
				continue; //���������� �ٷ� �̵�, ¦���� ��µ�
			}
			System.out.print(i + " "); //2 4 6 8 10 
		}
	}
}