Slip18_1: Write a program to implement Border Layout Manager.
import java.awt.*;
import javax.swing.*;
class FrameDemo extends JFrame
{
 FrameDemo()
 {
 JButton b1=new JButton("North");
 JButton b2=new JButton("South");
 JButton b3=new JButton("East");
 JButton b4=new JButton("West");
 JButton b5=new JButton("Center");
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 add(b1,BorderLayout.NORTH);
 add(b2,BorderLayout.SOUTH);
 add(b3,BorderLayout.EAST);
 add(b4,BorderLayout.WEST);
 add(b5,BorderLayout.CENTER);
 setSize(300,300);
 setVisible(true);
 }
 public static void main(String[] args)
 {
 FrameDemo ob=new FrameDemo();
 }
}


Slip18_2:
Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns,
bat_avg).
Create an array of n player objects. Calculate the batting average for each player
using static method avg(). Define a static sort method which sorts the array on the
basis of average.
Display the player details in sorted order.
import java.util.Scanner;
class cricket
{
 int inning, tofnotout, totalruns;
 String name;
 float batavg;
 int i;
 cricket()
{
 name= null;
 inning= 0;
 tofnotout= 0;
 totalruns=0;
 batavg= 0;
}
void get()
{
 Scanner s1= new Scanner(System.in);
 System.out.println("name, no of innings, no of time(s) not out, total runs");
 name= s1.nextLine();
 inning= s1.nextInt();
 tofnotout= s1.nextInt();
 totalruns= s1.nextInt();
}
void put()
{
 System.out.println("name: "+name);
 System.out.println("no of innings: "+inning);
 System.out.println("no of time(s) not out: "+tofnotout);
 System.out.println("total runs: "+totalruns);
 System.out.println("batting average: "+batavg);
}
static void avg(int n, cricket c[])
{
 for(int i=0; i<n; i++)
 {
 c[i].batavg= c[i].totalruns/c[i].inning;
 }
}
static void sort(int n, cricket c[])
{
 String temp1;
 int temp2, temp3, temp4;
 float temp5;
 for(int i=0; i<n; i++)
 {
 for(int j=i+1; j<n; j++)
 {
 if(c[i].batavg<c[j].batavg)
 {
 temp1= c[i].name;
 c[i].name= c[j].name;
 c[j].name= temp1;
 temp2= c[i].inning;
 c[i].inning= c[j].inning;
 c[j].inning= temp2;
 temp3= c[i].tofnotout;
 c[i].tofnotout= c[j].tofnotout;
 c[j].tofnotout= temp3;
 temp4= c[i].totalruns;
 c[i].totalruns= c[j].totalruns;
 c[j].totalruns= temp4;
 temp5= c[i].batavg;
 c[i].batavg= c[j].batavg;
 c[j].batavg= temp5;
 }
 }
 }
 }
}
class setBb
{
 public static void main(String args[])
 {
 Scanner s1= new Scanner(System.in);
 System.out.println("Enter The Limit: ");
 int n= s1.nextInt();
 cricket c[]= new cricket[n];
 for(int i=0; i<n; i++)
 {
 c[i]= new cricket();
 c[i].get();
 }
 cricket.avg(n, c);
 cricket.sort(n,c);
 for(int i=0; i<n; i++)
 {
 c[i].put();
 }
 }
}
