package dev_java.this_is_java.ch07;

public class SportsCar extends Car{
  @Override
  public void speedUp() {
    speed += 10;
  }

  // Car 클래스의 stop() 메소드를 final로 선언했기에
  // 자식 클래스인 SportCar에서 stop() 메소드를 오버라이딩 할 수 없음!
  // @Override
  // public void stop() {
  //   System.out.println("스포츠카를 멈충");
  //   speed = 0;
  // }
}