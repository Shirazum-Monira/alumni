package project;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MainMenu implements ActionListener{
private JFrame frame;
private JButton add;
private JButton search;
private JButton allInfo;
//private Jbutton 

public MainMenu(){
	
	frame= new JFrame();
	add= new JButton("Add Alumni Information");
	search=new JButton("Search Alumni Informaton");
	allInfo= new JButton("All Alumni Information");
	
	//JOptionPane frame= new JOptionPane();
	frame.add(add);
	add.addActionListener(this);
	frame.add(search);
	search.addActionListener(this);
	frame.add(allInfo);
    allInfo.addActionListener(this);
	
	GridLayout g= new GridLayout(3,1);
	frame.setLayout(g);
	frame.setVisible(true);
	frame.setSize(600, 400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("North South Universiy Alumni Information");
	frame.setBackground(Color.BLUE);
}
	public static void main(String[] args) {
		
    new MainMenu(); 
	}
	
	//Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==add){
			new AddInfo();
			frame.setVisible(false);
		}
		else if(e.getSource()==search){
			new SearchInfo();
			frame.setVisible(false);
		}
		else if(e.getSource()==allInfo){
			new AllInfo();
			frame.setVisible(false);
		}
		
	}

}
