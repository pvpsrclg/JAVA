
Slip11_1: Define an interface “Operation” which has method volume( ).Define a constant PI
having a value 3.142 Create a class cylinder which implements this interface (members –
radius,height). Create one object and calculate the volume.
import java.io.*;
interface Operation
{
 final static float pi=3.142f;
 void area();
 void volume();
}
class Cylinder implements Operation
{
 double radius,height;
 void input() throws Exception
 {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.print("\n Enter the radius and height=");
 radius=Double.parseDouble(br.readLine());
 height=Double.parseDouble(br.readLine());
 }
 public void area()
 {
 double a=(2*pi*radius*height)+(2*pi*radius*radius);
 System.out.println("the area of cylinder is " +a);
 }
 public void volume()
 {
 double v=pi*radius*radius*height;
 System.out.println("the volume of cylinder is "+v);
 }
}
 class slipno11a
{
 public static void main(String args[]) throws Exception
 {
 Cylinder C1=new Cylinder();
 C1.input();
 C1.area();
 C1.volume();
 }
}


Slip11_2: Write a program to accept the username and password from user if username and
password are not same then raise "Invalid Password" with appropriate msg.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class InvalidPasswordException extends Exception
{}
class Userpassword extends JFrame implements ActionListener
{
 JLabel name, pass;
 JTextField nameText;
 JPasswordField passText;
 JButton login, end;
 static int cnt=0;
 Userpassword()
 {
 name = new JLabel("Name : ");
 pass = new JLabel("Password : ");
 nameText = new JTextField(20);
 passText = new JPasswordField(20);
 login = new JButton("Login");
 end = new JButton("End");
 login.addActionListener(this);
 end.addActionListener(this);
 setLayout(new GridLayout(3,2));
 add(name);
 add(nameText);
 add(pass);
 add(passText);
 add(login);
 add(end);
 setTitle("Login Check");
 setSize(300, 300);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);

 }
 public void actionPerformed (ActionEvent e)
 {
 if(e.getSource()==end)
 {
 System.exit(0);
 }
 if(e.getSource()==login)
 {
 try
 {
 String user = nameText.getText();
 String pass = new String(passText.getPassword());
 if(user.compareTo(pass)==0)
 {
 JOptionPane.showMessageDialog(null, "Login Successful",
"Login", JOptionPane. INFORMATION_MESSAGE);
 System.exit(0);
 }
 else
 {
 throw new InvalidPasswordException();
 }
 }
 catch(Exception e1)
  {
 cnt++;
 JOptionPane.showMessageDialog(null, "Login Failed", "Login",
JOptionPane.ERROR_MESSAGE);
 nameText.setText("");
 passText.setText("");
 nameText.requestFocus();
 if(cnt==3)
 {
 JOptionPane.showMessageDialog(null,"3 Attempts Over",
"Login", JOptionPane.ERROR_MESSAGE);
 System.exit(0);
 }

 }
 }
 }
 public static void main(String args[])
 {
 new Userpassword();
 }
}
