import  java.awt.FlowLayout;
import  java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import  javax.swing.ListSelectionModel;
public class Jlist extends JFrame implements ActionListener extends EventListener {
    private JList colorlist;
    private  static final  String[] colorNames = {"Black","Pink","Yellow","Green","Blue"};
    private  static final  Color[] colors= {Color.black,Color.pink,Color.yellow,Color.green,Color.blue};

    public Jlist(){
        super("List Example");
        setLayout(new FlowLayout());

        colorlist= new JList(colorNames);
        colorlist.setVisibleRowCount(5);
        colorlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(colorlist));

        colorlist.addListSelectionListener((new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                {

                        getContentPane().setBackground(colors[colorlist.getSelectedIndex()]);


                }
            }
        }));
    }

    public static void main(String[] args){

        Jlist jlist = new Jlist();
        jlist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlist.setSize(350,150);
        jlist.setVisible(true);
    }
}
