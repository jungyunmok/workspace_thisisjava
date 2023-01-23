package dev_java.this_is_java.ch07;

public class ComputerExample {
  public static void main(String[] args) {
    int r = 10;

    Caculator caculator = new Caculator();
    System.out.println("원의 면적: " + caculator.areaCircle(r));
    System.out.println();

    Computer computer = new Computer();
    System.out.println("원의 면적: " + computer.areaCircle(r));
  }
}

// Caculator 객체의 areaCircle() 실행
// 원의 면적: 314.159

// Computer 객체의 areaCircle() 실행
// 원의 면적: 314.1592653589793