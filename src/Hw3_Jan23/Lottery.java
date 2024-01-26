package Hw3_Jan23;

import java.util.Scanner;

public class Lottery {
	
	
//	
//	3.阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//	的號碼與總數

	public static void main(String[] args) {
		
	
Scanner sc= new Scanner(System.in);

  System.out.println("阿文~~你討厭幾號?");	
		int dislike=sc.nextInt();
		int sum=0;
		for(int a=1;a<50;a++) {
			if(a%10==dislike||a/10==dislike) {
				
				continue;	
			}else if(dislike<1 ||dislike>9) {
				System.out.println("輸入超出範圍無效~bye!");
				break;
			}
			sum++;
			System.out.print(a+" ");
	
			}
		System.out.println("\n"+"共有:"+sum+"數字");

//		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
		
		
		System.out.println("=================");
		
		System.out.println("請輸入你討厭的號碼~我將隨機提供你六個幸運數字");
		
		int badNum=sc.nextInt();


		int luckyNum[]=new int [6];
		for(int a=0;a<luckyNum.length;a++) {
			luckyNum[a]=(int)(Math.random()*49)+1;
			
			for(;;) {
				if(luckyNum[a]%10==badNum||luckyNum[a]/10==badNum ) {
					luckyNum[a]=(int)(Math.random()*49)+1;
					
					
				}else {
						System.out.print(luckyNum[a]+" ");
						
						
			
						 }break;
						 
					}
				}
			
			}
		}

	
