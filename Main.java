package kolko_krzyzyk;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame implements ActionListener
{
	JButton but1=new JButton(); 
	JButton but2=new JButton(); 
	JButton but3=new JButton(); 
	JButton but4=new JButton(); 
	JButton but5=new JButton(); 
	JButton but6=new JButton(); 
	JButton but7=new JButton();
	JButton but8=new JButton(); 
	JButton but9=new JButton(); 
	JLabel lab=new JLabel("Ruch kółka");
	public Main()
	{
		setSize(400,400);
		setTitle("Kółko i Krzyżyk");
		setLayout(null);
		setVisible (true);
		
		
		but1.setBounds(50,50,100,100);
		but1.addActionListener(this);
		but1.setFont(new Font("Helvetica",Font.BOLD,75));
		add(but1);
		but2.setBounds(150,50,100,100);
		but2.addActionListener(this);
		but2.setFont(new Font("Helvetica",Font.BOLD,75));
		add(but2);
		but3.setBounds(250,50,100,100);
		but3.addActionListener(this);
		but3.setFont(new Font("Helvetica",Font.BOLD,75));
		add(but3);
		but4.setBounds(50,150,100,100);
		but4.addActionListener(this);
		but4.setFont(new Font("Helvetica",Font.BOLD,75));
		add(but4);
		but5.setBounds(150,150,100,100);
		but5.addActionListener(this);
		but5.setFont(new Font("Helvetica",Font.BOLD,75));
		add(but5);
		but6.setBounds(250,150,100,100);
		but6.addActionListener(this);
		but6.setFont(new Font("Helvetica",Font.BOLD,75));
		add(but6);
		but7.setBounds(50,250,100,100);
		but7.addActionListener(this);
		but7.setFont(new Font("Helvetica",Font.BOLD,75));
		add(but7);
		but8.setBounds(150,250,100,100);
		but8.addActionListener(this);
		but8.setFont(new Font("Helvetica",Font.BOLD,75));
		add(but8);
		but9.setBounds(250,250,100,100);
		but9.addActionListener(this);
		but9.setFont(new Font("Helvetica",Font.BOLD,75));
		add(but9);
		lab.setBounds(25, 25, 125, 25);
		add(lab);
		
	}
	public static void main(String[] args) 
	{
		new Main();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		Object ob=arg0.getSource();
		if(lab.getText()=="Ruch kółka")
		{
			
			if((but1.getText()=="O" && but2.getText()=="O" && but3.getText()=="O") || (but4.getText()=="O" && but5.getText()=="O" && but6.getText()=="O") || (but7.getText()=="O" && but8.getText()=="O" && but9.getText()=="O") || (but1.getText()=="O" && but4.getText()=="O" && but7.getText()=="O") ||(but2.getText()=="O" && but5.getText()=="O" && but8.getText()=="O") ||(but3.getText()=="O" && but6.getText()=="O" && but9.getText()=="O") || (but1.getText()=="O" && but5.getText()=="O" && but9.getText()=="O") || (but3.getText()=="O" && but5.getText()=="O" && but7.getText()=="O") )
			{
			lab.setText("Wygrały kółka");	
			
			}
			
			if((but1.getText()=="X" && but2.getText()=="X" && but3.getText()=="X") || (but4.getText()=="X" && but5.getText()=="X" && but6.getText()=="X") || (but7.getText()=="X" && but8.getText()=="X" && but9.getText()=="X") || (but1.getText()=="X" && but4.getText()=="X" && but7.getText()=="X") ||(but2.getText()=="X" && but5.getText()=="X" && but8.getText()=="X") ||(but3.getText()=="O" && but6.getText()=="X" && but9.getText()=="X") || (but1.getText()=="X" && but5.getText()=="X" && but9.getText()=="X") || (but3.getText()=="X" && but5.getText()=="X" && but7.getText()=="X") )
			{
			lab.setText("Wygrały krzyżyki");	
			
			}
			
			if((but1.getText()=="X" || but1.getText()=="O") && (but2.getText()=="X" || but2.getText()=="O") &&(but3.getText()=="X" || but3.getText()=="O") && ((but4.getText()=="X" || but4.getText()=="O")) && (but5.getText()=="X" || but5.getText()=="O") && (but6.getText()=="X" || but6.getText()=="O") && (but7.getText()=="X" || but7.getText()=="O") && (but8.getText()=="X" || but8.getText()=="O") && (but9.getText()=="X" || but9.getText()=="O") )
			{
			lab.setText("Remis");	
			}
			
			if(ob==but1 && but1.getText()!="X" && but1.getText()!="O")
			{
				but1.setText("O");
				lab.setText("Ruch krzyżyka");
			}
		
			if(ob==but2 && but2.getText()!="X" && but2.getText()!="O")
			{
				but2.setText("O");
				lab.setText("Ruch krzyżyka");
			}
		
		if(ob==but3 && but3.getText()!="X" && but3.getText()!="O")
			{
				but3.setText("O");
				lab.setText("Ruch krzyżyka");
			}
		
		if(ob==but4 && but4.getText()!="X" && but4.getText()!="O")
			{
				but4.setText("O");
				lab.setText("Ruch krzyżyka");
			}
		
		if(ob==but5 && but5.getText()!="X" && but5.getText()!="O")
			{
				but5.setText("O");
				lab.setText("Ruch krzyżyka");
			}
		
		if(ob==but6 && but6.getText()!="X" && but6.getText()!="O")
			{
				but6.setText("O");
				lab.setText("Ruch krzyżyka");
			}
		
		if(ob==but7 && but7.getText()!="X"&& but7.getText()!="O")
			{
				but7.setText("O");
				lab.setText("Ruch krzyżyka");
			}
		
		if(ob==but8 && but8.getText()!="X"&& but8.getText()!="O")
			{
				but8.setText("O");
				lab.setText("Ruch krzyżyka");
			}
		
		if(ob==but9 && but9.getText()!="X"&& but9.getText()!="O")
			{
				but9.setText("O");
				lab.setText("Ruch krzyżyka");
			}
		
		if((but1.getText()=="O" && but2.getText()=="O" && but3.getText()=="O") || (but4.getText()=="O" && but5.getText()=="O" && but6.getText()=="O") || (but7.getText()=="O" && but8.getText()=="O" && but9.getText()=="O") || (but1.getText()=="O" && but4.getText()=="O" && but7.getText()=="O") ||(but2.getText()=="O" && but5.getText()=="O" && but8.getText()=="O") ||(but3.getText()=="O" && but6.getText()=="O" && but9.getText()=="O") || (but1.getText()=="O" && but5.getText()=="O" && but9.getText()=="O") || (but3.getText()=="O" && but5.getText()=="O" && but7.getText()=="O") )
		{
		lab.setText("Wygrały kółka");	
		
		}
		
		if((but1.getText()=="X" && but2.getText()=="X" && but3.getText()=="X") || (but4.getText()=="X" && but5.getText()=="X" && but6.getText()=="X") || (but7.getText()=="X" && but8.getText()=="X" && but9.getText()=="X") || (but1.getText()=="X" && but4.getText()=="X" && but7.getText()=="X") ||(but2.getText()=="X" && but5.getText()=="X" && but8.getText()=="X") ||(but3.getText()=="O" && but6.getText()=="X" && but9.getText()=="X") || (but1.getText()=="X" && but5.getText()=="X" && but9.getText()=="X") || (but3.getText()=="X" && but5.getText()=="X" && but7.getText()=="X") )
		{
		lab.setText("Wygrały krzyżyki");	
		
		}
		
		if((but1.getText()=="X" || but1.getText()=="O") && (but2.getText()=="X" || but2.getText()=="O") &&(but3.getText()=="X" || but3.getText()=="O") && ((but4.getText()=="X" || but4.getText()=="O")) && (but5.getText()=="X" || but5.getText()=="O") && (but6.getText()=="X" || but6.getText()=="O") && (but7.getText()=="X" || but7.getText()=="O") && (but8.getText()=="X" || but8.getText()=="O") && (but9.getText()=="X" || but9.getText()=="O") )
		{
		lab.setText("Remis");	
		}
		}
		
		else if(lab.getText()=="Ruch krzyżyka")
		{
			if((but1.getText()=="O" && but2.getText()=="O" && but3.getText()=="O") || (but4.getText()=="O" && but5.getText()=="O" && but6.getText()=="O") || (but7.getText()=="O" && but8.getText()=="O" && but9.getText()=="O") || (but1.getText()=="O" && but4.getText()=="O" && but7.getText()=="O") ||(but2.getText()=="O" && but5.getText()=="O" && but8.getText()=="O") ||(but3.getText()=="O" && but6.getText()=="O" && but9.getText()=="O") || (but1.getText()=="O" && but5.getText()=="O" && but9.getText()=="O") || (but3.getText()=="O" && but5.getText()=="O" && but7.getText()=="O") )
			{
			lab.setText("Wygrały kółka");	
			
			}
			
			if((but1.getText()=="X" && but2.getText()=="X" && but3.getText()=="X") || (but4.getText()=="X" && but5.getText()=="X" && but6.getText()=="X") || (but7.getText()=="X" && but8.getText()=="X" && but9.getText()=="X") || (but1.getText()=="X" && but4.getText()=="X" && but7.getText()=="X") ||(but2.getText()=="X" && but5.getText()=="X" && but8.getText()=="X") ||(but3.getText()=="O" && but6.getText()=="X" && but9.getText()=="X") || (but1.getText()=="X" && but5.getText()=="X" && but9.getText()=="X") || (but3.getText()=="X" && but5.getText()=="X" && but7.getText()=="X") )
			{
			lab.setText("Wygrały krzyżyki");	
			
			}
			
			if((but1.getText()=="X" || but1.getText()=="O") && (but2.getText()=="X" || but2.getText()=="O") &&(but3.getText()=="X" || but3.getText()=="O") && ((but4.getText()=="X" || but4.getText()=="O")) && (but5.getText()=="X" || but5.getText()=="O") && (but6.getText()=="X" || but6.getText()=="O") && (but7.getText()=="X" || but7.getText()=="O") && (but8.getText()=="X" || but8.getText()=="O") && (but9.getText()=="X" || but9.getText()=="O") )
			{
			lab.setText("Remis");	
			}
			
			if(ob==but1 && but1.getText()!="O" && but1.getText()!="X")
			{
				but1.setText("X");
				lab.setText("Ruch kółka");
			}
		
			if(ob==but2 && but2.getText()!="O"&& but2.getText()!="X")
			{
				but2.setText("X");
				lab.setText("Ruch kółka");
			}
		
			if(ob==but3 && but3.getText()!="O"&& but3.getText()!="X")
			{
				but3.setText("X");
				lab.setText("Ruch kółka");
			}
		
			if(ob==but4 && but4.getText()!="O"&& but4.getText()!="X")
			{
				but4.setText("X");
				lab.setText("Ruch kółka");
			}
		
			if(ob==but5 && but5.getText()!="O"&& but5.getText()!="X")
			{
				but5.setText("X");
				lab.setText("Ruch kółka");
			}
		
			if(ob==but6 && but6.getText()!="O"&& but6.getText()!="X")
			{
				but6.setText("X");
				lab.setText("Ruch kółka");
			}
		
			if(ob==but7 && but7.getText()!="O" && but7.getText()!="X")
			{
				but7.setText("X");
				lab.setText("Ruch kółka");
			}
		
			if(ob==but8 && but8.getText()!="O" && but8.getText()!="X")
			{
				but8.setText("X");
				lab.setText("Ruch kółka");
			}
		
			if(ob==but9 && but9.getText()!="O" && but9.getText()!="X")
			{
				but9.setText("X");
				lab.setText("Ruch kółka");
			}
			
			if((but1.getText()=="O" && but2.getText()=="O" && but3.getText()=="O") || (but4.getText()=="O" && but5.getText()=="O" && but6.getText()=="O") || (but7.getText()=="O" && but8.getText()=="O" && but9.getText()=="O") || (but1.getText()=="O" && but4.getText()=="O" && but7.getText()=="O") ||(but2.getText()=="O" && but5.getText()=="O" && but8.getText()=="O") ||(but3.getText()=="O" && but6.getText()=="O" && but9.getText()=="O") || (but1.getText()=="O" && but5.getText()=="O" && but9.getText()=="O") || (but3.getText()=="O" && but5.getText()=="O" && but7.getText()=="O") )
			{
			lab.setText("Wygrały kółka");	
			
			}
			
			if((but1.getText()=="X" && but2.getText()=="X" && but3.getText()=="X") || (but4.getText()=="X" && but5.getText()=="X" && but6.getText()=="X") || (but7.getText()=="X" && but8.getText()=="X" && but9.getText()=="X") || (but1.getText()=="X" && but4.getText()=="X" && but7.getText()=="X") ||(but2.getText()=="X" && but5.getText()=="X" && but8.getText()=="X") ||(but3.getText()=="O" && but6.getText()=="X" && but9.getText()=="X") || (but1.getText()=="X" && but5.getText()=="X" && but9.getText()=="X") || (but3.getText()=="X" && but5.getText()=="X" && but7.getText()=="X") )
			{
			lab.setText("Wygrały krzyżyki");	
			
			}
			
			if((but1.getText()=="X" || but1.getText()=="O") && (but2.getText()=="X" || but2.getText()=="O") &&(but3.getText()=="X" || but3.getText()=="O") && ((but4.getText()=="X" || but4.getText()=="O")) && (but5.getText()=="X" || but5.getText()=="O") && (but6.getText()=="X" || but6.getText()=="O") && (but7.getText()=="X" || but7.getText()=="O") && (but8.getText()=="X" || but8.getText()=="O") && (but9.getText()=="X" || but9.getText()=="O") )
			{
			lab.setText("Remis");	
			}
			
		}
		
			
		}
	}


