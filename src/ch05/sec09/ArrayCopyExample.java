package ch05.sec09;
 
public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" }; //길이 3인 배열
		String[] newStrArray = new String[5]; //길이 5인 배열을 새로 생성
		
//		배열 항목 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
//		배열 항목 출력, 복사되지 않은 부분은 null
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", "); //java, array, copy, null, null, 
		}
	}
}