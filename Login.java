package quiz;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener{
	JButton start,back;
	JTextField tfname;
	Login()
	{
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(getClass().getResource("/pic/login.jpg"));
		JLabel image = new JLabel(i1); 
		image.setBounds(0,0,600,500);
//		 __0
//		|0  |500
//		 __600
     	add(image);
     	
     	//Heading//
     	JLabel heading = new JLabel("CodeGnan");
     	heading.setBounds(750,60,300,45);
     	heading.setFont(new Font("Times New Roman", Font.BOLD,25));
     	heading.setForeground(Color.BLACK);
     	add(heading);
     	
     	//Name//
     	JLabel name = new JLabel("Enter Your Name");
     	name.setBounds(740,120,300,25);
     	name.setFont(new Font("Times New Roman", Font.BOLD,18));
     	name.setForeground(Color.BLACK);
     	add(name);
     	
     	tfname=new JTextField();
     	tfname.setBounds(660,180,300,25);
     	tfname.setFont(new Font("Times New Roman",Font.PLAIN,20));
     	add(tfname);
     	
     	start = new JButton("Start");
     	start.setBounds(640,240,120,25);
     	start.setBackground(Color.DARK_GRAY);
     	start.setForeground(Color.WHITE);
     	start.addActionListener(this);
     	add(start);
     	
     	back = new JButton("Back");
     	back.setBounds(840,240,120,25);
     	back.setBackground(Color.DARK_GRAY);
     	back.setForeground(Color.WHITE);
     	back.addActionListener(this);
     	add(back);
     	
		setSize(1000,550);
		setLocation(100,150);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==start)
		{
			String name=tfname.getText();
			setVisible(false);
			new Rules(name);
			
		}
		else if(ae.getSource()==back)
		{
			setVisible(false);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();

	}



	

}
