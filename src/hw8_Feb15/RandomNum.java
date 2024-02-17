package hw8_Feb15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class RandomNum {

	
//	請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//			append功能讓每次執行結果都能被保存起來)
	public static void main(String[] args) {
		
		try {
			String str;
			FileWriter fw=new FileWriter("./Data.txt",true);
			
			for(int i=1;i<=10;i++) {
				 String random=String.valueOf((int)(Math.random()*1000+1));
				 fw.write(random);
				 fw.write('\n');
			   
			}
			 fw.close();	
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
