package ch07.package2; //A�� �떎瑜� �뙣�궎吏�

import ch07.A;

public class D extends A { // protected�뿬�룄 �긽�냽�쓣 �넻�빐�꽌 �젒洹� 媛��뒫
  // �깮�꽦�옄 �꽑�뼵
  public D() {
    // A() �깮�꽦�옄 �샇異�
    super(); // �옄�떇 �깮�꽦�옄�뿉�꽌 super()濡� A �깮�꽦�옄 �샇異�
  }

  // 硫붿냼�뱶 �꽑�뼵
  public void method1() {
    // A �븘�뱶媛� 蹂�寃�
    this.field = "value";
    // A 硫붿냼�뱶 �샇異�
    this.method();
  }

  // // 硫붿냼�뱶 �꽑�뼵
  // public void method2() { // 吏곸젒 媛앹껜瑜� �깮�꽦�빐�꽌 �궗�슜�븯�뒗 寃껋� �븞 �맖!
  //   A a = new A(); // new �뿰�궛�옄瑜� �궗�슜�빐 �깮�꽦�옄瑜� 吏곸젒 �샇異쒗븷 �닔 �뾾�쓬
  //   a.field = "value";
  //   a.method();
  // }
}