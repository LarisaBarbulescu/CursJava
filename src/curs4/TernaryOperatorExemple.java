package curs4;

import java.util.Scanner;

/*
 * intrebam 2 numere de la tastatura
 * verificam fiecare numar daca este pozitiv si printam nr este pozitiv sau nr nu este pozitiv
 * verificam daca ambele nr sunt pozitive
 * verificam care este cel mai mic sau daca sunt egale
 * 
 */

public class TernaryOperatorExemple {

	public static void main(String[] args) {

		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 = scan.nextInt();
		System.out.println("Enter second number:");
		num2 = scan.nextInt();
		
		//1. 
		//verificam daca primul numar este pozitiv
		
		if (num1>0) {
			System.out.println("Num1 este pozitiv");
		} else {
			System.out.println("Num1 este negativ");
		}
		
		//conditie ? expresie true : expresie false
		
		String result = (num1>0) ?"Num1 este pozitiv" :"Num1 este negativ";
		System.out.println(result);
		
		//2. 
		//verificam daca al doilea numar este pozitiv
		
		result = (num2>0) ? "Num2 este pozitiv" :"Num2 este negativ";
		System.out.println(result);
		
		//ambele nr pozitive
		result = (num1>0 && num2>0) ? "Ambele sunt pozitive" : "Cel putin unul este negativ";
		System.out.println(result);

	
		//3. 
		//verificam care este mai mic sau daca sunt egale
		if(num1>num2) {
			System.out.println("num1 este mai mare");
		
		} else if(num1<num2) {
			System.out.println("num2 este mai mare");	
		} else
			System.out.println("sunt egale");
		
		result = (num1>num2) ? "num1 este mai mare" : 
			(num1<num2 ) ? "Cel putin unul este negativ" : "sunt egale";
		System.out.println(result);
		
	}

}
