package ch05;

public class Test1 {
	public static void main(String[] args) {
//		for 문을 이용해 배열 항목에서 최대값을 출력하는 코드
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);
	}
}