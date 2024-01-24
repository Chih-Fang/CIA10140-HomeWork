package hw1;

import java.util.Scanner;

public class HwJan23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

////	     1.請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
////			三角形、其它三角形或不是三角形,如圖示結果:
//	     int triangle[]=new int[3];
//	     for(int a=0;a<triangle.length;a++) {
//	      triangle[a]=sc.nextInt();
//	     }
//	     if(triangle[0]==triangle[1]&&triangle[1]==triangle[2]) {
//	    	 System.out.println("這是正三角形");
//	     }else if(triangle[0]==triangle[1]||triangle[1]==triangle[2]||triangle[0]==triangle[2]){
//	    	 System.out.println("這是等腰三角形");
//	     }else if(triangle[0]==0||triangle[1]==0||triangle[2]==0){
//	    	 System.out.println("這不是三角形");
//         }else{
//	    	 System.out.println("其他三角形");
//	     }

//		(進階功能:加入直角三角形的判斷)

//		2.請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:

//		int randomNum = (int) (Math.random() * 10);
//
//		for (int times = 0; times < 10; times++) {
//			int insertNum = sc.nextInt();
//			if (insertNum != randomNum) {
//
//				System.out.println("猜錯了!");
//
//			} else {
//				System.out.println("你猜對了");
//				break;
//
//			}
//		}
//
////		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
//
//		int randomNum1 = (int) (Math.random() * 101);
//
//		for (int times = 0; times < 101; times++) {
//			int insertNum = sc.nextInt();
//			if (insertNum > randomNum1) {
//
//				System.out.println("猜錯了!應該小於" + insertNum);
//
//			} else if (insertNum < randomNum1) {
//				System.out.println("猜錯了!應該大於" + insertNum);
//			} else {
//				System.out.println("你猜對了");
//				break;
//
//			}
//
//		}

//		3.阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數

		
		int dislike=sc.nextInt();
		for(int a=1;a<50;a++) {
			if(a%10==dislike||a/10==dislike) {
				continue;	
			}else if(dislike<1 ||dislike>9) {
				System.out.println("輸入超出範圍無效");
				break;
			}
			System.out.print(a+" ");
			
			}
			
			
		

//		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

//		int luckyNum[]=new int [6];
//		for(int a=0;a<luckyNum.length;a++) {
//			}
//		
		}
	
}
