package dev_java.this_is_java.ch07; //A와 같은 패키지에서 protected 접근 가능

public class B {
  // 메소드 선언
  public void method() {
    A a = new A();
    a.field = "value";
    a.method();
  }
}