package com.thread;

public class StaticSynchronized {

	public static void main(String[] args) {
		for(int i=1;i<4;i++)
		{
			AccountHolder t= new AccountHolder();
			t.setName("person"+i);
			t.start();
		}
	}

}
class ATMCenter{
	 static synchronized void userAction() {
		System.out.println(Thread.currentThread().getName() + "entered");
		System.out.println("Performed transaction");
		try {
			Thread.sleep(400);
		}
		catch(Exception e)
		{
			System.out.println("Thread Interrupted");
		}
		System.out.println(Thread.currentThread().getName() + "transaction complete");
		System.out.println(Thread.currentThread().getName() + "leaving");
		System.out.println("----------------------------------------------");

	}
}
class AccountHolder extends Thread
{
	public void run() {
		//ATMCenter atmCenter = new ATMCenter();
		ATMCenter.userAction();
	}
}