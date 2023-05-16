package ch03.sec09;
 
public class BitShiftExample {
	public static void main(String[] args) {
		int value = 772; //00000000 00000000 00000011 00000100
		
		//우측으로 24bit 이동하고 끝 1바이트만 읽음, 00000000
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;
		System.out.println(int1); //0
		
		//우측으로 16bit 이동하고 끝 1바이트만 읽음, 00000000
		byte byte2 = (byte) (value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println(int2); //0
		
		//우측으로 8bit 이동하고 끝 1바이트만 읽음, 00000011
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;
		System.out.println(int3); //3
		
		//끝 1바이트만 읽음, 00000100
		byte byte4 = (byte) value;
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.println(int4); //4
	}
}