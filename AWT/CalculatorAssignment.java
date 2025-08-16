package AWT;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Toolkit;

public class CalculatorAssignment extends Frame {
    Frame f;
    TextField tf;
    Button b1;
    CalculatorAssignment(String s)
    {
        f=new Frame(s);
        tf=new TextField();
        tf.setBounds(7,100,421,90);
        f.add(tf);
        /////////////////////
        b1=new Button("MC");
        b1.setBounds(10,190,71,40);
        f.add(b1);
         b1=new Button("MR");
        b1.setBounds(80,190,71,40);
        f.add(b1);
         b1=new Button("M+");
        b1.setBounds(150,190,71,40);
        f.add(b1);
         b1=new Button("M-");
        b1.setBounds(220,190,71,40);
        f.add(b1);
         b1=new Button("MS");
        b1.setBounds(290,190,71,40);
        f.add(b1);
        b1=new Button("M^");
        b1.setBounds(360,190,69,40);
        f.add(b1);
        ////////////////////////////
        b1=new Button("%");
        b1.setBounds(10,230,103,50);
        f.add(b1);
        b1=new Button("CE");
        b1.setBounds(115,230,103,50);
        f.add(b1);
        b1=new Button("C");
        b1.setBounds(220,230,103,50);
        f.add(b1);
        
        b1=new Button("<=");
        b1.setBounds(325,230,103,50);
        f.add(b1);
        
        ////////////////
        b1=new Button("1/x");
        b1.setBounds(10,280,103,50);
        f.add(b1);
        b1=new Button("x²");
        b1.setBounds(115,280,103,50);
        f.add(b1);
        b1=new Button("2!x");
        b1.setBounds(220,280,103,50);
        f.add(b1);
        
        b1=new Button("÷");
        b1.setBounds(325,280,103,50);
        f.add(b1);
         ////////////////
        b1=new Button("7");
        b1.setBounds(10,330,103,50);
        f.add(b1);
        b1=new Button("8");
        b1.setBounds(115,330,103,50);
        f.add(b1);
        b1=new Button("9");
        b1.setBounds(220,330,103,50);
        f.add(b1);
        b1=new Button("×");
        b1.setBounds(325,330,103,50);
        f.add(b1);
        ///////////////
        b1=new Button("4");
        b1.setBounds(10,380,103,50);
        f.add(b1);
        b1=new Button("5");
        b1.setBounds(115,380,103,50);
        f.add(b1);
        b1=new Button("6");
        b1.setBounds(220,380,103,50);
        f.add(b1);
        b1=new Button("−");
        b1.setBounds(325,380,103,50);
        f.add(b1);
        ///////////////
        b1=new Button("1");
        b1.setBounds(10,430,103,50);
        f.add(b1);
        b1=new Button("2");
        b1.setBounds(115,430,103,50);
        f.add(b1);
        b1=new Button("3");
        b1.setBounds(220,430,103,50);
        f.add(b1);
        b1=new Button("+");
        b1.setBounds(325,430,103,50);
        f.add(b1);
        //////////////////////
        b1=new Button("+/-");
        b1.setBounds(10,480,103,50);
        f.add(b1);
        b1=new Button("0");
        b1.setBounds(115,480,103,50);
        f.add(b1);
        b1=new Button(".");
        b1.setBounds(220,480,103,50);
        f.add(b1);
        b1=new Button("=");
        b1.setBounds(325,480,103,50);
        f.add(b1);
        Toolkit tk=f.getToolkit();
        Dimension screenSize = tk.getScreenSize();
        // int Width=screenSize.width*8/10;
        // int Height=screenSize.height*8/10;
        f.setBounds(1000,10,598,600);
        f.setLayout(null);
        f.setSize(437,545);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorAssignment("Calculator");
    }
}
