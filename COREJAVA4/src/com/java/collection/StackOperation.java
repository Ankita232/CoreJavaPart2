package com.java.collection;
import java.util.Stack;

public class StackOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>st=new Stack<>();
		System.out.println("check Stack empty or not: "+st.empty());
		st.push(5);
		st.push(9);
		st.push(4);
		st.push(6);
		st.push(1);
		System.out.println("Elements of Stack: "+st);
		System.out.println("check Stack empty or not: "+st.empty());
		st.pop();
		System.out.println("Elements of Stack: "+st);

		System.out.println("Elements of Stack: "+st.peek());
		System.out.println("Elements of Stack: "+st);
		System.out.println("Searching elements: "+st.search(4));
		System.out.println("capacity of Stack: "+st.capacity());
		System.out.println("Index of stack: "+st.indexOf(4));
		System.out.println("last Index of stack: "+st.lastIndexOf(6));

		

		

	}

}
