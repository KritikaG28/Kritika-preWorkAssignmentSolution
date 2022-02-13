package preworkAssignment1;

import java.util.Scanner;

/*
 * Write a program that performs multiple operations:



Check for palindrome number
Prints the pattern of stars in decreasing order based on the input
Check whether the input number is a prime number
Print Fibonacci series of size n with first two numbers as 0, 1


 */
import java.util.Scanner;



public class Main {

	Scanner sc = new Scanner(System.in);

	//function to checkPalindrome
	public void checkPalindrome()  {
		int r,sum=0,temp;   
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		temp=num;

		while(num>0){    
			r=num%10;  //getting remainder  
			sum=(sum*10)+r;    
			num=num/10;    
		}    
		if(temp==sum)    
			System.out.println(temp+ " is a palindrome number.");    
		else    
			System.out.println(temp+" is not a palindrome number.");    
	}  

	//function to printPattern
	public void printPattern() {
		System.out.println("Enter the number of rows: ");
		int n=sc.nextInt(); 
		
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	//function to check no is prime or not
	public void checkPrimeNumber() {
		int i,m=0,flag=0;   
		System.out.println("Enter the number: ");
		int num = sc.nextInt();  
		m=num/2;      
		if(num==0||num==1){  
			System.out.println(num+" is not a prime number.");      
		}else{  
			for(i=2;i<=m;i++){      
				if(num%i==0){      
					System.out.println(num+" is not a prime number.");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(num+" is a prime number."); }  
		}

	}

	// function to print Fibonacci Series
	public void printFibonacciSeries() {

		//initialize the first and second value as 0,1 respectively.
		int first = 0, second = 1;
		int third,i;  
		System.out.println("Enter the size: ");
		int count = sc.nextInt();
		System.out.print(first+" "+second);//printing 0 and 1    

		for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		{    
			third=first+second;    
			System.out.print(" "+third);    
			first=second;    
			second=third;    
		}  
		System.out.println();

	}

	//main method which contains switch and do while loop
	public static void main(String[] args) {
		Main obj = new Main();
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n" 
					+ "2. Print Pattern for a given number.\n" + "3. Check whether the number is a prime number.\n"
					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				choice = 0;
				break;
			case 1: {
				obj.checkPalindrome();
			}
			break;
			case 2: {
				obj.printPattern();
			}
			break;
			case 3: {
				obj.checkPrimeNumber();
			}
			break;
			case 4: {
				obj.printFibonacciSeries();
			}
			break;
			default:
				System.out.println("Invalid choice. Enter a valid number.\n");
			}
		} while (choice != 0);
		System.out.println("Exited Successfully!!!");
		sc.close();
	}
}