import javax.swing.*;

public class TileButton extends JButton {
    public int x;
    public int y;
    public boolean isFree;
    public Piece piece;

    public TileButton (){
        super();
        this.x = 0;
        this.y = 0;
        this.piece = null;
        this.isFree = false;
    }
    public TileButton (int x, int y){
        super();
        this.x = x;
        this.y = y;
        this.piece = null;
        this.isFree = false;
    }

    @Override
    public String toString() {
        return super.toString() + " Tile return value : x = " + this.x +","+"y = " + this.y;
    }
}
