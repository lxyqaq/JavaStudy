package revision;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrameQ1A extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("Double  Application  ");
	private JLabel l1 = new JLabel("Value1 ");
	private JTextField t1=new JTextField(" ",8);
	private JLabel l3 = new JLabel("Value2 ");
	private JTextField t3=new JTextField(" ",8);
	private JButton b1=new JButton("StepV1");
	private JButton b2=new JButton("StepV2");
	private JButton b3=new JButton("Add");
	private JTextField t2=new JTextField("0",8);
	private JButton b4=new JButton("ResetV1");
	private JTextField t4=new JTextField("0",8);
	
	private JPanel p1=new JPanel();
	
	private DoubleValue c = new DoubleValue(0,0);
	
	public MyFrameQ1A(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(5,2));
		l0.setFont(f);  
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l3); p1.add(t3);
		p1.add(b1); p1.add(b2);
		p1.add(b3); p1.add(t2);
		p1.add(b4); p1.add(t4);
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
		b3.addActionListener(this);  
		b4.addActionListener(this); 
		refresh();
		setSize(210,230);    setVisible(true);}
	
	public  void  refresh(){
		t1.setText(""+ c.readValue1());
		t3.setText(""+ c.readValue2());
		t2.setText("");       
	}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){
	          		c.stepValue1();
	          		refresh();
	             }
	 	if (target==b2){
	 				c.stepValue2();
	 				refresh();
         }
	 	if (target==b3){
				int res=c.addValues();
				t2.setText(""+res);
        }
	 	if (target==b4){
	 		int newVal=Integer.parseInt(t4.getText());
			c.setValue1(newVal);
			refresh();
    }
	 	
	 }

}