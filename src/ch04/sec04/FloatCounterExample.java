package ch04.sec04;
 
public class FloatCounterExample {
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
			
//			0.1
//			0.2
//			0.3
//			0.4
//			0.5
//			0.6
//			0.70000005
//			0.8000001
//			0.9000001
//			부동 소수점 방식의 float 타입은 연산 과정에서 정확히 0.1을 표현하지
//			못하기 때문에 증감식에서 x에 더해지는 실제 값은 0.1보다 약간 클 수 있다
//			따라서 최종 반복 횟수는 9번이 된다
		}
	}
}