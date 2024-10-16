
Slip5_1: Write a program for multilevel inheritance such that Country is inherited from
Continent.State is inherited from Country. Display the place, State, Country and Continent.
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Continent{
String con;
InputStreamReader i = new InputStreamReader(System.in);
BufferedReader r = new BufferedReader(i);
void con_input() throws IOException
{
System.out.println("Enter the continent name:");
con = r.readLine();
}
}
class Country extends Continent
{
String cou;
void cou_input()throws IOException
{
System.out.println("Enter the country name:");
cou = r.readLine();}
}
class State extends Country
{
String sta;
void sta_input()throws IOException
{
System.out.println("Enter the state name:");
sta = r.readLine();}
}
class Main extends State
{
String pla;
void pla_input()throws IOException
{
System.out.println("Enter the place name:");
pla = r.readLine();}
public static void main(String args[])throws IOException
{
Main s = new Main();
s.con_input();
s.cou_input();
s.sta_input();
s.pla_input();
System.out.println("place is:"+s.pla);
System.out.println("state is:"+s.sta);
System.out.println("country is:"+s.cou);
System.out.println("continent is:"+s.con);
}
}


Slip5_2: Write a menu driven program to perform the following operations on
multidimensional array ie matrices :  Addition
 Multiplication
import java.util.*;
class Matrix
{
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 int M[][] = new int[a][b];
 void accept()
 {
 int a = this.a;
 int b = this.b;
 System.out.println("enter the "+(a*b)+ " values to matrix:");
 for(int i=0;i<a;i++)
 {
 for(int j=0;j<b;j++)
 {
 this.M[i][j] = sc.nextInt();
 }

 }
 }
 void display()
 {
 for(int i =0;i<a;i++)
 {
 for(int j =0;j<b;j++)
 {
 System.out.print(" "+this.M[i][j]);
 }
 System.out.println(" ");
 }
 }
 public static void main(String a[])
 {
 System.out.println("enter size 2*2 or 3*3 or ...");
 Matrix m1 = new Matrix();
 m1.accept();
 System.out.println("values to matrix 1:");
 m1.display();
 System.out.println("enter the size:");
 Matrix m2 = new Matrix();
 m2.accept();
 System.out.println("values to matrix 2:");
 m2.display();

 int choice;
 Scanner scanner = new Scanner(System.in);
 while(true) {
 System.out.println("Press 1: Addition, 2: Multiplication, 3: Exit");
 choice = scanner.nextInt();
 switch (choice) {
 case 1:
 System.out.println("Addition is:" );
 for(int i=0;i<m1.a;i++)
 {
 for(int j=0;j<m1.b;j++)
 {
 System.out.print(" "+ (m1.M[i][j]+m2.M[i][j]));
 }
 System.out.println(" ");
 }
 break;
 case 2:
 System.out.println("Multiplication is:");
 for(int i=0;i<m2.a;i++)
 {
 for(int j=0;j<m2.b;j++)
 {
 System.out.print(" "+
(m1.M[i][j]*m2.M[i][j]));
 }
 System.out.println(" ");
 }
 break;

 case 3:
 System.exit(0);
 }
 }
 }
}

