package scamp_Assesment;

import java.util.Scanner;

public class Fibonacci1 {
	public static void main(String[]args) {

		Scanner sc= new Scanner(System.in);
		
		//Variables
		int n1=0,n2=1,n3;
		
		System.out.println("Choose a number: ");
		int num=sc.nextInt();
		
		if (num==0) {
			System.out.println(n1);
		} else {
			System.out.print(n1+" "+n2);
		}
		
		for (int i=2;i<=num;i++){
			n3=n1+n2;
			 
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
