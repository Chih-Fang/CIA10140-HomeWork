package hw10_Feb23;



class PocketMoney {

	int bank = 2000;

	synchronized public void deposit(int a) {

		while (bank > 3000) {
		
		System.out.println("媽媽看到帳戶餘額達3000暫停匯款" + "\n" + "熊大被老媽告知帳戶已有錢");
		try {
			wait();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		}

		bank += a;
		System.out.println("媽媽在帳戶存了2000元帳戶共有: " + bank);
		notify();

	}

	synchronized public void withdraw(int b) {
		while (bank < b) {
			System.out.println("熊大看到帳戶餘額不足,暫停提款");
			System.out.println("媽媽被要求匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

		bank -= b;
		System.out.println("熊大提領了: " + b + ",餘額還剩: " + bank);
		if (bank < 2000) {
			System.out.println("熊大看到餘額低於2000元,要求媽媽匯款");
			notify();
		}

	}
	
}

	class Deposit extends Thread {
		PocketMoney pocketMoney;

		Deposit(PocketMoney pocketMoney) {
			this.pocketMoney = pocketMoney;

		}

		public void run() {
			for (int i = 1; i <= 10; i++) {
				pocketMoney.deposit(2000); // deposit 2000 each time
			}
		}

	}
	
	
	
	class Withdraw extends Thread{
		
		PocketMoney pocketMoney;
		
		public Withdraw(PocketMoney pocketMoney) {
			this.pocketMoney=pocketMoney;
		}
		
		public void run() {
			
			for(int i = 1; i <= 10; i++)
			pocketMoney.withdraw(1000);
		}
		
	}
	
	
	public class TestWaitNotify {
		 
		 
		public static void main(String[] args) {
			
			PocketMoney pocketMoney=new PocketMoney();
			Deposit deposit=new Deposit(pocketMoney);
			Withdraw withdraw=new Withdraw(pocketMoney);
			
			deposit.start();
			withdraw.start();
			
			
			try {
	            deposit.join();
	            withdraw.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Main thread exits.");
	    }

            }