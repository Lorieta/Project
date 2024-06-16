import java.awt.*;
import javax.swing.JFrame;
import  javax.swing.JLabel;

import javax.swing.SwingConstants;
import javax.swing.Icon;
import  javax.swing.ImageIcon;


public class Activity extends JFrame{

    private JLabel label1;
    private JLabel label2;
    private  JLabel label3;
    public Activity(){


        super(("Newlabel"));
        setLayout(new FlowLayout());
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label 1");
        add(label1);

        Icon icon = new ImageIcon(getClass().getResource("bir.png"));
        label2= new JLabel("Label with text and Icon",icon,SwingConstants.LEFT);
        label2.setToolTipText("This is label 2");
        add(label2);

        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(icon);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);


    }

}
