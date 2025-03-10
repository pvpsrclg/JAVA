 Slip 1_1: Write a Program to print all Prime numbers in an array of ‘n’
elements. (use command line arguments)
Solution:
class PrNo
{
 public static void main (String[] args)
 {
 int size = args.length;
 int[] array = new int [size];
 for(int i=0; i<size; i++)
 {
 array[i] = Integer.parseInt(args[i]);
 }
 for(int i=0; i<array.length; i++)
 {
 boolean isPrime = true;
 for (int j=2; j<array[i]; j++)
 {
 if(array[i]%j==0)
 {
 isPrime = false;
 break;
 }
 }
 if(isPrime)
 System.out.println(array[i] + " are the prime numbers in the array ");
 }
 }
}



Slip 1_2: Define an abstract class Staff with protected members id and name. Define a parameterized
constructor. Define one subclass OfficeStaff with member department. Create n objects of
OfficeStaff and display all details.
Solution:
import java.util.*;
abstract class Staff
{
 protected int id;
 protected String name;
 public Staff(int id,String name)
 {
 this.id=id;
 this.name=name;
 }
}
class OfficeStaff extends Staff
{
 String dept;
 OfficeStaff(int id,String name,String dept)
 {
 super(id,name);
 this.dept=dept;
 }
 public void display()
 {
 System.out.println("ID :"+id+" Name :"+name+" Department :"+dept);
 }
 public static void main(String args[])
 {
 int n,id;
 String name,dept;
 Scanner sc=new Scanner(System.in);
 System.out.println("How many staff members?");
 n=sc.nextInt();
 OfficeStaff ob[]=new OfficeStaff[n];
 System.out.println("Enter details of "+n+" staff");
 for(int i=0;i<n;i++)
 {

 System.out.println("Enter id,name, department");
 id=sc.nextInt();
 name=sc.next();
 dept=sc.next();
 ob[i]=new OfficeStaff(id,name,dept);
 }
 System.out.println("Entered Details are\n");
 for(int i=0;i<n;i++)
 {
 ob[i].display();
 }
 }
} 
