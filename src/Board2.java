import javax.swing.*;
import java.awt.*;


public class Board2 extends JLayeredPane {


    public JLabel btnGridLabel;
    public JLabel background;
    public JLabel piecesLabels;

    public Board2() {
        // Creating panel representing the Board Board

        background = new JLabel(new ImageIcon(getClass().getResource("chessBoardBrown.png")));
        background.setBounds(0,0,800,800);


        btnGridLabel = new JLabel();
        btnGridLabel.setLayout(new GridLayout(8,8));
        btnGridLabel.setBounds(0,0,800,800);



        //label2 = new JLabel(new ImageIcon(getClass().getResource("pawn.png")));


       /* Icon image = new ImageIcon(getClass().getResource("pawn.png"));
        btn1 = new JButton(null,image);
        btn1.setPreferredSize(new Dimension(100,100));
        btn1.setOpaque(false);
        btn1.setContentAreaFilled(false);
        btn1.setContentAreaFilled(false);
        btn1.addActionListener(handler);

        btn2 = new JButton(null,image);
        btn2.setPreferredSize(new Dimension(100,100));
        btn2.setOpaque(false);
        btn2.setContentAreaFilled(false);
        btn2.setContentAreaFilled(false);

*/

        Handler handler = new Handler();
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {

                TileButton btn = new TileButton(j,i);
                btn.setName(j + ", " + i);
                btn.setPreferredSize(new Dimension(100, 100));
                btn.setOpaque(false);
                btn.setContentAreaFilled(false);
                btn.setContentAreaFilled(false);
                btn.addActionListener(handler);
                btnGridLabel.add(btn);
            }
        }

        add(background,2);
        add(btnGridLabel, 0);
    }
}
