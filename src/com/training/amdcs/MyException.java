package com.training.amdcs;

public class MyException extends Exception {
	
	MyException(String msg){
		super(msg);
	}

}


// create a variable that will hold age of a person.
// if the age is greater than 18 you will display :'Eligible to Vote'
// if the age is less than 18 then throw a custom Exception with a message : 'Too young to vote'