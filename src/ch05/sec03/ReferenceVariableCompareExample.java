package ch05.sec03;
 
public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		int[] arr1; //배열 변수 arr1 선언
		int[] arr2; //배열 변수 arr2 선언
		int[] arr3; //배열 변수 arr3 선언
		
		arr1 = new int[] {1, 2, 3}; //배열 {1, 2, 3}을 생성해 arr1 변수에 대입
		arr2 = new int[] {1, 2, 3}; //배열 {1, 2, 3}을 생성해 arr2 변수에 대입
		arr3 = arr2; //배열 변수 arr2 값을 배열 변수 arr3에 대입
		
		System.out.println(arr1 == arr2); //false, 1과 2가 같은 배열을 참조하지 않음
		System.out.println(arr2 == arr3); //true, 2와 3이 동일한 배열을 참조함
	}
}