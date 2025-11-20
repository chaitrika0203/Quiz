package quiz;

//import java.util.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Score extends JFrame implements ActionListener{
	Score(String name, int score)
	{

		setBounds(60, 0, 1140, 750);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		// Load and scale image
		ImageIcon i1 = new ImageIcon(getClass().getResource("/pic/score.png"));
		Image i2 = i1.getImage().getScaledInstance(1000, 250, Image.SCALE_SMOOTH);
		ImageIcon i3 = new ImageIcon(i2);

		// Create JLabel with the scaled image
		JLabel image = new JLabel(i3);
		image.setBounds(60, 0, 1000, 250); // Adjust as needed
		add(image);
		
		JLabel heading = new JLabel("Thank you " + name + " for playing the Codegnan Quiz");
        heading.setBounds(300, 350, 1100, 30);
        heading.setFont(new Font("Times new roman", Font.BOLD, 28));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(480, 430, 300, 30);
        lblscore.setFont(new Font("Times new roman", Font.BOLD, 30));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(900,650,200,40);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
		
		
		setVisible(true);

		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
        new Login();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Score("User",0);

	}



	

}
