Slip14_1: Write a program to accept a number from the user, if number is zero then throw user
defined exception “Number is 0” otherwise check whether no is prime or not (Use static keyword).
import java.util.Scanner;
import java.util.*;
class Zerono extends Exception
{}
class Prime
{
 static int count=0;
 public static void main(String args[])
 {
 int no,i,j;
 Scanner sc=new Scanner(System.in);
 try
 {
 System.out.println("enter no");
 no=sc.nextInt();
 if(no==0)
 throw new Zerono();
 if(no>0)
 {
 for(i=2;i<=no/2;i++)
 {
 if(no%i==0)
 {
 count++;
 }
 }
 }
 if(count==0)
 System.out.println("No is Prime");
 else
 System.out.println("Not a Prime number");
 }
 catch(Zerono ob)
 {
 System.out.println("no can not be zero");
 }
 }
}


Slip14_2: Write a Java program to create a Package “SY” which has a class SYMarks (members –
ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY which has a class
TYMarks (members – Theory, Practicals). Create ‘n’ objects of Student class (having rollNumber,
name, SYMarks and TYMarks). Add the marks of SY and TY computer subjects and calculate the
Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50, Pass Class for > =40 else‘FAIL’) and display the result
of the student in proper format
Package
package SY;
public class SYMarks
{
 int ct,mt,et;
 public SYMarks(int ct,int mt,int et)
 {
 this.ct=ct;
 this.mt=mt;
 this.et=et;
  }
 public void display()
 {
 System.out.println("\nMarks are;");
 System.out.println("Computer\tMaths\tElectronics");
 System.out.println(ct+"\t"+mt+"\t"+et);
 }
}
Package 2
package TY;
public class TYMarks
{
 int Theory,Practicals;
 public TYMarks(int Theory,int Practicals)
 {
 this.Theory=Theory;
 this.Practicals=Practicals;
 }
 public void display()
 {
 System.out.println("\nMarks are:");
 System.out.println("Theory\tPracticals");
 System.out.println(Theory+"\t"+Practicals);
 }
}
Mainfile
import SY.SYMarks;
import TY.TYMarks;
 import java.io.*;
class SYTY
{
 int rollno;
 int ComputerTotal, MathsTotal, ElecTotal, Theory, Practicals;
 String name;
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 public SYTY()
 {}
 public SYTY(int rollno,String name) throws Exception
 {
 this.rollno = rollno;
 this.name = name;

 System.out.println("Enter SY marks: ");

 System.out.println("\nEnter computer marks");
 ComputerTotal = Integer.parseInt(br.readLine());

 while((ComputerTotal<0 || ComputerTotal>100))
 {
 System.out.println("\n\tInvalid marks.....");

 System.out.println("Please ReEnter the marks: ");
 ComputerTotal = Integer.parseInt(br.readLine());
  }

 System.out.println("\nEnter maths marks");
 MathsTotal=Integer.parseInt(br.readLine());

 while((MathsTotal<0 || MathsTotal>100))
 {
 System.out.println("\n\tInvalid marks.....");

 System.out.println("Please Reenter the marks: ");
 MathsTotal=Integer.parseInt(br.readLine());
 }
 System.out.println("\nEnter electronics marks");
 ElecTotal = Integer.parseInt(br.readLine());

 while((ElecTotal<0 || ElecTotal>100))
 {
 System.out.println("\n\tInvalid marks.....");

 System.out.println("Please Reenter the marks: ");
 ElecTotal = Integer.parseInt(br.readLine());
 }
 SYMarks sy = new SYMarks(ComputerTotal, MathsTotal, ElecTotal);
 System.out.print("\nEnter TY marks: ");

 System.out.print("\nEnter theory marks ");
 Theory = Integer.parseInt(br.readLine());

 while((Theory<0 || Theory>100))
 {
 System.out.println("\n\tInvalid marks.....");
 System.out.println("Please Reenter the marks: ");
 Theory = Integer.parseInt(br.readLine());
 }
 System.out.print("\nEnter practicals marks ");
 Practicals = Integer.parseInt(br.readLine());

 while((Practicals<0 || Practicals>100))
 {
 System.out.println("\n\tInvalid marks.....");

 System.out.println("Please Reenter the marks: ");
 Practicals = Integer.parseInt(br.readLine());
 }
 TYMarks ty = new TYMarks(Theory, Practicals);

 CalculateGrade();
 }

 public void getdata() throws Exception
 {
 System.out.println("\nEnter number of students: ");
 int n=Integer.parseInt(br.readLine());

 SYTY object[]=new SYTY[n];

 for(int i=0; i<n; i++)
 {
 System.out.println("\nEnter name: ");
 String name = br.readLine();

 System.out.println("\nEnter roll no: ");
 int roll = Integer.parseInt(br.readLine());

 object[i] = new SYTY(roll,name);
 System.out.println("----------------------");
 }
 }

 public void CalculateGrade()
 {
 double percentage;

 percentage = (ComputerTotal+ MathsTotal + ElecTotal + Theory +
Practicals)/5;
 System.out.println("Result:");

 if(percentage >= 70)
 System.out.println("Grade:A");

  else if(percentage >= 60)
 System.out.println("Grade:B");

 else if(percentage >= 50)
 System.out.println("Grade:C");

 else if(percentage >= 40)
 System.out.println("Grade:PASS");
 else
 System.out.println("Grade:FAIL\n\tTry Again..........");
 }

 public static void main(String args[]) throws Exception
 {
 SYTY st = new SYTY();
 st.getdata();
 }
}
