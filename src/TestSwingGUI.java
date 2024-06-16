import javax.swing.JFrame;

public class TestSwingGUI {

    public static void main(String[] args){
        Activity activity = new Activity();

        activity.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        activity.setSize(400,400);
        activity.setVisible(true);

    }
}
