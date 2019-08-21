import javax.swing.*;

public class Rook extends Piece {

    public Rook(){
        super();
        this.color = "White";
        assignIcon(this.color);
    }

    public Rook(String color) {
        super();
        this.color = color;
        assignIcon(this.color);
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);

    }
    public Rook(int x,int y,String color) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.color = color;
        assignIcon(this.color);
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);
    }
    public Rook(int x,int y) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.color = "White";
        assignIcon(this.color);
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);
    }
    public Rook(int x,int y,String color, boolean NoSuper) {
        this.x = x;
        this.y = y;
        this.color = color;
        assignIcon(this.color);
        this.isDead = false;
        assignBounds(x,y);
    }


    private void assignIcon(String color) {
        if (color.equals("White")) {
            setIcon(new ImageIcon(getClass().getResource("whiteRook.png")));
        } else {
            setIcon(new ImageIcon(getClass().getResource("blackRook.png")));
        }

    }
}