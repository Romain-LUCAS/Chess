

public class Dummy extends Piece {

    public Dummy(){
        super();
        setBounds(0,0,0,0);
    }

    public Dummy(String color) {
        super();
        setBounds(0,0,0,0);

    }
    public Dummy(int x,int y,String color) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.color = color;
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);
    }
    public Dummy(int x,int y) {
        super(x, y);
        setBounds(0,0,0,0);
    }


}
