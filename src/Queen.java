import javax.swing.*;

public class Queen extends Piece {

    public Queen(){
        super();
        this.color = "White";
        assignIcon(this.color);
    }

    public Queen(String color) {
        super();
        this.color = color;
        assignIcon(this.color);
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);

    }
    public Queen(int x,int y,String color) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.color = color;
        assignIcon(this.color);
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);
    }
    public Queen(int x,int y,String color, boolean NoSuper) {
        this.x = x;
        this.y = y;
        this.color = color;
        assignIcon(this.color);
        this.isDead = false;
        assignBounds(x,y);
    }
    public Queen(int x,int y) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.color = "White";
        assignIcon(this.color);
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);
    }


    private void assignIcon(String color) {
        if (color.equals("White")) {
            setIcon(new ImageIcon(getClass().getResource("whiteQueen.png")));
        } else {
            setIcon(new ImageIcon(getClass().getResource("blackQueen.png")));
        }

    }
}
