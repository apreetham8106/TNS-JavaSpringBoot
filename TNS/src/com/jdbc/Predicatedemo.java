package com.jdbc;
//to demostarte predicate interface
import java.util.function.Predicate;

public class Predicatedemo
{
	public static void main(String[] args) {
		Predicate<Integer> pr=a->(a>18);  
		System.out.println(pr.test(78));   //creating predicate
	}

}
