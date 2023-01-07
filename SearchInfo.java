package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SearchInfo implements ActionListener{

	private JFrame frame;
	private JLabel nameL;
	private JLabel idL;
	
	private JTextField name;
	private JTextField id;
	
	private JButton submit;
	private JButton cancel;
	public SearchInfo(){
		frame= new JFrame();
		
		nameL=new JLabel("Name");
		idL= new JLabel("ID");
		
		name= new JTextField();
		id= new JTextField();
		
		submit= new JButton("Submit");
		submit.addActionListener(this);
		cancel= new JButton("Cancel");
		
		GridLayout g= new GridLayout(3,2,25,50);
		frame.setLayout(g);
		
		frame.add(nameL);
		frame.add(name);
		frame.add(idL);
		frame.add(id);
		frame.add(submit);
		frame.add(cancel);
		
		frame.setVisible(true);
		frame.setSize(600,400);
	}
	
	public static void main(String[] args) {
		
		new SearchInfo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
