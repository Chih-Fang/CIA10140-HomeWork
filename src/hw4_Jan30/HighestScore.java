package hw4_Jan30;

public class HighestScore {

    static int count[] = new int[8];
   

	public static void scoreCompare(int score[][]) {

		int maxNum = 0;
		for (int a = 0; a < score.length; a++) {

			for (int b = score[a].length - 1; b >= 0; b--) {

				if (score[a][b] > score[a][maxNum]) {

					maxNum = b;

				}

			}

			count[maxNum]++;

		}

	}

	public static void main(String[] args) {
//		班上有8位同學,他們進行了6次考試結果如下:
//
//			請算出每位同學考最高分的次數

		int exam[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		scoreCompare(exam);

		for (int i = 0; i < count.length; i++)
			System.out.println(i + 1 + "號同學,共幾次最高分: " + count[i] + "次");
	}

}
