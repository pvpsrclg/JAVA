Slip15_1: Accept the names of two files and copy the contents of the first to the second. First file
having Book name and Author name in file.

 
 import java.io.*;
import java.util.*;
 class demoFile
{
 public static void main(String args[]) throws Exception
  {
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the first file");
 String f1=sc.next();
 System.out.println("Enter the second file");
 String f2=sc.next();

 FileInputStream fis=new FileInputStream(f1);
 FileOutputStream fos=new FileOutputStream(f2);
 int ch;
 while((ch=fis.read())!=-1)
 {
 fos.write(ch);
 }
 System.out.println("file copied...");
 fis.close();
 fos.close();
 }
 }


Q2) Write a program to define a class Account having members custname, accno. Define
default and parameterized constructor. Create a subclass called SavingAccount with membersavingbal, minbal. Create a derived class AccountDetail that extends the class SavingAccount
with members, depositamt and withdrawalamt. Write a appropriate method to display customer
details.
// Base class: Account
class Account {
protected String custName;
protected String accNo;
// Default constructor
public Account() {
this.custName = "Unknown";
this.accNo = "0000";
}
// Parameterized constructor
public Account(String custName, String accNo) {
this.custName = custName;
this.accNo = accNo;
}
}
// Subclass: SavingAccount
class SavingAccount extends Account {
protected double savingBal;
protected double minBal;
// Default constructor
public SavingAccount() {
super(); // Call to Account default constructor
this.savingBal = 0.0;
this.minBal = 500.0; // Default minimum balance
}
// Parameterized constructor
public SavingAccount(String custName, String accNo, double savingBal,
double minBal) {
super(custName, accNo); // Call to Account parameterized
constructor
this.savingBal = savingBal;this.minBal = minBal;
}
}
// Derived class: AccountDetail
class AccountDetail extends SavingAccount {
private double depositAmt;
private double withdrawalAmt;
// Default constructor
public AccountDetail() {
super(); // Call to SavingAccount default constructor
this.depositAmt = 0.0;
this.withdrawalAmt = 0.0;
}
// Parameterized constructor
public AccountDetail(String custName, String accNo, double savingBal,
double minBal, double depositAmt, double withdrawalAmt) {
super(custName, accNo, savingBal, minBal); // Call to
SavingAccount parameterized constructor
this.depositAmt = depositAmt;
this.withdrawalAmt = withdrawalAmt;
}
// Method to display customer details
public void displayCustomerDetails() {
System.out.println("Customer Name: " + custName);
System.out.println("Account Number: " + accNo);
System.out.println("Savings Balance: " + savingBal);
System.out.println("Minimum Balance: " + minBal);
System.out.println("Deposit Amount: " + depositAmt);
System.out.println("Withdrawal Amount: " + withdrawalAmt);
}
}
// Main class to test the implementation
public class BankAccountDemo {
public static void main(String[] args) {// Creating an object of AccountDetail using the parameterized
constructor
AccountDetail account = new AccountDetail("John Doe", "123456",
1000.0, 500.0, 200.0, 100.0);
// Displaying customer details
account.displayCustomerDetails();
}
}
