
Slip16_1: Write a program to find the Square of given number using function interface.
interface Square {
 int calculate(int x);
}
class Slip16_1 {
 public static void main(String args[])
 {
 //you can read value from user
 int a = 5;
 Square s = (int x) -> x * x;
 int ans = s.calculate(a);
 System.out.println(ans);
 }
}


Slip16_2: Write a program to design a screen using Awt that,
import javax.swing.*;
import java.awt.*;
class MeEx
{
 JMenu File;
 JMenu Edit;
 JMenu About;
 JMenuItem i1, i2, i3, i4, i5;

 MeEx(){
 JFrame f= new JFrame("Menu and MenuItem Example");
 JMenuBar mb=new JMenuBar();
 File=new JMenu("File");
 Edit=new JMenu("Edit");
 About=new JMenu("About");
 i1=new JMenuItem("New Ctrl+N");
 i2=new JMenuItem("Open");
 i3=new JMenuItem("Save");
 i4=new JMenuItem("Show About");
 i5=new JMenuItem("Exit");
 File.add(i1); File.add(i2);
File.add(i3);File.addSeparator();File.add(i4);File.addSeparator();File.add(i5);
 mb.add(File);
 mb.add(Edit);
 mb.add(About);
 f.setJMenuBar(mb);
 f.setSize(400,400);
 f.setLayout(null);
 f.setVisible(true);
}
public static void main(String args[])
{
new MeEx();
}
}

