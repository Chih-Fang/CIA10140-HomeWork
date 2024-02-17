package hw8_Feb15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sample {

//	請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//		Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {

			
			int line = 0;
			int characterCount = 0;
			int character;
			FileReader sample = new FileReader("./Sample.txt");
			BufferedReader br = new BufferedReader(sample);

			while ((character = br.read()) != -1) {
				if((character=='\n'))
					continue;
				else{
					characterCount++;
				}
			}

			sample = new FileReader("./Sample.txt");
			br = new BufferedReader(sample);
			String str;
			while ((str = br.readLine()) != null) {
				line++;
			}

			br.close();
			sample.close();

			File file = new File("./Sample.txt");
			System.out.println("幾位元: " + file.length());

			System.out.println("幾個字: " + characterCount);

			System.out.println("幾列: " + line);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
