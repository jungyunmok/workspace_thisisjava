package ch07;

public class SupersonicAirplaneExample {
  public static void main(String[] args) {
    SupersonicAirplane sa = new SupersonicAirplane();
    sa.takeOff();
    sa.fly();
    sa.flyMode = SupersonicAirplane.SUPERSONIC;
    sa.fly();
    sa.flyMode = SupersonicAirplane.NOMAL;
    sa.fly();
    sa.land();
  }
}

// �씠瑜숉빀�땲�떎.
// �씪諛� 鍮꾪뻾�빀�땲�떎.
// 珥덉쓬�냽 鍮꾪뻾�빀�땲�떎.
// �씪諛� 鍮꾪뻾�빀�땲�떎.
// 李⑸쪠�빀�땲�떎.