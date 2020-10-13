package q4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame22 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Cricketer  Application  ");
	private JLabel l1 = new JLabel("Name ");
	private JTextField t1=new JTextField(" ",8);
	private JLabel l2 = new JLabel("Club ");
	private JTextField t2=new JTextField("0",8);
	private JButton b1=new JButton("Update First");private JTextField t3=new JTextField("0",8);
	private JButton b2=new JButton("Add Runs");
	
	//private JTextField t4=new JTextField("0",8);
	private JComboBox t4=new JComboBox(new String[]{"1","2","3","4","5","6"});
	private JLabel l4 = new JLabel("Runs ");
	private JTextField t5=new JTextField("",8);
	private JTextField t6=new JTextField("",8);
	private JPanel p1=new JPanel();
	private JButton b5=new JButton("print Details");
	private JButton b6=new JButton("Update Surname");
	private Cricketer s =new Cricketer("Joe",   "Root","Yorkshire");
	
	public MyFrame22(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(6,2));
		l0.setFont(f);  l1.setFont(f);
		l2.setFont(f);  l4.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(l4); p1.add(t3);

		p1.add(b2); p1.add(t4);

		p1.add(b6); p1.add(t5);		
		p1.add(b1); p1.add(t6);
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
        content.add(b5);   //b5.addActionListener(this);  
        b6.addActionListener(this); 
		refresh();
		setSize(290,270);    setVisible(true);}
	
	public void  refresh(){
	     t1.setText(""+s.readFullName());
	     t2.setText(""+s.readClub());
	     t3.setText(""+s.readRuns());
	}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();

	 	if (target==b2){

      		int r=Integer.parseInt((String)t4.getSelectedItem());
      		s.addRuns(r);
         	refresh();
         }
	 	if (target==b6){

	 		s.updateSurname(t5.getText());
	 		refresh();
         }
	 	if (target==b1){

	 		s.updateFirstName(t6.getText());
	 		 refresh();                 
         }
	 }

}