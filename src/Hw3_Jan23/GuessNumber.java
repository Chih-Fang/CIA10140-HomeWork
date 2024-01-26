package Hw3_Jan23;

import java.util.Scanner;

public class GuessNumber {

//	
//	2.請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int randomNum = (int) (Math.random() * 10);
		System.out.println("開始猜數字吧~~");

		for (;;) {
			int insertNum = sc.nextInt();

			if (insertNum != randomNum) {

				System.out.println("猜錯了!");

			} else {
				System.out.println("你猜對了");
				break;

			}
		}

//
////	(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
//
	int randomNum1 = (int) (Math.random() * 101);
	System.out.println("進階版猜數字!1~100請猜吧");

	for (;;) {
		int insertNum = sc.nextInt();
		if (insertNum > randomNum1) {

			System.out.println("猜錯了!應該小於" + insertNum);

		} else if (insertNum < randomNum1) {
			System.out.println("猜錯了!應該大於" + insertNum);
		} else {
			System.out.println("你猜對了");
			break;

		}

	}

	}
}
