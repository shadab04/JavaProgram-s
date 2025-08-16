package AWT;
import java.awt.*;
public class FrameViaAssociation {
    Frame f;
    FrameViaAssociation(String s)
    {
        f=new Frame(s);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new FrameViaAssociation("FF");
        new FrameViaAssociation("SF");
    }
}
