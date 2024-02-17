package hw8_Feb15;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class CatnDog implements Serializable {
	private static final long serialVersionUID = 001;

//	請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

//	承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//			型簡化本題的程式設計)

	public void speak() {

	}

	public static void main(String[] args) throws Exception {
		File file = new File("C:/Data/Object.ser");
		CatnDog test[] = new CatnDog[4];
//		CatnDog cat[]=new CatnDog[2];
		test[0] = new Dog("Cuba");
		test[1] = new Dog("雷根");
		test[2] = new Cat("多多");
		test[3] = new Cat("招財");

		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < test.length; i++) {
			oos.writeObject(test[i]);

		}
		oos.close();
		fos.close();
		
		//輸入
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		System.out.println(file.getName()+"狗狗貓貓資料如下: ");
		System.out.println("==============================");
		
		try {
		while(true) {
			
		
		           ((CatnDog)ois.readObject()).speak();
		           System.out.println("---------------------------");
		    }
		}catch(EOFException e){
			System.out.println("資料讀取完畢");
			
		}

	}
}