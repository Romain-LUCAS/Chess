import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Board extends JFrame {
    public JButton btn1;
    public JButton btn2;
    public JLayeredPane panel;
    public JLabel label;
    public JButton[][] btnArray ;
    public JButton[] btnRow;
    public JLabel label2;

    public Board() {
        // Board
        super("Chess");
        setLayout(new FlowLayout());
        panel = new JLayeredPane();
        panel.setLayout(new FlowLayout());
        label = new JLabel(new ImageIcon(getClass().getResource("chessBoardBrown.png")));
        label.setLayout(new GridLayout(8,8));


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
                label.add(btn);
                //btnRow[j - 1] = btn;
            }
            //btnArray[i - 1] = btnRow;
        }
        //System.out.println("button array is " + btnArray);


        panel.add(label,new Integer(2));
        add(panel);

    }
}
