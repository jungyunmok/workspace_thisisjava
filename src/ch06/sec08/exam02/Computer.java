package ch06.sec08.exam02;

public class Computer {
//	�������� �Ű������� ���� �޼ҵ� ����
	int sum(int ... values) {
		int sum = 0; //sum ���� ����
		
//		values�� �迭 Ÿ���� ����ó�� ���
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum; //�ջ� ����� ����
	}
}