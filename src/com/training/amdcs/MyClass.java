package com.training.amdcs;

import java.io.IOException;

public class MyClass {

	public static void main(String[] args) {
		
		try {
			int i =2;
			int y = 5/i;
			int age = 21;
			getDetails(age);
			System.out.println("value of y is: "+y);
			
		}
		catch(MyException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside finally");
		}
		System.out.println("Program execution continues....");
	}
	
	public static void getDetails(int age) throws MyException {
		if (age<18) {
			
			throw new MyException("Too young to vote!");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}
}

// create a java program that will print table of 5;
// 5*1 = 5
// 5*2 = 10

//Access Specifier: public-> it can be accessed from anywhere, 
// protected -> can be accessed within the package and by child classes outside of the package
// default -> can be accessed only within the same package
// private -> accessible within the class only

//Maven: 1. To resolve dependencies
//2. create build of our project