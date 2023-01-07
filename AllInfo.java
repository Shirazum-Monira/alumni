package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AllInfo implements ActionListener{
 private JFrame frame;
 
 
 public AllInfo(){
	 frame= new JFrame();
	 GridLayout g= new GridLayout();
		frame.setLayout(g);
		
		frame.setVisible(true);
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setTitle("All Alumni Information");
 }
	public static void main(String[] args) {
		
		new AllInfo();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
