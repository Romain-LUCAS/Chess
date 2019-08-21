import javax.swing.*;
import java.awt.*;

public class PiecesIconPanel extends JLayeredPane {


   public PiecesIconPanel() {
       super();
       setSize(850, 850);
       setLocation(50, 50);
   }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.red);

        g.setColor(Color.red);
        g.fillRect(500,100,400,400);


    }

}
