package ch07;

public class Phone {
  // �븘�뱶 �꽑�뼵
  public String model;
  public String color;

  // 留ㅺ컻蹂��닔瑜� 媛뽯뒗 �깮�꽦�옄 �꽑�뼵
  public Phone(String model, String color) {
    this.model = model;
    this.color = color;
    System.out.println("Phone(String model, String color) �깮�꽦�옄 �떎�뻾");
  }
}