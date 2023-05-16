package ch06.sec10.exam02;
 
public class Television { //3개의 정적 필드를 가지고있는 Television
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	static { //정적 블록
		info = company + "-" + model;
	}
}