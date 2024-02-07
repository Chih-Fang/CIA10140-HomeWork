package hw4_Jan30;

public class ReversedStr {


	public static void reverse(char a[]) {
		

		char rev[]=new char[a.length];
		for (int i = 0; i < a.length; i++) {
				int position = a.length - (i + 1);
					rev[position] = a[i];
					
				}
		System.out.print(rev);

			}

		
	

	public static void main(String[] args) {
//		請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
		
		
		//第一個測試
		char test[]= {'H','E','L','L','O',' ','W','O','R','L','D'};
		reverse(test);
		System.out.println("\n"+"============");
		
		//第二個測試
		String a="Test reversed words";
		char b[]=a.toCharArray();
		reverse(b);

	}

}
