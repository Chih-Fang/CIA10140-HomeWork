package hw5_Feb07;

public class OTUC {

	public void genAuthCode () {
		
		char code;
		for(int i=0;i<8;i++) {
			code=(char)(Math.random()*123);
			if(code>48&&code<=57 ||code>65&&code<=90||code>97&&code<=122) {
				
				System.out.print(code);
				
			
			}else {
				i--;}
		}
		
	}
	
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖:
	public static void main(String[] args) {
		
     OTUC test=new OTUC();
     test.genAuthCode();

	}

}
