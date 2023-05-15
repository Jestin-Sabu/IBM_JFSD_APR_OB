package com.ibm.client;

import java.util.*;
import com.ibm.bean.*;
import com.ibm.service.*;

public class Client {
	public static void main(String[] args) {
		//	Order d=new Order();
		int ch;
		int orderNo;
		OrderService os=new OrderService();
		Random rand=new Random();
		int i=1;
		
			Scanner sc=new Scanner(System.in);
			do {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!MENU!!!!!!!!!!!!!!!!!!!!!!");
		    System.out.println("1.Place Order");
		    System.out.println("2.Order Summary");
		    System.out.println("3.Exit");
		    System.out.println("Enter ur choice");
		    ch=sc.nextInt();
		    switch(ch) {
		    case 1 :
		    	os.placeOrder();
		    	break;
		    case 2:
		    	System.out.println("Enter order number");
		    	orderNo=sc.nextInt();
		    	os.orderSummary(orderNo);
		    	break;
		    case 3:
		    	System.exit(0);
		    	break;
		    default:
		    	System.out.println("Invalid choice...Please enter correct choice");
		    	break;
		    }
		    
		}while(i>0);
	}
	
}


