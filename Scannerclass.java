package LoopStatements;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value: ");
		int a = sc.nextInt();
		sc.nextLine();  
		
		System.out.println("enter value: ");
		float b = sc.nextFloat();
		sc.nextLine();  
		
		System.out.println("enter value: ");
		double c = sc.nextDouble();
		sc.nextLine(); 
		
		System.out.println("Enter name");
		String st=sc.nextLine();
		
		System.out.println("Addition is: "+ (a+b+c));
		System.out.println("Subtraction is: "+ (a-b-c));
		System.out.println("Multiplication is: "+(a*b*c));
		System.out.println("length of string is: " +st.length());
				
		sc.close();
		
	}

}