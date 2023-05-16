package ch04;
 
public class Test1 {
	public static void main(String[] args) {
		//아래의 switch 문을 Expression(표현식)으로 변경하기
		String grade = "B";
		
		int score1 = 0;
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		System.out.println(score1); //80
		
		//Expression(표현식)으로 변경
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				yield result;
			}
			default -> 60;
		};
		
		System.out.println(score2); //80
	}
}