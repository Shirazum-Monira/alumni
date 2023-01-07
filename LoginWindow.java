package project;

import javax.swing.*;
//import java.awt.*; 
//import java.awt.ActiveEvent;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginWindow implements ActionListener{

	private JFrame frame;
	
	private JLabel userNameL;
	private JLabel passwordL;
	
	private JTextField userName;
	private JPasswordField password;
	
	
	private JButton login;
	private JButton cancel;
	
	public LoginWindow(){
		frame = new JFrame();
		
		userNameL= new JLabel("User Name");
		passwordL= new JLabel("Password");
		
		userName= new JTextField("Enter User Name");
		password= new JPasswordField();
		
		
		login= new JButton("Login");
		login.addActionListener(this);
		cancel= new JButton("cancel");
		
		GridLayout g = new GridLayout(3, 2,5,80);
		frame.setLayout(g);
		
		frame.add(userNameL);
		//userNameL.setForeground(Color.BLACK);
		userName.setSize(10, 15);
		frame.add(userName);
		userName.setSize(1, 1);
		frame.add(passwordL);
		frame.add(password);
		frame.add(login);
		frame.add(cancel);
		
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Welcome");
		frame.setBackground(Color.DARK_GRAY);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LoginWindow();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login){
		String a = userName.getText(); // value of name
		String b = password.getText();// value of id
	//	String c = department.getSelectedItem().toString(); // value of department
		if(a.equals(userName) && b.equals(password)){
			JOptionPane.showMessageDialog(null,"Success");	
			new MainMenu();
			frame.setVisible(true);
		}
		
		else{
			JOptionPane.showMessageDialog(null,"Eror");
		}
		}
		else if(e.getSource() == cancel){
			System.exit(0);
			userName.setText("");
			password.setText("");
			frame.setVisible(false);
			//frame.setDefaultCloseOperation(JFrame.);
			//department.setSelectedIndex(0);
		}
		
		/*else if(e.getSource() == cancel){
			System.exit(0);
			name.setText("");
			id.setText("");
			department.setSelectedIndex(0);*/
	}
	
}

