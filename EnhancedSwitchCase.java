package com.examples.bll;

import java.util.Scanner;

public class EnhancedSwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Scanner object
		
		System.out.println("Enter your choice :Facebook || TCS || Wipro || Amazon || Google");//prompting user for his choice
		String ch=sc.next().toLowerCase();//storing the choice in lower case
		
		switch(ch) { //switching ch variable taken for choice
		
		//multiple cases
		case "facebook" -> System.out.println("Tagline: It's free and always will be");
		case "tcs" -> System.out.println("Tagline: Building on Belief");
		case "wipro" ->System.out.println("Tagline: Spirit of Wipro");
		case "amazon" ->System.out.println("Tagline: Work hard, Have fun, Make history. And You're Done! You Shop, Amazon Gives");
		case "google" ->System.out.println("Tagline: Don't be evil.");
		}
	
	
	}

}