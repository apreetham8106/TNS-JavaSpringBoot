package com.Interface;

//outter interface
public interface Myinterface {

	 void calculatearea();
	 
	 // nested(inner ) interface
	 
	 interface Myinnerinterface{
		 int id=20;    // data member
		 
		 void print();
	 }
}

