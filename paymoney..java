package com.jayanth.eclipse.ide.paymoney;

public class paymoney {
	
  import java.util.Scanner;
	public static void main(String[] args) {
		
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the  size of transaction array");
      int size= sc.nextint();
      int[]  transaction = new int[size];
      for(int i =   0 ; i<transaction.length; i++)
      { System.out.println("enter the values of array");
       transaction[i] = sc.nextint();
       
      }
      System.out.println("enter the total number of targets that needs to be acheived");
      int targetamnt = sc. nextint();
        int sum = 0;
        for(j = 0; j<transaction.length; j++) {
        	sum+= transactions[j];
        	if(sum >= targetamnt) {
        		System.out.println("Target acheived after "+(j+1)+" transactions");
        	}
        	break;
        }
        else
        	System.out.println("Given target is not acheived");
	}

}
