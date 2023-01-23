package ch07;

public class SupersonicAirplane extends Airplane {
  // �긽�닔 �꽑�뼵
  public static final int NOMAL = 1;
  public static final int SUPERSONIC = 2;

  // �긽�깭 �븘�뱶 �꽑�뼵
  public int flyMode = NOMAL;

  // 硫붿냼�뱶 �옱�젙�쓽
  @Override
  public void fly() {
    if (flyMode == SUPERSONIC) {
      System.out.println("珥덉쓬�냽 鍮꾪뻾�빀�땲�떎.");
    } else {
      // Airplane 媛앹껜�쓽 fly() 硫붿냼�뱶 �샇異�
      super.fly();
    }
  }
}