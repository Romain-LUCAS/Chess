
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;






public class JFrameTutorial extends JFrame {

    private JLabel label;

    public JFrameTutorial() {
        label = new JLabel("This is a btnGridLabel");
        label.setText("Actually this is the text");
        label.setToolTipText("This is what you see if you hover over it");
        add(label);

    }

    public static void main(String[] args) {
        JFrameTutorial myFrame = new JFrameTutorial();
        myFrame.setLayout(new FlowLayout());
        myFrame.setSize(300,300);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        myFrame.setVisible(true);



    }
}
