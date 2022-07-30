package com.garbage;

public class GarbageDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageDemo gd=new GarbageDemo();
		gd=null;
		String s=new String("hello");
		s=null;
		//GarbageDemo g2=new GarbageDemo();
		//g1=g2;
		//new GarbageDemo();
		
		System.gc();
		System.out.println("/main method");
	}
	protected void finalize() {
		System.out.println("object is garbage collected/Overriding now");
	}

}
