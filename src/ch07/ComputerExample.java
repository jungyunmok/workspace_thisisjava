package ch07;

public class ComputerExample {
  public static void main(String[] args) {
    int r = 10;

    Caculator caculator = new Caculator();
    System.out.println("�썝�쓽 硫댁쟻: " + caculator.areaCircle(r));
    System.out.println();

    Computer computer = new Computer();
    System.out.println("�썝�쓽 硫댁쟻: " + computer.areaCircle(r));
  }
}

// Caculator 媛앹껜�쓽 areaCircle() �떎�뻾
// �썝�쓽 硫댁쟻: 314.159

// Computer 媛앹껜�쓽 areaCircle() �떎�뻾
// �썝�쓽 硫댁쟻: 314.1592653589793