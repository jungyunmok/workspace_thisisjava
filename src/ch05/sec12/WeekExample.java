package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		Week today = null; //Weel Ÿ�� ���� today ����
		
		Calendar cal = Calendar.getInstance(); //Calendar �� ����
		
		int week = cal.get(Calendar.DAY_OF_WEEK); //������ ���� ���(1~7)
		
//		���ڸ� ���� ����� ��ȯ�ؼ� ������ ����
		switch(week) {
			case 1: today = Week.SUNDAY ;		break;
			case 2: today = Week.MONDAY ;		break;
			case 3: today = Week.TUESDAY ;		break;
			case 4: today = Week.WEDNESDAY ;	break;
			case 5: today = Week.THURDAY ;		break;
			case 6: today = Week.FRIDAY ;		break;
			case 7: today = Week.SATURDAY ;		break;
		}
		
//		���� Ÿ�� ������ ���
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		} else {
			System.out.println("������ �ڹٸ� �����մϴ�.");
		}
		
//		������ �ڹٸ� �����մϴ�.
	}
}