package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

public class Calc extends JFrame implements ItemListener  {
	JPanel container, frame1, frame2, frame3;
	JMenu menu1, menu2;
	JMenuBar tools;
	static JTextField text;

	JButton p1 = new JButton("1");
	JButton p2 = new JButton("2");
	JButton p3 = new JButton("3");
	JButton p4 = new JButton("4");
	JButton p5 = new JButton("5");
	JButton p6 = new JButton("6");
	JButton p7 = new JButton("7");
	JButton p8 = new JButton("8");
	JButton p9 = new JButton("9");
	JButton p0 = new JButton("0");
	JButton add = new JButton("+");
	JButton sub = new JButton("-");
	JButton mult = new JButton("*");
	JButton dot = new JButton(".");
	JButton div = new JButton("/");
	JButton adds = new JButton("-+");
	JButton sq = new JButton("x^2");
	JButton cub = new JButton("x^3");
	JButton n = new JButton("x^y");
	JButton sqr = new JButton("sqrt");
	JButton cubr = new JButton("cbrt");
	JButton nroot = new JButton("Y√");
	JButton sine = new JButton("sine");
	JButton cosine = new JButton("cos");
	JButton tan = new JButton("tan");
	JButton asine = new JButton("asine");
	JButton acos = new JButton("acos");
	JButton atan = new JButton("atan");
	JButton sinh = new JButton("sinh");
	JButton cosh = new JButton("cosh");
	JButton tanh = new JButton("tanh");
	JButton inv = new JButton("1/x");
	JButton fact = new JButton("n!");
	JButton exp = new JButton("exp");
	JButton log = new JButton("log");
	JButton lp = new JButton("(");
	JButton rp = new JButton(")");
	JButton comp = new JButton("nCr");
	JButton p = new JButton("nPr");
	JButton pi = new JButton("pi");
	JButton del = new JButton("DEL");
	JButton clr = new JButton("CLR");
	JButton ans = new JButton("ANS");
	JButton exit = new JButton("EXIT");
	JCheckBox sci = new JCheckBox("Scientific");
	JButton log10 = new JButton("log10");

	// Constructor Start
	public Calc() {
		this.setTitle("Calculator");
		this.setSize(350, 480); // 750
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);

		text = new JTextField(40);
		container = new JPanel();
		frame1 = new JPanel();
		frame2 = new JPanel();
		frame3 = new JPanel();
		menu1 = new JMenu("File");
		menu2 = new JMenu("Help");
		tools = new JMenuBar();

		// set background
		container.setBackground(Color.LIGHT_GRAY);
		frame1.setBackground(Color.PINK);
		frame2.setBackground(Color.PINK);
		frame3.setBackground(Color.PINK);
		sci.setBackground(Color.lightGray);

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

		// setbounds
		frame2.setLayout(new GridLayout(4, 4, 10, 15)); // y=15
		frame3.setLayout(new GridLayout(5, 5, 5, 15)); // x=5 //y=15
		container.setLayout(null);
		frame1.setLayout(null);
		del.setBounds(10, 5, 60, 40); // width=60
		clr.setBounds(80, 5, 60, 40); // width=60
		del.setBounds(10, 5, 60, 40); // width=60
		ans.setBounds(160, 5, 60, 40); // width=60
		exit.setBounds(230, 5, 60, 40); // x=620
		frame1.setBounds(20, 70, 300, 50); // x=700
		container.setBounds(0, 20, 750, 430);
		text.setBounds(20, 5, 300, 30); // width=700
		frame2.setBounds(20, 150, 300, 230);
		frame3.setBounds(370, 150, 350, 230);
		tools.setBounds(0, 0, 750, 20);
		sci.setBounds(20, 380, 100, 20);

		this.add(frame1);
		this.add(frame2);
		this.add(frame3);
		container.add(text);
		this.add(container);
		tools.add(menu1);
		tools.add(menu2);
		this.add(tools);

