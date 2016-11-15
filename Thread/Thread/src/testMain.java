class BankAccount{
	private int balance = 100;
	public int getBalance(){
		return balance;
		}
	public void withDraw (int amount){
		balance -= amount;
		}
	public void add (int money){
		balance += money;
		System.out.println("총합 : " + balance + " " + money + " 만큼 입금");	
	}
	public void delete (int money){
		balance -=money;
		System.out.println("총합 : " +balance + " " + money + " 만큼 출금");
	}		
}
class testThread extends Thread{
	BankAccount account;
	public testThread (BankAccount account){
		this.account = account;
	}
	public void run(){
		int i =0; 
		while (i<10){
			account.add(10);
			account.delete(10);
			try{
				sleep(100);
			}
			catch(InterruptedException e){}
			i++;
		}
	}
}
public class testMain {
	//public static BankAccount account = new BankAccount();

	public static void main(String[] args) {
		BankAccount account = new BankAccount ();
		new testThread (account).start();
		// TODO Auto-generated method stub
		//Thread depositMan = new Thread();
		//Thread withdrawMan = new Thread();
		//depositMan.start();
		//withdrawMan.start();
		

	}

}
