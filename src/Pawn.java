

import javax.swing.*;


public class Pawn extends Piece {

    public Pawn(){
        super();
        this.color = "White";
        assignIcon(this.color);
    }

    public Pawn(String color) {
        super();
        this.color = color;
        assignIcon(this.color);
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);

    }
    public Pawn(int x,int y,String color) {
        super(x, y);
        //this.x = x;
        //this.y = y;
        this.color = color;
        assignIcon(this.color);
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);
    }
    public Pawn(int x,int y) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.color = "White";
        setIcon(new ImageIcon(getClass().getResource("whitePawn.png")));
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);
    }



    public void move() { // will go to piece
        System.out.println("Pawn.move function");
        this.x--;
        return;
    }
    private void assignIcon(String color){
        if (color.equals("White")){
            setIcon(new ImageIcon(getClass().getResource("whitePawn.png")));
        } else {
            setIcon(new ImageIcon(getClass().getResource("blackPawnStroke.png")));
        }
    }
}
