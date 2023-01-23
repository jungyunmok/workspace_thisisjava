package ch05.sec06;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3]; //배열 변수 선언과 배열 생성
		for(int i=0; i<3; i++) { //배열 항목의 초기값 출력
			System.out.print("arr[" + i + "]: " + arr1[i] + ", ");			
		}
		System.out.println();
		
		arr1[0] = 10; //배열 항목의 값 변경
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3; i++) { //배열 항목의 변경 값 출력
			System.out.print("arr[" + i + "]: " + arr1[i] + ", ");
		}
		System.out.println("\n");
		
		
		double[] arr2 = new double[3]; //배열 변수 선언과 배열 생성
		for(int i=0; i<3; i++) { //배열 항목의 초기값 출력
			System.out.print("arr2[" + i + "]: " + arr2[i] + ", ");
		}
		System.out.println();
		
		arr2[0] = 0.1; //배열 항목의 값 변경
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for(int i=0; i<3; i++) { //배열 항목의 변경 값 출력
			System.out.print("arr2[" + i + "]: " + arr2[i] + ", ");
		}
		System.out.println("\n");
		
		
		String[] arr3 = new String[3]; //배열 변수 선언과 배열 생성
		for(int i=0; i<3; i++) { //배열 항목의 초기값 출력
			System.out.print("arr3[" + i + "]: " + arr3[i] + ", ");
		}
		System.out.println();
		
		arr3[0] = "1월"; //배열 항목의 값 변경
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for(int i = 0; i<3; i++) {
			System.out.print("arr3[" + i + "]: " + arr3[i] + ", ");
		}
//		arr[0]: 0, arr[1]: 0, arr[2]: 0, 
//		arr[0]: 10, arr[1]: 20, arr[2]: 30, 
//
//		arr2[0]: 0.0, arr2[1]: 0.0, arr2[2]: 0.0, 
//		arr2[0]: 0.1, arr2[1]: 0.2, arr2[2]: 0.3, 
//
//		arr3[0]: null, arr3[1]: null, arr3[2]: null, 
//		arr3[0]: 1월, arr3[1]: 2월, arr3[2]: 3월, 
	}
}