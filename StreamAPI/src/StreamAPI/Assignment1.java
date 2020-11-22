package StreamAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import StreamAPI.Order.Type;

class Order
{
	enum Type
	{
		BUY,SELL;
	}
	private int quantity;
	private double price;
	private Type type;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int q) {
		this.quantity = q;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
}
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> myList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		Double p = 0.0;
		int q;
		String t;
		for(int i=0;i<3;i++)
		{
			Order o = new Order();
			System.out.println("Enter Quantity of Product "+(i+1));
			q=sc.nextInt();
			System.out.println("Enter Price of Product "+(i+1));
			p=sc.nextDouble();
			System.out.println("Enter Type of Product "+(i+1));
			t=sc.next();
			o.setPrice(p);
			o.setQuantity(q);
			if(t.equalsIgnoreCase("buy"))
			{
				o.setType(Type.BUY);
			}
			else
			{
				o.setType(Type.SELL);
			}
			myList.add(o);
		}
		/*
		 * 1) count how many orders are for "SELL"

		hint:- use "filter" method of stream to check whether type is SELL and "count" method to count
		 */
		System.out.println("The orders for Sell are :"+myList.stream().filter((s)-> s.getType()== Type.SELL).count());
/*		2) calculate sum of all the prices

		hint:- use "mapToDouble" method of stream to convert price of each and every object and "sum" method to calculate total of all the prices.*/
		Double sum=myList.stream().mapToDouble(s->s.getPrice()).sum();
		System.out.println("The sum of prices are :"+sum);
		
		myList.stream().mapToDouble(s->s.getPrice()).forEach(System.out::println);
		/*
		 * 3) calculate sum of all the quantities.

		hint:- use "mapToInt" method of stream to convert qty of each and every object and "sum" method to calculate total of all the quantities.
		 */
		int sum1=myList.stream().mapToInt(s->s.getQuantity()).sum();
		System.out.println("The sum of quantities are :"+sum1);
		
	}

	
}
