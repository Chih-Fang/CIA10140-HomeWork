package hw4_Jan30;

import java.util.Scanner;


public class Money {

//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下:
//
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
	static int cowoker[][];
	static int count=0;

public static void borrow(int money) {
	for(int i=0;i<5;i++) {

		if(cowoker[i][1]>money) {
			System.out.println("員工編號: "+cowoker[i][0]);
			count++;
		}
		
			
	}
	System.out.println("共:"+count+"人");
	
}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int moneyBorrow = sc.nextInt();

		cowoker= new int[5][2];
		cowoker[0] = new int[] { 25, 2500 };
		cowoker[1] = new int[] { 32, 800 };
		cowoker[2] = new int[] { 8, 500 };
		cowoker[3] = new int[] { 19, 1000 };
		cowoker[4] = new int[] { 27, 1200 };

		
		borrow(moneyBorrow);
	}
}
