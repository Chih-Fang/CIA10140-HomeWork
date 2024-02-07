package hw4_Jan30;

public class Vowels {

	public static void main(String[] args) {
//		有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)"
		String vol[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		char a[][] = new char[vol.length][];
		int count = 0; // 計算幾個母音
		for (int i = 0; i < vol.length; i++) {
			a[i] = vol[i].toCharArray();

			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 'a' || a[i][j] == 'e' || a[i][j] == 'i' || a[i][j] == 'o' || a[i][j] == 'u') {
					count++;
				}
			}

		}

		System.out.println("共有幾個母音:" + count);

	}

}