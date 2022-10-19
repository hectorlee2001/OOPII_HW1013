import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;


public class calculate {
	private static JFrame jf = new JFrame("calculator");
	private static JPanel jp = new JPanel(new GridLayout(4,4));
	private static JLabel jl =new JLabel("    ",Label.RIGHT);
  
  	private static JButton plus = new JButton("+");
  	private static JButton minus = new JButton("-");
  	private static JButton multi = new JButton("*");
  	private static JButton devine = new JButton("/");
  	private static JButton clear = new JButton("c");
  	private static JButton result = new JButton("=");
  	private static JButton one = new JButton("1");
  	private static JButton two = new JButton("2");
  	private static JButton three = new JButton("3");
  	private static JButton four = new JButton("4");
   	private static JButton five = new JButton("5");
   	private static JButton six = new JButton("6");
   	private static JButton seven = new JButton("7");
   	private static JButton eight = new JButton("8");
   	private static JButton nine = new JButton("9");
   	private static JButton zero = new JButton("0");
  	static double hold = 0;
  	static double toadd = 0;
  	static double tominus = 0;
  	static double todevine = 0;
  	static double tomulti = 0;
  	static int trigger = 0;
  	static double results = 0;
	public static void main(String args[]){
			jf.setLayout(new BorderLayout());
			jl.setSize(400,200);
			
			one.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(trigger == 0)
						hold = hold*10+1;
					else if (trigger == 1)
						toadd = toadd*10+1;
					else if (trigger == 2)
						tominus = tominus*10+1;
					else if (trigger == 3)
						tomulti = tomulti*10+1;
					else if (trigger == 4)
						todevine = todevine*10+1;
					else
					{
						jl.setText("   ");
						hold = hold*10+1;
						trigger = 0;
					}
					
					jl.setText(jl.getText()+"1");
				}
			});
			
			two.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(trigger == 0)
						hold = hold*10+2;
					else if (trigger == 1)
						toadd = toadd*10+2;
					else if (trigger == 2)
						tominus = tominus*10+2;
					else if (trigger == 3)
						tomulti = tomulti*10+2;
					else if (trigger == 4)
						todevine = todevine*10+2;
					else
					{
						jl.setText("   ");
						hold = hold*10+2;
						trigger = 0;
					}
					
					jl.setText(jl.getText()+"2");
				}
			});
			
			three.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(trigger == 0)
						hold = hold*10+3;
					else if (trigger == 1)
						toadd = toadd*10+3;
					else if (trigger == 2)
						tominus = tominus*10+3;
					else if (trigger == 3)
						tomulti = tomulti*10+3;
					else if (trigger == 4)
						todevine = todevine*10+3;
					else
					{
						jl.setText("   ");
						hold = hold*10+3;
						trigger = 0;
					}
					
					jl.setText(jl.getText()+"3");
				}
			});
			
			four.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(trigger == 0)
						hold = hold*10+4;
					else if (trigger == 1)
						toadd = toadd*10+4;
					else if (trigger == 2)
						tominus = tominus*10+4;
					else if (trigger == 3)
						tomulti = tomulti*10+4;
					else if (trigger == 4)
						todevine = todevine*10+4;
					else
					{
						jl.setText("   ");
						hold = hold*10+4;
						trigger = 0;
					}
					
					jl.setText(jl.getText()+"4");
				}
			});
			
			five.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(trigger == 0)
						hold = hold*10+5;
					else if (trigger == 1)
						toadd = toadd*10+5;
					else if (trigger == 2)
						tominus = tominus*10+5;
					else if (trigger == 3)
						tomulti = tomulti*10+5;
					else if (trigger == 4)
						todevine = todevine*10+5;
					else
					{
						jl.setText("   ");
						hold = hold*10+5;
						trigger = 0;
					}
					
					jl.setText(jl.getText()+"5");
				}
			});
			
			six.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(trigger == 0)
						hold = hold*10+6;
					else if (trigger == 1)
						toadd = toadd*10+6;
					else if (trigger == 2)
						tominus = tominus*10+6;
					else if (trigger == 3)
						tomulti = tomulti*10+6;
					else if (trigger == 4)
						todevine = todevine*10+6;
					else
					{
						jl.setText("   ");
						hold = hold*10+6;
						trigger = 0;
					}
					
					jl.setText(jl.getText()+"6");
				}
			});
			
			seven.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(trigger == 0)
						hold = hold*10+7;
					else if (trigger == 1)
						toadd = toadd*10+7;
					else if (trigger == 2)
						tominus = tominus*10+7;
					else if (trigger == 3)
						tomulti = tomulti*10+7;
					else if (trigger == 4)
						todevine = todevine*10+7;
					else
					{
						jl.setText("   ");
						hold = hold*10+7;
						trigger = 0;
					}
					
					jl.setText(jl.getText()+"7");
				}
			});
			
			eight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(trigger == 0)
						hold = hold*10+8;
					else if (trigger == 1)
						toadd = toadd*10+8;
					else if (trigger == 2)
						tominus = tominus*10+8;
					else if (trigger == 3)
						tomulti = tomulti*10+8;
					else if (trigger == 4)
						todevine = todevine*10+8;
					else
					{
						jl.setText("   ");
						hold = hold*10+8;
						trigger = 0;
					}
					
					jl.setText(jl.getText()+"8");
				}
			});
			
			nine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(trigger == 0)
						hold = hold*10+9;
					else if (trigger == 1)
						toadd = toadd*10+9;
					else if (trigger == 2)
						tominus = tominus*10+9;
					else if (trigger == 3)
						tomulti = tomulti*10+9;
					else if (trigger == 4)
						todevine = todevine*10+9;
					else
					{
						jl.setText("   ");
						hold = hold*10+9;
						trigger = 0;
					}
					
					jl.setText(jl.getText()+"9");
				}
			});
			
			plus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(hold != 0)
					{
						trigger = 1;
						
						results = hold + toadd - tominus;
						
						toadd = 0;
						tominus = 0;
						
						if(todevine != 0)
							results = results/todevine;
						todevine = 0;
						
						if(tomulti != 0)
							results = results*tomulti;
						tomulti = 0;
						
						hold = results;
						jl.setText(jl.getText()+"+");
					}
					
				}
			});
			
			minus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(hold != 0)
					{
						trigger = 2;
						
						results = hold + toadd - tominus;
						
						toadd = 0;
						tominus = 0;
						
						if(todevine != 0)
							results = results/todevine;
						todevine = 0;
						
						if(tomulti != 0)
							results = results*tomulti;
						tomulti = 0;
						
						hold = results;
						jl.setText(jl.getText()+"-");
					}
					
				}
			});
			
			multi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(hold != 0)
					{
						trigger = 3;
						
						results = hold + toadd - tominus;
						
						toadd = 0;
						tominus = 0;
						
						if(todevine != 0)
							results = results/todevine;
						todevine = 0;
						
						if(tomulti != 0)
							results = results*tomulti;
						tomulti = 0;
						
						hold = results;
						jl.setText(jl.getText()+"*");
					}
					
				}
			});
			
			devine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(hold != 0)
					{
						trigger = 4;
						
						results = hold + toadd - tominus;
						
						toadd = 0;
						tominus = 0;
						
						if(todevine != 0)
							results = results/todevine;
						todevine = 0;
						
						if(tomulti != 0)
							results = results*tomulti;
						tomulti = 0;
						
						hold = results;
						jl.setText(jl.getText()+"/");
					}
					
				}
			});
			
			clear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					reset();
					jl.setText("   ");
				}
			});
			
			result.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					results = hold + toadd - tominus;
					
					toadd = 0;
					tominus = 0;
					
					if(todevine != 0)
						results = results/todevine;
					todevine = 0;
					
					if(tomulti != 0)
						results = results*tomulti;
					tomulti = 0;
					
					jl.setText(String.valueOf(results));
					reset();
					trigger = 5;
				}
			});
			
			jp.add(seven);
			jp.add(eight);
			jp.add(nine);
			jp.add(devine);
			jp.add(four);
			jp.add(five);
			jp.add(six);
			jp.add(multi);
			jp.add(one);
			jp.add(two);
			jp.add(three);
			jp.add(minus);
			jp.add(clear);
			jp.add(zero);
			jp.add(result);
			jp.add(plus);
			
			jf.add(jl,BorderLayout.NORTH);
			jf.add(jp,BorderLayout.CENTER);
			
			jf.setSize(400, 600);
      		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      		jf.setResizable(false);
      		jf.setVisible(true);
	}
	public static void reset()
	{
		toadd = 0;
		tominus = 0;
		todevine = 0;
		tomulti = 0;
		trigger = 0;
		hold = 0;
		results = 0;
	}
}