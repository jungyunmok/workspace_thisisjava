package dev_java.this_is_java.ch07;

public class Computer extends Caculator {
  // 메소드 오버라이딩
  @Override // 컴파일 시 정확히 오버라이딩이 되었는지 체크해줌(생략 가능)
  public double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle() 실행");
    return Math.PI * r * r;
  }
}