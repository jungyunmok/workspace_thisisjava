package ch07;

public class SmartPhoneExample {
  public static void main(String[] args) {
    // SmartPhone 媛앹껜 �깮�꽦
    SmartPhone myPhone = new SmartPhone("媛ㅻ윮�떆", "���깋");

    // Phone�쑝濡쒕��꽣 �긽�냽諛쏆� �븘�뱶 �씫湲�
    System.out.println("紐⑤뜽: " + myPhone.model);
    System.out.println("�깋�긽: " + myPhone.color);
  }
}

// Phone(String model, String color) �깮�꽦�옄 �떎�뻾
// SmartPhone(String model, String color) �깮�꽦�옄 �떎�뻾
// 紐⑤뜽: 媛ㅻ윮�떆
// �깋�긽: ���깋