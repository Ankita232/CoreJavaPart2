package com.interfacedemo;

public class NarrowingExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=23.45;
		float f=(float)d;
		long l=(long)f;
		int i=(int)l;
		short s =(short)i;
		byte b= (byte)s;
		System.out.println("double value: "+d);
		System.out.println("float value: "+f);
		System.out.println("long value: "+l);
		System.out.println("int value: "+i);
		System.out.println("short value: "+s);
		System.out.println("byte value: "+b);
	}

}
