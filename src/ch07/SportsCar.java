package ch07;

public class SportsCar extends Car{
  @Override
  public void speedUp() {
    speed += 10;
  }

  // Car �겢�옒�뒪�쓽 stop() 硫붿냼�뱶瑜� final濡� �꽑�뼵�뻽湲곗뿉
  // �옄�떇 �겢�옒�뒪�씤 SportCar�뿉�꽌 stop() 硫붿냼�뱶瑜� �삤踰꾨씪�씠�뵫 �븷 �닔 �뾾�쓬!
  // @Override
  // public void stop() {
  //   System.out.println("�뒪�룷痢좎뭅瑜� 硫덉땐");
  //   speed = 0;
  // }
}