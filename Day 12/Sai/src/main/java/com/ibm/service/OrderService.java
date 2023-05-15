package com.ibm.service;

import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.*;

import com.ibm.bean.*;

public class OrderService {
	private static final Map<Integer, Order> orders = new HashMap();;
	double commission=0;
	int quantity = 0;
	Random rand = new Random();

	public int placeOrder() {
		int orderNo=0;
		Scanner sc=new Scanner(System.in);
		System.out.println( "stock");
		System.out.println("1.\t LNT \t 1451.50 ");
		System.out.println("2.\t Reliance \t 923.90");
		System.out.println("3.\t Tata Steel \t 435.60");
		System.out.println("select stock");
	    int stockNo=sc.nextInt();
	   
		String stock="";
				switch(stockNo) {
				case 1:
					stock="LNT";
					break;
				case 2:
					stock="Reliance";
					break;
				case 3:
					stock="Tata Steel";
					break;
				default:
					System.out.println("invalid stock");
					
				}
				
				
				double stockPrice=0;
				   switch(stockNo) {
				   case 1:
					   stockPrice=1451.50;
					   break;
				   case 2:
					   stockPrice=923.90;
					   break;
				   case 3:
					   stockPrice=435.60;
					   break;
				default:
					System.out.println("Invalid");
				   }
				
			 System.out.println("Action");
			 System.out.println("select action");
			 System.out.println("1.Buy");
			 System.out.println("2.sell");
			 int action=sc.nextInt();
			 System.out.println("Enter quantity");
			     quantity=sc.nextInt();
			    if(quantity<=0)
			    	System.out.println("Invalid input.....");
			 double amount=stockPrice*quantity;
			 Order order=new Order(orderNo,stock,"Buy",quantity,amount,0);
			 orderNo=rand.nextInt(1000)+1;
			 switch(action) {
			 case 1:
			            commission=0.5*amount;
			            order.setCommission(commission);
			           orders.put(orderNo,order);
				    	System.out.println("Order Placed ,Your order No:" +orderNo + "Thanks for placing order");
				        break;
			 case 2:
				 commission=0.01*amount;
				 order.setAction("sell");
				 order.setCommission(commission);
			     orders.put(orderNo,order);
			     System.out.println("Order Placed ,Your order No:" +orderNo + "Thanks for placing order");
			     break;
			 default:
				 
				 System.out.println("Order failed");
				
			 }
				    	
			 return orderNo;
	}
		
	public static void orderSummary(int orderNo) {
		Order order1=orders.get(orderNo);
		if(order1.getOrderNo()>=1) {
			System.out.println("order summary");
			System.out.println("Stock" +order1.getStock());
			System.out.println("Action" +order1.getAction());
			System.out.println("Quantity" +order1.getQuantity());
			System.out.println("Amount" +order1.getAmount());
			System.out.println("Commission" +order1.getCommission());
		}
		else
			System.out.println("No such data found...Please enter valid order number");
	}

}
			    	
		    
		
		

	



