package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String[] arr;
    	
    	while(true) {
    		System.out.print(">> ");
    		
        	arr = sc.nextLine().split(" ");
        	
        	if(arr[0].equals("\\q")) {
        		break;
        	}
        	
        	int a = Integer.parseInt(arr[0]);
        	int b = Integer.parseInt(arr[2]);
        	
        	int result = 0;
        	
        	if(arr[1].equals("+")) {
        		Add add = new Add();
        		add.setValue(a, b);
        		result = add.calculate();
        		System.out.println(">> "+result);
        		
        	} else if(arr[1].equals("/")) {
        		Div div = new Div();
        		div.setValue(a, b);
        		result = div.calculate();
        		System.out.println(">> "+result);
        		
        	} else if(arr[1].equals("-")) {
        		Sub sub = new Sub();
        		sub.setValue(a, b);
        		result = sub.calculate();
        		System.out.println(">> "+result);
        		
        	} else if(arr[1].equals("*")) {
        		Mul mul = new Mul();
        		mul.setValue(a, b);
        		result = mul.calculate();
        		System.out.println(">> "+result);
        	} else {
        		System.out.println("알 수 없는 연산입니다.");
        	}
    		
    	}
    	
    	System.out.println("종료합니다.");
    	
    	sc.close();
    }
}
