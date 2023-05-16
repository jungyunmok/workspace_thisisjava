package ch05;
 
public class Test2 {
	public static void main(String[] args) {
//		중첩 for 문을 이용해 배열 항목의 전체 합과 평균을 출력하는 코드
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double) sum / count;
		
		System.out.println(sum); //총합 881
		System.out.println(avg); //평균 88.1
	}
}