package hw5_Feb07;

public class RandomAvg {

	
	
	public void randAvg() {
		
	int randomNum[]=new int[10];
	int avg=0;
	System.out.print("本次亂數結果: ");
	for(int i=0;i<randomNum.length;i++) {
		randomNum[i]=(int)(Math.random()*101);
		System.out.print(randomNum[i]+" ");
		avg+=randomNum[i];
	}
	avg/=10;
	System.out.println("平均值為: "+ avg);
		
	}
//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	public static void main(String[] args) {
		
      RandomAvg test=new RandomAvg();
      
      test.randAvg();
	}

}
