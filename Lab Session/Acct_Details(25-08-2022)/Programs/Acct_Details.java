Author Name:M.Abitha
Title:Bank Details in interface


import java.util.Scanner;

interface Bank {
 
 float rate = 12.0f;
 int no_of_years=3;
 void show();
 
}

class Customer {
 
 String cust_name;
 int cust_id;
 Customer(String a,int i) {
  
  cust_name = a;
  cust_id = i;
 }
 
 void display() {
  
  System.out.println("Customer Name = "+cust_name);
  System.out.println("Customer Id = "+cust_id);
 }
}

class Account  extends Customer implements Bank {
 
 int acc_no;
 float acc_bal;
 String createDate;
 int withdraw;
 int deposit;
 Account(String a,int b,int c,float d,String e,int f,int g ) {
  
  super(a,b);
  acc_no=c;
  acc_bal=d;
  createDate=e;
  withdraw=f;
  deposit=g;
 }
 
 public void show() {
  
  display();
  acc_bal = acc_bal-withdraw;
  
  System.out.println("Account No. = "+acc_no);
  System.out.println("Account Balance = "+acc_bal);
   System.out.println("Account CreateDate="+createDate);
   System.out.println("Amount to withdraw="+withdraw);
   System.out.println("Amount to deposit="+deposit);
 }
	
 
 void interest() {
  
  show();
  float anuvalintr = (rate*acc_bal*no_of_years)/100;
  System.out.println("anuvalInterest = "+anuvalintr);
 }
}

public class Acct_Details {

 public static void main (String[] args) 
 {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enetr the WithDraw ..");
	 int withdraw = sc.nextInt();
  Account ac = new Account("Sameer",8,4052,15000,"12.02.2020",withdraw,10000);
  ac.interest();
 }
}