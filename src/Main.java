import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        String fnum = JOptionPane.showInputDialog("Enter First Integer");
        String snum = JOptionPane.showInputDialog("Enter Second Integer");
        String tnum = JOptionPane.showInputDialog("Enter Third integer");

        int num1 = Integer.parseInt(fnum);
        int num2 = Integer.parseInt(snum);
        int num3 = Integer.parseInt(tnum);
        int temp;

        if (num1 < num2){
          temp = num1;
          num1  = num2;
           num2 = temp;
        }
        if(num1<num3){
            temp = num1;
            num1 = num3;
            num3=temp;

        }
        if(num2<num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        JOptionPane.showMessageDialog(null, "The values are:" + "\n" + num1 +" "+ " "+num2 +" " +num3 );
    }
}