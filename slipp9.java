Slip9_1: Define a “Clock” class that does the following ;
a. Accept Hours, Minutes and Seconds
b. Check the validity of numbers
c. Set the time to AM/PM mode
Use the necessary constructors and methods to do the above task
import java.util.*;
class Clock
{
 int hours,minutes,seconds;
 Clock()
 {
 System.out.println("enter the time in HH MM SS format");
 Scanner sc= new Scanner(System.in);
 this.hours = sc.nextInt();
 this.minutes = sc.nextInt();
 this.seconds = sc.nextInt();
 }
 void isTimeValid()
 {
 if(hours>=0 && hours<24 && minutes>0 &&minutes<60
&&seconds>0 && seconds<60)
 System.out.println("time is valid");
 else
 System.out.println("time is not valid");
 }
 void setTimeMode()
 {
 if(hours<12)
 {
 System.out.println("time ="
+hours+":"+minutes+":"+seconds +" AM");
 }
 else
 hours = hours-12;
 System.out.println("time ="
+hours+":"+minutes+":"+seconds +" PM");
 }
 public static void main(String args[])
 {

 Clock c = new Clock();
 c.isTimeValid();
 c.setTimeMode();
 }
}


Slip9_2: Write a program to using marker interface create a class Product (product_id,
product_name, product_cost, product_quantity) default and parameterized constructor. Create
objectsof class product and display the contents of each object and Also display the object
count.
import java.util.*;
interface MarkerInt {
}
class product implements MarkerInt {
 int pid, pcost, quantity;
 String pname;
 static int cnt;
 // Default constructor
 product() {
 pid = 1;
 pcost = 10;
 quantity = 1;
 pname = "pencil";
 cnt++;
 }
 // Parameterized constructor
 product(int id, String n, int c, int q) {
 pid = id;
 pname = n;
 pcost = c;
 quantity = q;
 cnt++;
 System.out.println("\nCOUNT OF OBJECT IS : " + cnt + "\n");
 }
 public void display() {
 System.out.println("\t" +pid + "\t" + pname + "\t" + pcost + "\t" + quantity);
 }
}
class MarkerInterface {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Number of Product : ");
 int n = sc.nextInt();
 product pr[] = new product[n];
 for (int i = 0; i < n; i++) {
 System.out.println("\nEnter " + (i + 1) + " Product Details :\n");
 System.out.println("Enter Product ID: ");
 int pid = sc.nextInt();
 sc.nextLine();
 System.out.println("Enter Product Name: ");
 String pn = sc.nextLine();
 System.out.println("Enter Product Cost:");
 int pc = sc.nextInt();
 System.out.println("Enter Product Quantity:");
 int pq = sc.nextInt();
 pr[i] = new product(pid, pn, pc, pq);
 }
 System.out.println("\n\t\t Product Details\n");
 System.out.println("\tId\tPname\tCost\tQuantity\n");
 for (int i = 0; i < n; i++) {
 pr[i].display();
 }
 sc.close();
 }
}

