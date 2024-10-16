Slip27_1: Define an Employee class with suitable attributes having getSalary() method,
which returns salary withdrawn by a particular employee. Write a class Manager which
extends a class Employee, override the getSalary() method, which will return salary of
manager by adding traveling allowance, house rent allowance etc.
import java.util.*;
class Employee
{
 int BasicSalary=35000;
 public void getSalary()
 {
 System.out.println("Employee Salary:"+BasicSalary);
 }
}
class Manager extends Employee
{
 int traveling =2000;
 int rent =5000;

 public void getSalary()
 {

 System.out.println("Manager Salary:"+(BasicSalary+traveling+rent));
 System.out.println("Basic Salary:"+BasicSalary);
 System.out.println("Travaling Allowance:"+traveling);
 System.out.println("House rent:"+rent);

 }
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Press 1 for Employee Salary and 0 for Manager");
 int ch=sc.nextInt();
 if(ch==1)
 {
 Employee Eob=new Employee();
 Eob.getSalary();
 }
 else if(ch == 0)
 {
 Manager Mob=new Manager();
 Mob.getSalary();
 }
 else
 System.out.println("Entered Wrong Choice");

 }
}


Slip27_2: Write a program to accept a string as command line argument and check
whether it is a file or directory. Also perform operations as follows:
i)If it is a directory,delete all text files in that directory. Confirm delete
operation from user before deleting text files. Also, display a count showing
the number of files deleted, if any, from the directory.
ii)If it is a file display various details of that file.
import java.util.*;
import java.io.*;
class slip27_2
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 String fname=args[0];
 File f=new File(fname);
 if(f.isFile())
 {
 System.out.println("File Name:"+ f.getName());
 System.out.println("File Length:"+ f.length());
 System.out.println("File Absolute Path:"+ f.getAbsolutePath());
 System.out.println("File Path:"+ f.getPath());

 }
 else if(f.isDirectory())
 {
 System.out.println("Sure you want Delete All Files (Press 1)");
 int n=sc.nextInt();
 if(n==1)
 {
 String[] s1=f.list();
 String a=".txt";
 for(String str: s1)
 {
 System.out.println(str);
 if(str.endsWith(a))
 {
 File f1=new File(fname, str);
 System.out.println(str+"-->Deleted");
 f1.delete();
  }
 }

 }
 else
 System.out.println("OKKKK");
 }
 }
}



