package ch05.sec03;

public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		int[] arr1; //�迭 ���� arr1 ����
		int[] arr2; //�迭 ���� arr2 ����
		int[] arr3; //�迭 ���� arr3 ����
		
		arr1 = new int[] {1, 2, 3}; //�迭 {1, 2, 3}�� ������ arr1 ������ ����
		arr2 = new int[] {1, 2, 3}; //�迭 {1, 2, 3}�� ������ arr2 ������ ����
		arr3 = arr2; //�迭 ���� arr2 ���� �迭 ���� arr3�� ����
		
		System.out.println(arr1 == arr2); //false, 1�� 2�� ���� �迭�� �������� ����
		System.out.println(arr2 == arr3); //true, 2�� 3�� ������ �迭�� ������
	}
}