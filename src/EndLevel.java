import javax.swing.*;
import java.awt.*;

public class EndLevel extends JPanel {
    public Car endingPosition;
    public int endX;
    public int endY;
    public int endWidth;
    public int endHeight;
    public Color color;

    public EndLevel(){
        endingPosition = new Car("END_LEVEL",3,7, Color.LIGHT_GRAY);
        this.endX=endingPosition.getCar().getX();
        this.endY=endingPosition.getCar().getY();
        this.endWidth=endingPosition.getCar().getWidth();
        this.endHeight=endingPosition.getCar().getHeight();
        this.color=Color.LIGHT_GRAY;
    }
}
