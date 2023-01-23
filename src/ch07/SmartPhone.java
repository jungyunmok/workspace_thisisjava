package ch07;

public class SmartPhone extends Phone {
  // �옄�떇 �깮�꽦�옄 �꽑�뼵
  public SmartPhone(String model, String color) {
    super(model, color); // 諛섎뱶�떆 �옉�꽦�빐�빞 �븿
    System.out.println("SmartPhone(String model, String color) �깮�꽦�옄 �떎�뻾");
  }
}
