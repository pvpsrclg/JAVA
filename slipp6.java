Slip6_1: Write a program to display the Employee(Empid, Empname,
mpdesignation, Empsal) information using toString().
. class Emp
{
 int id,salary;
 String name;
 String desig;
 Emp(int id, String name, int salary ,String desig)
 {
 this.id=id;
 this.name=name;
 this.salary=salary;
 this.desig=desig;
 }
 public String toString() // overrides toString() method
 {
 return id+" "+name+" "+salary+" "+desig;
 }
 public static void main(String args[])
 {
 Emp E1=new Emp(111,"Rakesh",50000,"bsc cs");
 Emp E2=new Emp(112,"Suresh",25000,"msc cs");
 System.out.println("Employee details: "+E1);
 System.out.println("Employee details: "+E2);
  }
}


Slip6_2: Create an abstract class “order” having members id, description. Create two
subclasses “PurchaseOrder” and “Sales Order” having members customer name and
Vendor name respectively. Definemethods accept and display in all cases. Create 3
objects each of Purchase Order and Sales Order and accept and display details.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
abstract class Order{
String id,des;
}
class Porder extends Order{
String cnm, vnm;
public void accept()throws IOException{
System.out.println("enter id, description,names of customers and vendors");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
id = br.readLine();
des= br.readLine();
cnm = br.readLine();
vnm = br.readLine();
}
public void display(){
System.out.println("id"+id);
System.out.println("Description"+des);
System.out.println("Customer Name"+cnm);
System.out.println("Vendor Name"+vnm);
System.out.println("-------------------");
}
}
class Sorder extends Order
{
String cnm, vnm;
public void accept()throws IOException{
System.out.println("enter id, description,names of customers and vendors");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
id = br.readLine();
des= br.readLine();
cnm = br.readLine();
vnm = br.readLine();
}
public void display(){
System.out.println("id:"+id);
System.out.println("Description:"+des);
System.out.println("Customer Name:"+cnm);
System.out.println("Vendor Name:"+vnm);
 System.out.println("-------------------");
}
}
class Main{
public static void main(String args[])throws IOException{
int i;
System.out.println("Select any one:");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("1.purchase order:");
System.out.println("2.Sales order:");
System.out.println("3.Exit:");
int ch = Integer.parseInt(br.readLine());
switch(ch){
case 1:
System.out.println("enter the no of purchas order:");
int n = Integer.parseInt(br.readLine());
Porder[] l = new Porder[n];
for(i=0;i<n;i++)
{
l[i] = new Porder();
l[i].accept();
}
for(i=0;i<n;i++)
{
l[i].display();
System.out.println("Object is created:");
}
case 2:
System.out.println("enter the no of sales order:");
int m = Integer.parseInt(br.readLine());
Porder[] h = new Porder[m];
for(i=0;i<m;i++)
{
h[i] = new Porder();
h[i].accept();
}
for(i=0;i<m;i++)
{
h[i].display();
System.out.println("Object is created:");
}
case 3:
System.out.println("exit:");
System.exit(0);
}
}
}
