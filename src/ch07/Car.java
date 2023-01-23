package ch07;

public class Car {
  // �븘�뱶 �꽑�뼵
  public int speed;

  // 硫붿냼�뱶 �꽑�뼵
  public void speedUp() {
    speed += 1;
  }

  // final 硫붿냼�뱶濡� �꽑�뼵
  public final void stop() {
    System.out.println("李⑤�� 硫덉땄");
    speed = 0;
  }
}