package com.thread;
class First{
	synchronized void display(String msg)
	{
		System.out.print("["+msg);
		try {
			Thread.sleep(10);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("]");
	}
}
class Second extends Thread
{
	String msg;
	First obj;
	Second(First fp,String str)
	{
		obj=fp;
		msg=str;
		start();
	}
	public void run() {
		obj.display(msg);
	}
}
public class Threading {

	public static void main(String[] args) {
		First f=new First();
		Second s=new Second (f,"welcome");
		Second s1=new Second (f,"to");
		Second s2=new Second (f,"this example");

	}

}
