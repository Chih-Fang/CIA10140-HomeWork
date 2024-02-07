package hw2;

public class HwJan19 {

	public static void main(String[] args) {

		System.out.println("========第一題========");
//		 1請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

		int sum = 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 2 == 0) {

				sum += a;

			}

		}

		System.out.println(sum);

		System.out.println("========第二題========");
//		 2請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

		int sum1 = 1;
		for (int b = 1; b <= 10; b++) {
			sum1 *= b;
		}

		System.out.println(sum1);

		System.out.println("========第三題========");
//		 3請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

		int total = 1;
		int x = 1;
		while (x <= 10) {
			total *= x;
			x++;

		}
		System.out.println(total);

		System.out.println("========第四題========");
//		 4請設計一隻Java程式,輸出結果為以下:
//		  1 4 9 16 25 36 49 64 81 100

		int sum4 = 0;
		int d = 1;
		while (d <= 10) {
			sum4 = d * d;

			System.out.println(sum4);

			d++;
		}

		System.out.println("========第五題========");
//		5 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int summary=0;
		for (int lottery = 1; lottery <= 49; lottery++) {
			if ((lottery % 10) == 4 || lottery > 39) {
				continue;
				

			}
			summary++;
			System.out.print(lottery + " ");
			
		}
		System.out.println("共幾個:"+ summary);

		System.out.println();
		System.out.println("========第六題========");

//		6 請設計一隻Java程式,輸出結果為以下:
//		  1 2 3 4 5 6 7 8 9 10
//		  1 2 3 4 5 6 7 8 9
//		  1 2 3 4 5 6 7 8
//		  1 2 3 4 5 6 7
//		  1 2 3 4 5 6
//		  1 2 3 4 5
//		  1 2 3 4
//		  1 2 3
//		  1 2
//		  1

		for (int numY = 10; numY >= 1; numY--) {

			for (int numX = 1; numX <= numY; numX++) {
				System.out.print(numX + " ");
			}
			System.out.println();
		}

		System.out.println("========第七題========");
//		7.請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF

		for (int yAxis = 1; yAxis <= 6; yAxis++) {
			for (int xx = 1; xx <= yAxis; xx++) {
				switch (yAxis) {
				case 1:
					System.out.print("A");
					break;
				case 2:
					System.out.print("B");
					break;
				case 3:
					System.out.print("C");
					break;
				case 4:
					System.out.print("D");
					break;
				case 5:
					System.out.print("E");
					break;
				case 6:
					System.out.print("F");
					break;
				}

			}

			System.out.println();

		}

//課堂練習當作業99乘法表
		System.out.println("==================for+while=========================");

		for (int xx = 1; xx <= 9; xx++) {
			int y = 1;
			do {
				int nineNine = (xx * y);
				System.out.print(xx + "*" + y + "=" + nineNine + "\t");
				y++;
			} while (y <= 9);
			System.out.println();
		}

		// while 圈方式
		System.out.println("==================for+do while========================");

		for (int xxx = 1; xxx <= 9; xxx++) {

			int yy = 1;
			do {
				System.out.print(xxx + "*" + yy + "=" + (xxx * yy) + "\t");

				yy++;
			} while (yy <= 9);

			System.out.println();
		}

		System.out.println("====================while+do=========================");
		// do while

		int a = 1;
		while (a <= 9) {
			int b = 1;
			do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			} while (b <= 9);
			System.out.println();
			a++;
		}

	}

}
