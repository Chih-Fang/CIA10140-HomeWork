package hw8_Feb15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	
	public void copyfile(FileReader a,FileWriter copy) throws IOException{
	
		int content;
		while((content=a.read())!=-1) {
			
			copy.write(content);
	
		}
		a.close();
		 copy.close();
		
		
	}

//	請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案
	public static void main(String[] args) {
		CopyFile test=new CopyFile();
		
		try {
			FileReader a=new FileReader("./Sample.txt");
			FileWriter copy=new FileWriter("./copyOfSample.txt");
			test.copyfile(a, copy);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
