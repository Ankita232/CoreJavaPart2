package com.java;

 class HInheritance {
	 float area;
	 void displayArea()
	 {
		 System.out.println("Area of of diferent shape");
	 }
 }
class Circle extends HInheritance{
	void displayArea() {
		double r=5;
		double area=3.14*r*r;
		System.out.println("Area of circle: "+area);
	}
	
}
class Rectangle extends HInheritance{
	void displayArea() {
		int length=9;
		int breadth=10;
		int area1=length*breadth;
		System.out.println("Area of rectangle: "+area1);
	}
	
}
class Triangle extends HInheritance{
	void displayArea() {
		int b=3,h=4;
		double area3=0.5*(b*h);
		System.out.println("area of triangle: "+area3);
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Circle c=new Circle();
    c.displayArea();
    Rectangle r=new Rectangle();
    r.displayArea();
    Triangle t=new Triangle();
    t.displayArea();
	}
}


