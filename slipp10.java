
Slip10_1: Write a program to find the cube of given number using functional interface.
import java.util.*;
interface Cube
{
float cube();
}
class Draw implements Cube
{
public float cube()
{
System.out.println("enter the number");
Scanner sc= new Scanner (System.in);
float cu = sc.nextInt();
double cue = cu*cu*cu;
System.out.println("cube of no is:"+cue);
return 0;
}
public static void main(String args[])
{
 Draw d = new Draw();
d.cube();
}
}


Slip10_2: Write a program to create a package name student. Define class StudentInfo
with method to display information about student such as rollno, class, and percentage.
Create another class StudentPer with method to find percentage of the student. Accept
student details like rollno, name, class and marks of 6 subject from user.
PackageFIle
package student;
class StudentInfo
{
 public int r_no;
 public String name, clas;
 public int a,b,c,d,e,f;
 int sum=0;
 double per;

 public void display()
 {
 System.out.println("Roll_no : "+r_no);
 System.out.println("Name : "+name);
 System.out.println("class :"+clas);
 System.out.println("-----MARKS-------");
 System.out.println("Sub 1 : "+a);
 System.out.println("Sub 2 : "+b);
 System.out.println("Sub 3 : "+c);
 System.out.println("Sub 4 : "+d);
 System.out.println("Sub 5 : "+e);
 System.out.println("Sub 6 : "+f);
 System.out.println("Total : "+sum);
 System.out.println("percentage: "+per);
 System.out.println("------------------");
 }
}
 public class StudentPer extends StudentInfo {
 public StudentPer(int roll, String nm, String cla,int m1,int m2,int m3,int m4, int
m5,int m6)
 {
 r_no = roll;
 clas = cla;
 name = nm;
 a = m1;
 b = m2;
 c = m3;
 d = m4;
 e = m5;
 f = m6;
 sum = a+b+c+d+e+f;
 per = sum/6;
 }
}
Main File
import student.StudentPer;
import java.util.*;
import java.lang.*;
import java.io.*;
class StudentMain
{
 public static void main(String[] args)
 {
 String nm, clas;
 int roll;
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter Roll no:= ");
 roll = sc.nextInt();
 System.out.print("Enter Name:= ");
 nm = sc.next();
 System.out.print("Enter class:= ");
 clas= sc.next();

 int m1,m2,m3,m4,m5,m6;
 System.out.print("Enter 6 sub mark:= ");
 m1 = sc.nextInt();
 m2 = sc.nextInt();
 m3 = sc.nextInt();
 m4 = sc.nextInt();
  m5 = sc.nextInt();
 m6 = sc.nextInt();

 StudentPer s = new StudentPer(roll,nm,clas,m1,m2,m3,m4,m5,m6);
 s.display();
 }
}

