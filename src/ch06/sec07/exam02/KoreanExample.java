package ch06.sec07.exam02;

public class KoreanExample {
	public static void main(String[] args) {
//		Korean ��ü ����
		Korean k1 = new Korean("���ڹ�", "011225-1234567");
		
//		Korean ��ü ������ �б�
		System.out.println("k1.nation: " + k1.nation);
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		System.out.println();
		
//		�� �ٸ� Korean ��ü ����
		Korean k2 = new Korean("���ڹ�", "930525-0654321");
		
//		�� �ٸ� Korean ��ü ������ �б�
		System.out.println("k2.nation: " + k2.nation);
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);
		System.out.println();
	}
	
//	k1.nation: ���ѹα�
//	k1.name: ���ڹ�
//	k1.ssn: 011225-1234567
//
//	k2.nation: ���ѹα�
//	k2.name: ���ڹ�
//	k2.ssn: 930525-0654321
}