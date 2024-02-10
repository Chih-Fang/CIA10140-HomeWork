package hw5_Feb07;

import java.security.spec.XECPublicKeySpec;

public class Square {

	
	public void starSquare(int width,int height) {
		
		for(int y=0;y<=height;y++) {
			for(int x=0;x<=width;x++) {
				
				System.out.print("*");
			}
		    System.out.println();
		}
		
		
	}
	
//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//	圖:
	public static void main(String[] args) {
		
    Square test =new Square();
    
    test.starSquare(7, 7);
	}

}
