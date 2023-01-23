package ch07;

public class Computer extends Caculator {
  // 硫붿냼�뱶 �삤踰꾨씪�씠�뵫
  @Override // 而댄뙆�씪 �떆 �젙�솗�엳 �삤踰꾨씪�씠�뵫�씠 �릺�뿀�뒗吏� 泥댄겕�빐以�(�깮�왂 媛��뒫)
  public double areaCircle(double r) {
    System.out.println("Computer 媛앹껜�쓽 areaCircle() �떎�뻾");
    return Math.PI * r * r;
  }
}