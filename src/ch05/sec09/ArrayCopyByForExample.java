package ch05.sec09;
 
public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 }; //길이 3인 배열
		int[] newIntArray = new int[5]; //길이 5인 배열을 새로 생성
		
//		배열 항목 복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
//		배열 항목 출력, 복사되지 않은 항목은 0(int배열의 항목 초기값)
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", "); //1, 2, 3, 0, 0,
		}
	}
}