package hw4_Jan30;

import java.util.Scanner;

public class Date {

	int year;
	int whichMonth;
	int day;

	int month[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int total = 0;

	void countHowManyDay() {

		if (year % 4 == 0&& year % 100!=0 || year%400==0||year%4==0&& year % 100!=0&&whichMonth == 2 && day == 29
				|| year%400==0&& whichMonth == 2 && day == 29 ) {

			for (int i = 0; i < whichMonth - 1; i++) {

				total += month[i];
			}
			if (whichMonth > 2) {
				total = total + day + 1;
				System.out.println(year + "年" + whichMonth + "月" + day + "日,共有" + total + "天");
			} else {
				total = total + day;
				System.out.println(year + "年" + whichMonth + "月" + day + "日,共有" + total + "天");
			}

		} else if(whichMonth==2&&day>28){
			System.out.println("輸入無效");
			
		}else {

			for (int i = 0; i < whichMonth - 1; i++) {
				total += month[i];
			}

			total = total + day;
			System.out.println(year + "年" + whichMonth + "月" + day + "日,共有" + total + "天");
		} 
	}



	public static void main(String[] args) {
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		Scanner sc = new Scanner(System.in);
		Date testDate = new Date();

		testDate.year = sc.nextInt();
		testDate.whichMonth = sc.nextInt();
		testDate.day = sc.nextInt();

		testDate.countHowManyDay();
	}

}
