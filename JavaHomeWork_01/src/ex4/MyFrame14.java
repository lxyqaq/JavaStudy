package ex4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame14 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Dice  Application  ");
	private JLabel l1 = new JLabel("Value ");
	private JTextField t1=new JTextField(" ",8);
	//private JLabel l2 = new JLabel("Balance ");
	//private JTextField t2=new JTextField("0",8);
	private JButton b1=new JButton("Roll");//private JTextField t3=new JTextField("0",8);
	private JButton b2=new JButton("Exit");//private JTextField t4=new JTextField("0",8);

	private JPanel p1=new JPanel();
	
	private Die d =new Die(0);
	
	public MyFrame14(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(2,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(b1); p1.add(b2); 
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
 
		t1.setText("0");
		setSize(210,230);    setVisible(true);}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){
	          		d.roll();
	             	t1.setText(""+ d.getValue());
	             }
	 	if (target==b2){
      		System.exit(0);
         }
	 	
	 }

}