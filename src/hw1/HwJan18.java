package hw1;

public class HwJan18 {

	public static void main(String[] args) {

//		1.請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12;
		int b = 6;
		System.out.println("===========第一題===========");
		System.out.println("和: " + (a + b));
		System.out.println("積: " + (a * b));

//		2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		System.out.println("===========第二題===========");
		System.out.println("200顆的蛋是幾打: " + (200 / 12));
		System.out.println("餘數幾顆: " + (200 % 12));

//		3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		System.out.println("===========第三題===========");
		int totalTime = 256559;
		int day = (totalTime / (24 * 60 * 60));
		System.out.println(day + "天");
		int hour = ((totalTime % 24 * 60 * 60)) / (60 * 60);
		System.out.println(hour + "時");
		int min = ((totalTime % (60 * 60)) / 60);
		System.out.println(min + "分");
		int sec = (totalTime % 60);
		System.out.println(sec + "秒");

//		4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double pi = 3.1415;
		double circuference = pi * (5 + 5);
		double area = pi * 5 * 5;

		System.out.println("=============第四題==========");
		System.out.printf("半徑為5的圓面積: %.4f%n", area);
		System.out.printf("圓周長: %.3f%n", circuference);
//		5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		int savings = 1500000;
		double interest = 1.02;
		System.out.println("=============第五題==========");
		double tenYearsLater = savings * Math.pow(interest, 10);
		System.out.println("十年後複利: " + tenYearsLater);

//		6.請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		int num = 5;
		char n = '5';
		String num1 = "5";
		System.out.println("=============第六題==========");
		System.out.println(num + num + " 因為數值5可以直接相加");
		System.out.println(num + n + " 因為char 5 在unicode 16進制是0035等同於53(十進制),所以5+53=58");
		System.out.println(num + num1 + " 因為是字串5串聯數值5");
		

	}

}
