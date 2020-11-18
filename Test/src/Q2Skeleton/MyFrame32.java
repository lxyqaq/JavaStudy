package Q2Skeleton;

import Solutions.MyCounter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame32 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("Counter  Application  ");
	private JLabel l1 = new JLabel("Value ");
	private JTextField t1=new JTextField(" ",8);
	private JLabel l3 = new JLabel("Limit ");
	private JTextField t3=new JTextField(" ",8);
	private JButton b1=new JButton("Incr");
	private JButton b2=new JButton("Decr");
	private JLabel l2 = new JLabel("Message ");
	private JTextField t2=new JTextField("0",8);
	private boolean res=true;
	
	private JPanel p1=new JPanel();
	
	private MyCounter c = new MyCounter(0,10);
	
	public MyFrame32(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(4,2));
		l0.setFont(f);  
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l3); p1.add(t3);
		p1.add(b1); p1.add(b2);
		p1.add(l2); p1.add(t2);

		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
		refresh();
		setSize(210,230);    setVisible(true);}
	
	public  void  refresh(){
		t1.setText(""+ c.readValue());
		t3.setText(""+ c.readLimit());
		if (res==false) t2.setText("Error");
		else            t2.setText("");       
	}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){
	          		res=c.increment();
	          		refresh();
	             }
	 	if (target==b2){
      		       res=c.decrement();
      		       refresh();
         }
	
	 }

}