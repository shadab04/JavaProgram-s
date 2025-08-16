package AWT;
import java.awt.*;

public class FrameUsingInheritance {
    Frame f;
    TextField tf;
    Button b1;
    FrameUsingInheritance(String s)
    {
        f=new Frame(s);
        tf=new TextField();
        tf.setBounds(40,40,60,30);
        f.add(tf);
        b1=new Button("OK");
        b1.setBounds(40,100,40,40);
        f.add(b1);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new FrameUsingInheritance("FF");
    }
}