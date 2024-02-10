package hw5_Feb07;

public class Max {

	public int maxElement(int a[][]) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			for(int y=0;y<a[i].length;y++) {
				if(a[i][y]>max)
					max=a[i][y];
			}
		

		}
		
		return max;
		
	
	}
	
	
	public double maxElement (double b[][]) {
		double max=0.0;
		for(int i=0;i<b.length;i++) {
			for(int y=0;y<b[i].length;y++) {
				if(b[i][y]>max)
					max=b[i][y];
			}
			
		
		}
		return max;
	}
//	利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳,如圖:
	public static void main(String[] args) {
		 Max test=new Max();
		 int a[][]= {{1,6,3},{9,5,2}};
		 double b[][]= {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		 

		 System.out.println("int陣列最大值: "+test.maxElement(a));
		 System.out.println("double陣列最大值"+test.maxElement(b));

	}

}
