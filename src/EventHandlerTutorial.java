import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.util.concurrent.Flow;


public class EventHandlerTutorial extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField1;


    public EventHandlerTutorial(){
        super("the Title");
        this.setLayout(new FlowLayout());
        textField1 = new JTextField("This is text field 1 message");
        textField2 = new JTextField("This is text field 2 message");

        textField3 = new JTextField("This is text field 3 message");
        textField3.setEditable(false);

        add(textField1);
        add(textField2);
        add(textField3);

        passwordField1 = new JPasswordField("my pass");
        add(passwordField1);

        thehandler handler = new thehandler();
        textField1.addActionListener(handler); // now all objects have an action listenner build in !
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField1.addActionListener(handler);
    }

    private class thehandler implements ActionListener{

        public void actionPerformed(ActionEvent event){ // this method calls itself automatically whenever some does an action (enter).

            String string = "";

            //Then we want to test from which source the enter signal came from, and we modify the appropriate field

            if(event.getSource()==textField1){
                string = String.format("field 1: %s", event.getActionCommand());
            } else if(event.getSource() == textField2){
                string = String.format("field 2: %s", event.getActionCommand());

            } else if(event.getSource() == textField3){
                string = String.format("field 3: %s", event.getActionCommand());
            } else if(event.getSource() == passwordField1) {
                string = String.format("password field is : %s", event.getActionCommand());
            }
            JOptionPane.showMessageDialog(null,string);
        }
    }

// -------------------------------------------------
    public static void main(String[] args) {

        EventHandlerTutorial aFrame = new EventHandlerTutorial();
        aFrame.setSize(300,300);
        aFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        aFrame.setVisible(true);
    }
}



