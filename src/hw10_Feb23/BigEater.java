package hw10_Feb23;

public class BigEater extends Thread{
	
	String name;
     public BigEater(String name) {

		this.name=name;
	}
	
	public void run() {
		int bowl=1;
		while(bowl<=10) {
			System.out.println(name+"吃第"+bowl+"碗飯");
			bowl++;
			
			double sec=(int)(Math.random()*2.5+0.5);
			try {
				Thread.sleep((long) (sec*1000));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	
		System.out.println(name+"吃完了!!");
		
		
	}

	public static void main(String[] args) {
		Thread aThread=new BigEater("饅頭人");
		Thread bThread=new BigEater("詹姆士");
		
		System.out.println("-----------大胃王比賽開始啦-------------");
		aThread.start();
		bThread.start();
        
		
		try {
			aThread.join();
			bThread.join();
			System.out.println("-----------大胃王比賽結束-----------");
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		
	}

}