		// add actionlisteners
		sci.addItemListener(this);
		clr.addActionListener(new Clear());
		exit.addActionListener(new Exit());
		del.addActionListener(new DEL());
		ans.addActionListener(new Ans());
		p1.addActionListener(new Display(p1.getActionCommand()));
		add.addActionListener(new Display(add.getActionCommand()));
		sub.addActionListener(new Display(sub.getActionCommand()));
		mult.addActionListener(new Display(mult.getActionCommand()));
		div.addActionListener(new Display(div.getActionCommand()));
		p2.addActionListener(new Display(p2.getActionCommand()));
		p3.addActionListener(new Display(p3.getActionCommand()));
		p4.addActionListener(new Display(p4.getActionCommand()));
		p5.addActionListener(new Display(p5.getActionCommand()));
		p6.addActionListener(new Display(p6.getActionCommand()));
		p7.addActionListener(new Display(p7.getActionCommand()));
		p8.addActionListener(new Display(p8.getActionCommand()));
		p9.addActionListener(new Display(p9.getActionCommand()));
		p0.addActionListener(new Display(p0.getActionCommand()));
		dot.addActionListener(new Display(dot.getActionCommand()));
		lp.addActionListener(new Display(lp.getActionCommand()));
		rp.addActionListener(new Display(rp.getActionCommand()));
		cosine.addActionListener(new Displaybracket(cosine.getActionCommand()));
		log.addActionListener(new Displaybracket(log.getActionCommand()));
		log10.addActionListener(new Displaybracket(log10.getActionCommand()));
		sine.addActionListener(new Displaybracket(sine.getActionCommand()));
		cosh.addActionListener(new Displaybracket(cosh.getActionCommand()));
		tanh.addActionListener(new Displaybracket(tanh.getActionCommand()));
		sinh.addActionListener(new Displaybracket(sinh.getActionCommand()));
		tan.addActionListener(new Displaybracket(tan.getActionCommand()));
		asine.addActionListener(new Displaybracket(asine.getActionCommand()));
		acos.addActionListener(new Displaybracket(acos.getActionCommand()));
		atan.addActionListener(new Displaybracket(atan.getActionCommand()));
		exp.addActionListener(new Exp());
		p.addActionListener(new Perm());
		comp.addActionListener(new Comp());
		fact.addActionListener(new fact());
		sq.addActionListener(new power2());
		cub.addActionListener(new power3());
		n.addActionListener(new powery());
		sqr.addActionListener(new Displaybracket(sqr.getActionCommand()));
		cubr.addActionListener(new Displaybracket(cubr.getActionCommand()));
		nroot.addActionListener(new Nr());
		inv.addActionListener(new Inv());
		pi.addActionListener(new Pi());
		adds.addActionListener(new Displayminus());
                
