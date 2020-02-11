package Assignment2;

import java.util.Scanner;
import java.io.*;
public class Calculator {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b= sc.nextDouble();
        int ans=0;
        System.out.print("Enter operation you want to perform ? +, -, *, /");
        char operation = sc.next().charAt(0);
        double result;
        if(operation=='+')
        	ans=Operations.addition(a,b);
        else if(operation=='-')
        	ans=Operations.subtraction(a,b);
        else if(operation=='*')
        	ans=Operations.multiplication(a,b);
        else if(operation=='/')
        	ans=Operations.division(a,b);
        
        System.out.printf("%.1f %c %.1f = %d", a, operation, b, ans);
    }
}