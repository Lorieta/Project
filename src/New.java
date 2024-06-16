import javax.swing.JOptionPane;
public class New
{ public static void main(String args[])
{ String name;
name=JOptionPane.showInputDialog("Enter your name ");
JOptionPane.showMessageDialog(null,"Hello " +
                                name,"Welcome!",JOptionPane.PLAIN_MESSAGE);
System.exit(0);



}
        }
