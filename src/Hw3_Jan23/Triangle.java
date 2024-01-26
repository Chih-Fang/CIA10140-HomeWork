package Hw3_Jan23;

import java.util.Scanner;

//1.請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
////三角形、其它三角形或不是三角形,如圖示結果:

//(進階功能:加入直角三角形的判斷)
public class Triangle {

	public static void triangleSide(int a[]) {
		if(a[0]==a[1]&&a[1]==a[2]) {
			 System.out.println("這是正三角形");
			 
		 }else if(a[0]==a[1]||a[1]==a[2]||a[0]==a[2]){
			 System.out.println("這是等腰三角形");
			 
			 
		 }else if(a[0]==0||a[1]==0||a[2]==0){
			 System.out.println("這不是三角形");
			 
		 }else if(a[0]!=a[1] && a[2]!=a[1]){
			 
			 System.out.println("其他三角形");
			 
			if(Math.pow(a[0], 2)+Math.pow(a[1], 2)==Math.pow(a[2], 2) ||Math.pow(a[1], 2)+Math.pow(a[2], 2)==Math.pow(a[0], 2)
				||	Math.pow(a[0], 2)+Math.pow(a[2], 2)==Math.pow(a[1], 2)	)
			 {
		 System.out.println("這也是直角三角");
		 
			 }
 }
		 
			 
			

		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		

		int triangle[] = new int[3];
		for (int a = 0; a < triangle.length; a++) {
			triangle[a] = sc.nextInt();

		}
		triangleSide(triangle);



	}

}
