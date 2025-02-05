package javaproject;

import java.util.Scanner;

public class dog {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a = 0,b = 0;
	System.out.println("Enter a:");
	a=sc.nextInt();
	System.out.println("Enter b:");
	b=sc.nextInt();
	System.out.println("add:"+a+b);
	System.out.println("sub:"+(a-b));
	System.out.println("mul:"+a*b);
	System.out.println("div:"+a/b);
	System.out.println("mod:"+a%b);	
	System.out.println("add:"+a+b+"\n"+"sub:"+(a-b)+"\n"+"mul:"+a*b+"\n"+"div:"+a/b+"\n"+"mod:"+a%b);
	sc.close();
}
}
