package com.java;

class Privatedemo {
	private int data=40;
	private void msg() {
		System.out.println("hello java ");
	}
 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Privatedemo p=new Privatedemo();
		
		p.msg();
		System.out.println(p.data);
		
	}

	
}


