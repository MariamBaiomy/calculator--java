
package calculator;

import java.awt.*;
import javax.swing.*;



public class Calc extends JFrame {
    JPanel container, frame1,frame2,frame3;
    JMenu menu1,menu2;
    JMenuBar tools;
    JTextField text;
    JButton p1 = new JButton(  "1"  );
    JButton p2 = new JButton(  "2"  );
    JButton p3 = new JButton(  "3"  );
    JButton p4 = new JButton(  "4"  );
    JButton p5 = new JButton(  "5"  );
    JButton p6 = new JButton(  "6"  );
    JButton p7 = new JButton(  "7"  );
    JButton p8 = new JButton(  "8"  );
    JButton p9 = new JButton(  "9"  );
    JButton p0 = new JButton(  "0"  );
    JButton add = new JButton(  "+"  );
    JButton sub = new JButton(  "-"  );
    JButton mult = new JButton(  "*"  );
    JButton dot = new JButton(  "."  );
    JButton div = new JButton(  "/"  );
    JButton adds = new JButton(  "-+"  );
    JButton sq = new JButton(  "x^2"  );
    JButton cub = new JButton(  "x^3"  );
    JButton n = new JButton(  "x^y"  );
    JButton sqr = new JButton(  "#"  );
    JButton cubr = new JButton(  "#3"  );
    JButton nroot = new JButton(  "#n"  );
    JButton sine = new JButton(  "sine"  );
    JButton cosine = new JButton(  "cos"  );
    JButton tan = new JButton(  "tan"  );
    JButton asine = new JButton(  "asine"  );
    JButton acos = new JButton(  "acos"  );
    JButton atan = new JButton(  "atan"  );
    JButton sinh = new JButton(  "sinh"  );
    JButton cosh = new JButton(  "cosh"  );
    JButton tanh = new JButton(  "tanh"  );
    JButton inv= new JButton(  "1/x"  );
    JButton fact = new JButton(  "n!"  );
    JButton exp = new JButton(  "exp"  );
    JButton log = new JButton(  "log"  );
    JButton lp= new JButton(  "("  );
    JButton rp= new JButton(  ")"  );
    JButton comp = new JButton(  "nCr"  );
    JButton p = new JButton(  "nPr"  );
    JButton pi = new JButton(  "pi"  );
    JButton del = new JButton(  "DEL"  );
    JButton clr = new JButton(  "CLR"  );
    JButton ans= new JButton(  "ANS"  );
    JButton exit = new JButton(  "EXIT"  );
    JCheckBox sci =new JCheckBox("Scientific");
    JButton log10 = new JButton(  "log10"  );
    
 public Calc(){
     this.setTitle("Calculator");
     this.setSize(750,450);
     this.setVisible(true);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLayout(null);
    
    
     text = new JTextField(40);
     container = new JPanel();
     frame1 = new JPanel();
     frame2 = new JPanel();
     frame3 = new JPanel();
     menu1 = new JMenu("File");
     menu2 = new JMenu("Help");
     tools = new JMenuBar();
     
     container.setBackground(Color.LIGHT_GRAY);
     frame1.setBackground(Color.PINK);
     frame2.setBackground(Color.PINK);
     frame3.setBackground(Color.PINK);
     frame2.setLayout(new GridLayout(4,4,10,30));
     frame3.setLayout(new GridLayout(5,5,10,30));
     
     
     
    frame1.add(del);
    frame1.add(clr);
    frame1.add(ans);
    frame1.add(exit);
    frame2.add(p7);
    frame2.add(p8);
    frame2.add(p9);
    frame2.add(add);
    frame2.add(p4);
    frame2.add(p5);
    frame2.add(p6);
    frame2.add(sub);
    frame2.add(p1);
    frame2.add(p2);
    frame2.add(p3);
    frame2.add(mult);
    frame2.add(p0);
    frame2.add(dot);
    frame2.add(adds);
    frame2.add(div);
    frame3.add(sq);
    frame3.add(cub);
    frame3.add(n);
    frame3.add(inv);
    frame3.add(lp);
    frame3.add(sqr);
    frame3.add(cubr);
    frame3.add(nroot);
    frame3.add(fact);
    frame3.add(rp);
    frame3.add(sine);
    frame3.add(cosine);
    frame3.add(tan);
    frame3.add(exp);
    frame3.add(p);
    frame3.add(asine);
    frame3.add(acos);
    frame3.add(asine);
    frame3.add(atan);
    frame3.add(log);
    frame3.add(comp);
    frame3.add(sinh);
    frame3.add(cosh);
    frame3.add(tanh);
    frame3.add(log10);
    frame3.add(pi);
    container.add(sci);
    
    
    
     container.setLayout(null);
     frame1.setLayout(null);
     del.setBounds(10,5,70,40);
     clr.setBounds(90,5,70,40);
     ans.setBounds(540,5,70,40);
     exit.setBounds(620,5,70,40);
     
    //setbounds
     frame1.setBounds(20, 70, 700, 50);
     container.setBounds(0, 20, 750,450);
     text.setBounds(20, 5, 700, 30);
     frame2.setBounds(20, 150, 300, 230);
     frame3.setBounds(370, 150, 350, 230);
     sci.setBounds();
     
     this.add(frame1);
     this.add(frame2);
     this.add(frame3);
     container.add(text);
     this.add(container);
     tools.add(menu1);
     tools.add(menu2);
     tools.setBounds(0, 0, 750, 20);
     this.add(tools);
     
     
 
 }
    
   
    
    
}
