import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class tictactoe {

	private JFrame frame;
	private static String one = "X";
	private static String comp;
	private static String[] c = new String[9];
	private boolean disable = false;
	JButton b1 = new JButton("");
	JButton b2 = new JButton("");
	JButton b8 = new JButton("");
	JButton b9 = new JButton("");
	JButton b7 = new JButton("");
	JButton b6 = new JButton("");
	JButton b5 = new JButton("");
	JButton b4 = new JButton("");
	JButton b3 = new JButton("");
	private JTextField txt;
	boolean gameOver = false;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoe window = new tictactoe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	
	public tictactoe() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton chooseO = new JButton("ChooseO");
		JButton chooseX = new JButton("Choose X");
		chooseO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				reset();
				one = "O";
				board();
				chooseO.setVisible(false);
				chooseX.setVisible(false);
					comp = "X";
			}
		});
		chooseO.setBounds(188, 162, 136, 99);
		frame.getContentPane().add(chooseO);
		
		
		chooseX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				reset();
				one = "X";
				board();
				chooseO.setVisible(false);
				chooseX.setVisible(false);
					comp = "O";
					computer();
			}
		});
		chooseX.setBounds(188, 282, 136, 99);
		frame.getContentPane().add(chooseX);
		
		txt = new JTextField();
		txt.setHorizontalAlignment(SwingConstants.CENTER);
		txt.setForeground(Color.GREEN);
		txt.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txt.setText("Tic Tac Toe");
		txt.setBackground(Color.DARK_GRAY);
		txt.setBounds(0, 0, 386, 77);
		frame.getContentPane().add(txt);
	}
	
	private void board()
	{
		b1.setToolTipText("");
		b1.setFont(new Font("Tahoma", Font.BOLD, 80));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(0,b1);
			}
		});
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setBounds(0, 78, 147, 146);
		frame.getContentPane().add(b1);
		
		
		b2.setFont(new Font("Tahoma", Font.BOLD, 80));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(1,b2);
			}
		});
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setBounds(173, 78, 147, 146);
		frame.getContentPane().add(b2);
		
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(2,b3);
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 80));
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setBounds(345, 78, 147, 146);
		frame.getContentPane().add(b3);
		
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(3,b4);
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 80));
		b4.setBackground(Color.LIGHT_GRAY);
		b4.setBounds(0, 250, 147, 146);
		frame.getContentPane().add(b4);
		
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(4,b5);
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 80));
		b5.setBackground(Color.LIGHT_GRAY);
		b5.setBounds(173, 249, 147, 147);
		frame.getContentPane().add(b5);
		
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(5,b6);
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 80));
		b6.setBackground(Color.LIGHT_GRAY);
		b6.setBounds(345, 250, 147, 146);
		frame.getContentPane().add(b6);
		
		
		b7.setFont(new Font("Tahoma", Font.BOLD, 80));
		b7.setBackground(Color.LIGHT_GRAY);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(6,b7);
			}
		});
		b7.setBounds(0, 417, 147, 146);
		frame.getContentPane().add(b7);
		
		
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(7,b8);
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 80));
		b8.setBackground(Color.LIGHT_GRAY);
		b8.setBounds(173, 417, 147, 146);
		frame.getContentPane().add(b8);
		

		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(8,b9);
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 80));
		b9.setBackground(Color.LIGHT_GRAY);
		b9.setBounds(345, 417, 147, 146);
		frame.getContentPane().add(b9);
		
		
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				reset();
			}
			
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBounds(386, 0, 100, 77);
		frame.getContentPane().add(btnNewButton);
		}
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------
	public void check()
	{
			if(c[0] == "O" && c[1] == "O" && c[2]=="O")
			{
				oWins(b1,b2,b3);
			}
			if(c[3] == "O" && c[4] == "O" && c[5]=="O")
			{
				oWins(b4,b5,b6);
			}
			if(c[6] == "O" && c[7] == "O" && c[8]=="O")
			{
				oWins(b7,b8,b9);
			}
			if(c[0] == "O" && c[3] == "O" && c[6]=="O")
			{
				oWins(b1,b4,b7);
			}
			if(c[1] == "O" && c[4] == "O" && c[7]=="O")
			{
				oWins(b2,b5,b8);
			}
			if(c[2] == "O" && c[5] == "O" && c[8]=="O")
			{
				oWins(b3,b6,b9);
			}
			if(c[0] == "O" && c[4] == "O" && c[8]=="O")
			{
				oWins(b1,b5,b9);
			}
			if(c[2] == "O" && c[4] == "O" && c[6]=="O")
			{
				oWins(b3,b5,b7);
			}
			//-----------------------------------------
			if(c[0] == "X" && c[1] == "X" && c[2]=="X")
			{
				xWins(b1,b2,b3);
			}
			if(c[3] == "X" && c[4] == "X" && c[5]=="X")
			{
				xWins(b4,b5,b6);
			}
			if(c[6] == "X" && c[7] == "X" && c[8]=="X")
			{
				xWins(b7,b8,b9);
			}
			if(c[0] == "X" && c[3] == "X" && c[6]=="X")
			{
				xWins(b1,b4,b7);
			}
			if(c[1] == "X" && c[4] == "X" && c[7]=="X")
			{
				xWins(b2,b5,b8);
			}
			if(c[2] == "X" && c[5] == "X" && c[8]=="X")
			{
				xWins(b3,b6,b9);
			}
			if(c[0] == "X" && c[4] == "X" && c[8]=="X")
			{
				xWins(b1,b5,b9);
			}
			if(c[2] == "X" && c[4] == "X" && c[6]=="X")
			{
				xWins(b3,b5,b7);
			}
			if(c[0] != " " && c[1] != " " && c[2] != " " && c[3] != " " && c[4] != " " && 
					c[5] != " " && c[6] != " " && c[7] != " " && c[8] != " " && disable != true)
			{
				txt.setText("Draw");
				disable =true;
			}
			if(disable == true)
			{
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				gameOver = true;
			}

	}
	
	public void oWins(JButton a, JButton b, JButton c)
	{
		a.setBackground(Color.GREEN);
		b.setBackground(Color.GREEN);
		c.setBackground(Color.GREEN);
		txt.setText("O Wins");
		disable =true; 
	}
	
	public void xWins(JButton a, JButton b, JButton c)
	{
		a.setBackground(Color.GREEN);
		b.setBackground(Color.GREEN);
		c.setBackground(Color.GREEN);
		txt.setText("X Wins");
		disable = true;
	}
	
	public void action(int a,JButton bu)
	{
		if(bu.getText() != "O" && bu.getText() != "X" )
		{
				
				bu.setText(one);
				bu.setForeground(Color.RED);
				txt.setText("Your Turn");
				c[a] = one;
		}
		check();
		if(gameOver == false)
		{
			computer();
		}
		check();
	}
	
	
	
	public void reset()
	{
		b1.setEnabled(true);
		b1.setText(null);
		b1.setBackground(Color.LIGHT_GRAY);
		
		b2.setEnabled(true);
		b2.setText(null);
		b2.setBackground(Color.LIGHT_GRAY);
		
		b3.setEnabled(true);
		b3.setText(null);
		b3.setBackground(Color.LIGHT_GRAY);
		
		b4.setEnabled(true);
		b4.setText(null);
		b4.setBackground(Color.LIGHT_GRAY);
		
		b5.setEnabled(true);
		b5.setText(null);
		b5.setBackground(Color.LIGHT_GRAY);

		b6.setEnabled(true);
		b6.setText(null);
		b6.setBackground(Color.LIGHT_GRAY);
		
		b7.setEnabled(true);
		b7.setText(null);
		b7.setBackground(Color.LIGHT_GRAY);
		
		b8.setEnabled(true);
		b8.setText(null);
		b8.setBackground(Color.LIGHT_GRAY);
		
		b9.setEnabled(true);
		b9.setText(null);
		b9.setBackground(Color.LIGHT_GRAY);
		
		txt.setText("O's Turn");
		disable=false;
		
		gameOver = false;
		
		for(int a = 0; a<9;a++)
			c[a]=" ";
		
		if(comp == "O")
		{
			computer();
		}
	}
	
	public void computer()
	{
		
		boolean moved = false;
		
		
		if(b5.getText() != "X" && b5.getText() !="O")
		{
			b5.setText(comp);
			c[4]=comp;
			moved = true;
		}
		
		System.out.println(moved);
		if(moved == false && win()==true)
		{
		//	win(d);
			moved = true;
		}
		
		System.out.println(moved);
		if(moved == false && defend() ==true)
		{
		//	defend(d);
			moved = true;
		}
		
		System.out.println(moved);
		if(moved == false)
		{
			series();
			moved = true;
		}
		System.out.println(moved);
	}
	
	public boolean win()
	{
		
			for(int b =0; b<9; b++)
			{
				if(c[b] == " ")
				{
					c[b]=comp;
					if(game())
					{
						setButton(b,comp);
						return true;
					}
					else
						c[b]=" ";
				}
			}
		
		return false;
	}
	
	public boolean defend()
	{
		
			for(int b =0; b<9; b++)
			{
				if(c[b] == " ")
				{
					c[b]=one;
					if(game())
					{
						setButton(b,comp);
						c[b]=comp;
						return true;
					}
					else
					{
						c[b]=" ";
					}
				}
			}
		
		return false;
	}
	
	public void series()
	{
		boolean moved = false;
		
		if(b1.getText() == "O"  && b9.getText() == "O" && b5.getText() == "X" && moved == false)
		{
			moved = true;
			c[7]=comp;
			b8.setText(comp);
		}
		
		if(b3.getText() == "O"  && b7.getText() == "O" && b5.getText() == "X" && moved == false)
		{
			moved = true;
			c[7]=comp;
			b8.setText(comp);
		}
		
		if(b7.getText() == "O"  && b2.getText() == "O" && b5.getText() == "X" && moved == false)
		{
			moved = true;
			c[0]=comp;
			b1.setText(comp);
		}
		
		if(b3.getText() == "O"  && b4.getText() == "O" && b5.getText() == "X" && moved == false)
		{
			moved = true;
			c[0]=comp;
			b1.setText(comp);
		}
		
		if(b2.getText() == "O"  && b9.getText() == "O" && b5.getText() == "X" && moved == false)
		{
			moved = true;
			c[2]=comp;
			b3.setText(comp);
		}
		
		if(b9.getText() != "X" && b9.getText() !="O" && moved == false)
		{
			moved = true;
			c[8]=comp;
			b9.setText(comp);
		}
		
		if(b7.getText() != "X" && b7.getText() !="O"&& moved == false)
		{
			b7.setText(comp);
			moved = true;
			c[6]=comp;
		}
		
		if(b3.getText() != "X" && b3.getText() !="O" && moved == false)
		{
			moved = true;
			b3.setText(comp);
			c[2]=comp;
		}
		
		if(b1.getText() != "X" && b1.getText() !="O" && moved == false)
		{
			moved = true;
			b1.setText(comp);
			c[0]=comp;
		}
		if(b2.getText() != "X" && b2.getText() !="O" && moved == false)
		{
			moved = true;
			b2.setText(comp);
			c[1]=comp;
		}
		
		if(b4.getText() != "X" && b4.getText() !="O" && moved == false)
		{
			moved = true;
			b4.setText(comp);
			c[3]=comp;
		}
		
		if(b6.getText() != "X" && b6.getText() !="O" && moved == false)
		{
			moved = true;
			b6.setText(comp);
			c[5]=comp;
		}
		
		if(b8.getText() != "X" && b8.getText() !="O" && moved == false)
		{
			moved = true;
			b8.setText(comp);
			c[7]=comp;
		}
	}
	
	public boolean game()
	{
		if(c[0] == "O" && c[1] == "O" && c[2]=="O")
		{
			return true;
		}
		if(c[3] == "O" && c[4] == "O" && c[5]=="O")
		{
			return true;
		}
		if(c[6] == "O" && c[7] == "O" && c[8]=="O")
		{
			return true;
		}
		if(c[0] == "O" && c[3] == "O" && c[6]=="O")
		{
			return true;
		}
		if(c[1] == "O" && c[4] == "O" && c[7]=="O")
		{
			return true;
		}
		if(c[2] == "O" && c[5] == "O" && c[8]=="O")
		{
			return true;
		}
		if(c[0] == "O" && c[4] == "O" && c[8]=="O")
		{
			return true;
		}
		if(c[2] == "O" && c[4] == "O" && c[6]=="O")
		{
			return true;
		}
		//-----------------------------------------
		if(c[0] == "X" && c[1] == "X" && c[2]=="X")
		{
			return true;
		}
		if(c[3] == "X" && c[4] == "X" && c[5]=="X")
		{
			return true;
		}
		if(c[6] == "X" && c[7] == "X" && c[8]=="X")
		{
			return true;
		}
		if(c[0] == "X" && c[3] == "X" && c[6]=="X")
		{
			return true;
		}
		if(c[1] == "X" && c[4] == "X" && c[7]=="X")
		{
			return true;
		}
		if(c[2] == "X" && c[5] == "X" && c[8]=="X")
		{
			return true;
		}
		if(c[0] == "X" && c[4] == "X" && c[8]=="X")
		{
			return true;
		}
		if(c[2] == "X" && c[4] == "X" && c[6]=="X")
		{
			return true;
		}
			
			return false;
	}
	
	public void setButton(int a,String b )
	{
		if(a==0)
		{
			b1.setText(b);
		}
		if(a==1)
		{
			b2.setText(b);
		}
		if(a==2)
		{
			b3.setText(b);
		}
		if(a==3)
		{
			b4.setText(b);
		}
		if(a==4)
		{
			b5.setText(b);
		}
		if(a==5)
		{
			b6.setText(b);
		}
		if(a==6)
		{
			b7.setText(b);
		}
		if(a==7)
		{
			b8.setText(b);
		}
		if(a==8)
		{
			b9.setText(b);
		}
	}
}
