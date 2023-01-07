package project;

import java.awt.*;
//import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

/*import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JWindow;*/

public class AddInfo implements ActionListener{
    private JFrame frame;
	
	private JLabel nameL;
	private JLabel idL;
	private JLabel deptL;
	private JLabel emailL;
	private JLabel addressL;
	
	private JTextField name;
	private JTextField id;
	
	private JComboBox department;
	private JTextField email;
	private JTextField address;
	
	private JButton submit;
	private JButton cancel;
	
	public AddInfo(){
		// initialize components
		frame = new JFrame();
		
		nameL = new JLabel("Name");
		idL = new JLabel("ID");
		deptL = new JLabel("Department");
		emailL= new JLabel("E-mail");
		addressL= new JLabel("Address");

		name = new JTextField("Default Value");
		id = new JTextField();
		email= new JTextField();
		address= new JTextField();
		
	//	window =new JWindow();
		
		String [] options = {"ECE", "BBA", "CEE","MBA & EMBA","MIB","Accounting and Finance","Economics","EML","PSS","Law","History & Philosophy","ARCHITECTURE","MATHEMATICS & PHYSICS","PUBLIC HEALTH"};
		department = new JComboBox(options);
		
		submit = new JButton("Submit");
		submit.addActionListener(this);
		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		
		/*menuBar = new JMenuBar();
		file = new JMenu("File");
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		file.add(open);
		file.add(save);
		menuBar.add(file);
		frame.setJMenuBar(menuBar);*/
		
		// set layout
		GridLayout g = new GridLayout(6, 2,25,50);
		frame.setLayout(g);
		
		// add components
		frame.setBackground(Color.cyan);
		frame.add(nameL);
		frame.add(name);
		frame.add(idL);
		frame.add(id);
		frame.add(deptL);
		frame.add(department);
		frame.add(emailL);
		frame.add(email);
		frame.add(addressL);
		frame.add(address);
		frame.add(submit);
		frame.add(cancel);
		
		frame.setSize(650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Add Alumni Information");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AddInfo();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//here will be a
	}

}
