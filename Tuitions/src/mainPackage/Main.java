package mainPackage;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Tuition Calculator");
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Input the initial cost of tuition: ");
		double initialCost = scnr.nextInt();
		
		System.out.println("Input the yearly percentage increase of tuition: ");
		double percentIncrease = scnr.nextInt();
		
		System.out.println("Input the repayment APR: ");
		double APR = scnr.nextInt();
		
		System.out.println("Input number of years to repay: ");
		double yearsRepayed = scnr.nextInt();
		
		double college = 4;
		double total = initialCost;
				
		while (college != 1){
			initialCost = ((initialCost * percentIncrease) + initialCost);
			total = (initialCost + total);
			college = (college - 1);
		}
		
		System.out.println("Cost of college without loans" + total);
		
		double costAPR = (APR * yearsRepayed);
		
		total = (costAPR + total);
		
		System.out.println("Cost of college with student loan is " + total);
		}
		
		
	}

