package ch04;
 
public class Test7 {
	public static void main(String[] args) {
//		**** 
//		**** 
//		**** 
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("=====");
		
//		*
//		**
//		***
//		****
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====");
		
//		    *
//		   **
//		  ***
//		 ****
		for(int i=1; i<5; i++) {
			for(int j=4; j>0; j--) {
				if(i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("=====");
		
//		    *
//		   ***
//		  *****
//		 *******
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====");
		
//		    *
//		   ***
//		  *****
//		 *******
//		  *****
//		   ***
//		    *
		for(int i=0; i<4; i++) {   
            for(int j=0; j<3-i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i*2+1; j++) { //나머지 별 한방에채우기.
                System.out.print("*"); 
            }
            System.out.println();
        }
        for(int i=3; i>0; i--) {
            for (int j=4; j>i; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<i*2-1; j++) {
                System.out.print("*"); 
            }
            System.out.println();
		}
	}
}