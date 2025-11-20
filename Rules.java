package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Rules extends JFrame implements ActionListener {
	String name;
	JButton start,back;
	Rules(String name)
	{
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		//Heading//
		JLabel heading = new JLabel("Welcome "+name+" to CodeGnan");
     	heading.setBounds(200,20,700,35);
     	heading.setFont(new Font("Times New Roman", Font.BOLD,40));
     	heading.setForeground(Color.BLACK);
     	add(heading);
     	//Rules//
     	JLabel rules = new JLabel("");
     	rules.setBounds(20,10,700,500);
     	rules.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,17));
     	rules.setForeground(Color.BLACK);
     	rules.setText(
     			"<html>"+
     					"1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
     	                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
     	                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
     	                "4. Crying is allowed but please do so quietly." + "<br><br>" +
     	                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
     	                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
     	                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
     	                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
     	            "<html>"
     	);
     	
     	add(rules);
     	
     	back = new JButton("Back");
     	back.setBounds(340,470,120,25);
     	back.setBackground(Color.DARK_GRAY);
     	back.setForeground(Color.WHITE);
     	back.addActionListener(this);
     	add(back);
     	
     	start = new JButton("Start");
     	start.setBounds(540,470,120,25);
     	start.setBackground(Color.DARK_GRAY);
     	start.setForeground(Color.WHITE);
     	start.addActionListener(this);
     	add(start);
     	
		setSize(1000,550);
		setLocation(100,150);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==start)
		{
			new Tester(name);
			setVisible(false);
		}
		else 
		{
			setVisible(false);
			new Login();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Rules("User");
	}

	

}
