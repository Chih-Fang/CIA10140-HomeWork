package hw4_Jan30;

public class Avg {

	public static void main(String[] args) {
//		• 有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)

		int a[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int avgsum = 0;
		for (int i = 0; i < a.length; i++) {
			avgsum += a[i];

		}
		avgsum = avgsum / a.length;
		System.out.println("平均值: " + avgsum);

		for (int j = 0; j < a.length; j++) {
			if (a[j] > avgsum)
				System.out.print(a[j] + " ");
		}
	}

}
