import javax.swing.*;

public class King extends Piece {

    public King(){
        super();
        this.color = "White";
        assignIcon(this.color);
    }

    public King(String color) {
        super();
        this.color = color;
        assignIcon(this.color);
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);

    }
    public King(int x,int y,String color) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.color = color;
        assignIcon(this.color);
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);
    }
    public King(int x,int y) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.color = "White";
        assignIcon(this.color);
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);
    }


    private void assignIcon(String color) {
        if (color.equals("White")) {
            setIcon(new ImageIcon(getClass().getResource("whiteKing.png")));
        } else {
            setIcon(new ImageIcon(getClass().getResource("blackKing.png")));
        }

    }
}