                text.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent key) {
                    if (key.getKeyChar() >= '0' && key.getKeyChar() <= '9') {
                        text.setEditable(true);
                    } else {
                        text.setEditable(false); 
                   }
                }
                });
                
                         
                
        }
	// Constructor End

	public void itemStateChanged(ItemEvent e) {
		if (sci.isSelected()) {
			this.setSize(750, 480);
			text.setBounds(20, 5, 700, 30);
			frame1.setBounds(20, 70, 700, 50);
			exit.setBounds(630, 5, 60, 40);
			ans.setBounds(560, 5, 60, 40);
		} else {
			this.setSize(350, 480);
			text.setBounds(20, 5, 300, 30);
			frame1.setBounds(20, 70, 300, 50);
			exit.setBounds(230, 5, 60, 40);
			ans.setBounds(160, 5, 60, 40);

		}
	}

	private class Display implements ActionListener {
		String buttons;

		public Display(String str) {
			buttons = str;
		}

		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < text.getText().length(); i++) {
				if (text.getText().charAt(i) == '=') {
					text.setText(buttons);
					return;
				}
			}
			text.setText(text.getText() + buttons);
		}
	}

	private class Displaybracket implements ActionListener {
		String buttons;

		public Displaybracket(String str) {
			buttons = str;
		}

		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < text.getText().length(); i++) {
				if (text.getText().charAt(i) == '=') {
					text.setText(buttons);
					return;
				}
			}
			text.setText(text.getText() + buttons + "(");
		}
	}

	private class Exp implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == exp)
				text.setText(text.getText() + "e");
		}
	}

	private class Comp implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == comp)
				text.setText(text.getText() + "C");
		}
	}

	private class Perm implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == p)
				text.setText(text.getText() + "P");
		}
	}

	private class fact implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == fact)
				text.setText(text.getText() + "!");
		}
	}

	private class power2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == sq)
				text.setText(text.getText() + "^2");
		}
	}

	private class power3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == cub)
				text.setText(text.getText() + "^3");
		}
	}

	private class powery implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == n)
				text.setText(text.getText() + "^(");
		}
	}

	private class Nr implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == nroot)
				text.setText(text.getText() + "y√");
		}
	}

	private class Inv implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == inv)
				text.setText(text.getText() + "^(-1)");
		}
	}

	private class Pi implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == pi)
				text.setText(text.getText() + "π");
		}
	}

        private class Displayminus implements ActionListener{
            
        	public void actionPerformed(ActionEvent e) {
           	int ops=Integer.parseInt(text.getText());
           	ops=ops*(-1);
           	text.setText( ops+"");
           }
        	}
	private class Clear implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			text.setText("");
		}
	}

	private class Exit implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	private class DEL implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			text.setText(text.getText().substring(0, text.getText().length() - 1));
		}
                
        }
        
        
             public String factorial(String str){
              int count = 0;
              int replacement = 0;
                 for (int i = 0; i < str.length(); i++) {
                  if(str.charAt(i) == '!') {

                     replacement = i;
                    for (int j = i - 1; j >=0 ; j--) {
                        if (str.charAt(j) < 48 || str.charAt(i) > 57)
                            break;
                        count++;
                    }
                    break;
                }
            }

            if (replacement == 0)
                return str;

            String num = "";
            for (int i = replacement - count; i < replacement; i++) {
                num += str.charAt(i);
            }

            long fact = fact(Integer.parseInt(num));

            String output = str.substring(0, replacement - count) + Long.toString(fact) + str.substring(replacement + 1);
            return output;
      
        }  
	
         public static long fact(int num){
          long fact=1;
          for(int i=1;i<=num;i++){
              fact=fact*i;
          }
          return fact;
        }
         
           public static String inv(String str) {
        	
            int count = 0, replacement = 0;
            for (int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == '^' && str.charAt(i + 1) == '(' && str.charAt(i + 2) == '-' && str.charAt(i + 3) == '1') {
                            replacement = i;
                            for (int j = i - 1; j >=0 ; j--) {
                                    if (str.charAt(j) < 48 || str.charAt(j) > 57)
                                            break;
                                    count++;
                            }
                            break;
                    }
            }

            if (replacement == 0)
                    return str;

            String num = str.substring(replacement - count , replacement);



            String output = str.substring(0, replacement - count) + "Math.pow(" + str.substring(replacement - count, replacement ) + ", -1)" + str.substring(replacement + count + 3);

            String st = "";
            for(int i = 0; i < output.length(); i++) {
                if (output.charAt(i) == '^' && output.charAt(i + 1) == '(' && output.charAt(i + 2) == '-' && output.charAt(i + 3) == '1'){
                    st = inv(output);
                }
            }

            if (st != "")
                return st;
            else 
                return output;
        	
        }
         
         
          public static String compination(String str) {
            int replcement = 0, number1 = 0, number2 = 0;
            for(int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'C'){
                    replcement = i;
                    for (int j = i - 1; j >=0 ; j--) {
                        if (str.charAt(j) < 48 || str.charAt(j) > 57)
                            break;
                        number1++;
                    }
                    for (int j = i + 1; j < str.length() ; j++) {
                        if (str.charAt(j) < 48 || str.charAt(j) > 57)
                            break;
                        number2++;
                    }
                }
                if (replcement != 0)
                    break;
                if (replcement == 0 && i == str.length() - 1)
                    return str;
                
            }
            int x = Integer.parseInt(str.substring(replcement - number1, replcement));
            int y = Integer.parseInt(str.substring(replcement + 1, replcement + number2 + 1));
            long res = fact(x) / (fact(x - y)*fact(y));
            return str.substring(0, replcement - number1) + Long.toString(res) +str.substring(replcement + number2 + 1);
        }
          
           public static String p(String str) {
            int replacement = 0, number1 = 0, number2 = 0;
            for(int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'p'){
                    replacement = i;
                    for (int j = i - 1; j >=0 ; j--) {
                        if (str.charAt(j) < 48 || str.charAt(j) > 57)
                            break;
                        number1++;
                    }
                    for (int j = i + 1; j < str.length() ; j++) {
                        if (str.charAt(j) < 48 || str.charAt(j) > 57)
                            break;
                        number2++;
                    }
                }
                if (replacement != 0)
                    break;
                if (replacement == 0 && i == str.length() - 1)
                    return str;

            }
            int x = Integer.parseInt(str.substring(replacement - number1, replacement));
            int y = Integer.parseInt(str.substring(replacement + 1, replacement + number2 + 1));
            long res = fact(x) / fact(x - y);
            return str.substring(0, replacement - number1) + Long.toString(res) +str.substring(replacement + number2 + 1);
        }
           
           
           
           
            public String pow(String str) {
            String s = "";
            int count = 0;
            int replacement = 0;
           
            for(int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '^' && str.charAt(i + 1) == '('){
                    replacement = i;
                    for (int j = i - 1; j >=0 ; j--) {
                        if (str.charAt(j) < 48 || str.charAt(j) > 57)
                            break;
                        count++;
                    }
                   
                }
                if (replacement != 0)
                    break;
                if (replacement == 0 && i == str.length() - 1)
                    return str;
                
            }
            
            int x = Character.getNumericValue(str.charAt(replacement + 2));
            if (replacement == 0)
                return str;
            
            s = str.substring(0, replacement - count) + "Math.pow(" + str.substring(replacement - count, replacement ) + ", " + x + ")" + str.substring(replacement + 4);
            String st = "";
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '^' && s.charAt(i + 1) == '('){
                    st = pow(s);
                }
            }
            
            if (st != "")
                return st;
            else 
                return s;
            
        }
        
        public static String Replace(String str){
             String sqr= str.replace("sqrt", "Math.sqrt");
             String sine= sqr.replace("sine", "Math.sin");
             String cos= sine.replace("cos", "Math.cos");
             String tan= cos.replace("tan", "Math.tan");
             String log= tan.replace("log", "Math.log");
             String exp= log.replace("e", "2.718");
             String pi= exp.replace("π", "Math.PI");
             String cubr= pi.replace("cbrt", "Math.cbrt");
             String asin= cubr.replace("asin", "Math.asin");
             String acos= asin.replace("acos", "Math.acos");
             String atan= acos.replace("atan", "Math.atan");
             String sinh= atan.replace("sinh", "Math.sinh");
             String cosh= sinh.replace("cosh", "Math.cosh");
             String tanh= cosh.replace("tanh", "Math.tanh");
             String log10= tanh.replace("log10", "Math.log10");
             return log10;
        
        }
        public Object eng(String str) throws ScriptException {
		ScriptEngineManager sc = new ScriptEngineManager();
		ScriptEngine eng = sc.getEngineByName("JavaScript");
		return eng.eval(function(str));
	}
         
	private class Ans implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			try {
				Object result = eng(Calc.text.getText());
				Calc.text.setText(Calc.text.getText() + " = " + result);
			}
                        
                        catch (ScriptException e1) {
                            text.setText("ERORR");
                            
			}
                      }     
		}
	public String function(String str) {
                String s=Replace(str);
                String s1= factorial(s);
                String s3= compination(s1);
                String s4= p(s3);
                String s5= inv(s4);
                 String s6= pow(s5);
		return s6;
                
	}}
       


