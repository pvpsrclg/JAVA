Slip4_1: Write a program to print an array after changing the rows and columns of a given twodimensional array.
import java.util.*;
class ArrTrans
{
 public static void main(String args[])
 {
 System.out.println("enter the row and column");
 Scanner sc = new Scanner(System.in);
 int r = sc.nextInt();
 int c = sc.nextInt();
 int mat[][] = new int[r][c];
 System.out.println("enter the array elts:");
 for(int i=0;i<r;i++)
 {
 for(int j=0;j<c;j++)
 {

 mat[i][j] = sc.nextInt();
 }
 }
 System.out.println("the matrix is:");
 for(int i=0;i<c;i++)
 {
 for(int j=0;j<r;j++)
 {
 System.out.print(" " +mat[j][i]);
 }
 System.out.println(" ");
 }
 }
}


Slip4_2: Write a program to design a screen using Awt that will take a user name and password.
If the user name and password are not same, raise an Exception with appropriate message.
User can have 3 login chances only. Use clear button to clear the TextFields.
import java.awt.*;
import java.awt.event.*;
class InvalidPasswordException extends Exception
{
 InvalidPasswordException()
 {
 System.out.println(" User name and Password is not same");
 }
}
class PasswordDemo extends Frame implements ActionListener
{
Label uname,upass;
TextField nametext;
TextField passtext,msg;
Button login,Clear;
Panel p;
int attempt=0;
char c= '*' ;
public void login()
{
 p=new Panel();
 uname=new Label("Use Name: " ,Label.CENTER);
 upass=new Label ("Password: ",Label.RIGHT);
 nametext=new TextField(20);
 passtext =new TextField(20);
 passtext.setEchoChar(c);
 msg=new TextField(10);
 msg.setEditable(false);
 login=new Button("Login");
 Clear=new Button("Clear");
 login.addActionListener(this);
 Clear.addActionListener(this);
 p.add(uname);
 p.add(nametext);
 p.add(upass);
 p.add(passtext);
 p.add(login);
 p.add(Clear);
 p.add(msg);
 add(p);
 setTitle("Login ");
 setSize(290,200);
 setResizable(false);
 setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
 Button btn=(Button)(ae.getSource());
 if(attempt<3)
 {
 if((btn.getLabel())=="Clear")
 {
 nametext.setText("");
 passtext.setText("");
 }
 if((btn.getLabel()).equals("Login"))
 {
 try
 {
 String user=nametext.getText();
 String upass=passtext.getText();
 if(user.compareTo(upass)==0)
 {
 msg.setText("Valid");
 System.out.println("Username is valid");
}
else
{
throw new InvalidPasswordException();
}
}
catch(Exception e)
{
msg.setText("Error");
}
attempt++;
}
}
else
{
System.out.println("you are using 3 attempt");
System.exit(0);
}
}
public static void main(String args[])
{
PasswordDemo pd=new PasswordDemo();
pd.login();
}
}
