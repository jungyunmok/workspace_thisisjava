package dev_java.this_is_java.ch07.package2; //A와 다른 패키지

import dev_java.this_is_java.ch07.A;

public class D extends A { // protected여도 상속을 통해서 접근 가능
  // 생성자 선언
  public D() {
    // A() 생성자 호출
    super(); // 자식 생성자에서 super()로 A 생성자 호출
  }

  // 메소드 선언
  public void method1() {
    // A 필드값 변경
    this.field = "value";
    // A 메소드 호출
    this.method();
  }

  // // 메소드 선언
  // public void method2() { // 직접 객체를 생성해서 사용하는 것은 안 됨!
  //   A a = new A(); // new 연산자를 사용해 생성자를 직접 호출할 수 없음
  //   a.field = "value";
  //   a.method();
  // }
}