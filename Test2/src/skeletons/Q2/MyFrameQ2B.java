package skeletons.Q2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrameQ2B extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("Stepped  Application  ");
	private JLabel l1 = new JLabel("Value1 ");
	private JTextField t1=new JTextField(" ",8);
	private JLabel l3 = new JLabel("StepAmount ");
	private JTextField t3=new JTextField(" ",8);
	private JButton b1=new JButton("IncrementV1");
	private JButton b2=new JButton("StepUp V1");
	private JButton b3=new JButton("ChangeStep");
	private JTextField t2=new JTextField("0",8);

	
	private JPanel p1=new JPanel();
	
	private SteppedValue c = new SteppedValue(0,2);
	
	public MyFrameQ2B(String s){
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
		p1.add(b3); p1.add(t2);

		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
		b3.addActionListener(this);  
		refresh();
		setSize(240,230);    setVisible(true);}
	
	public  void  refresh(){
		t1.setText(""+ c.readValue1());
		t3.setText(""+ c.readStep());
		t2.setText("");       
	}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){
	          		c.increment();
	          		refresh();
	             }
	 	if (target==b2){
	 				c.stepUpValue1();
	 				refresh();
         }
	 	if (target==b3){
				int res=Integer.parseInt(t2.getText());
				c.updateStep(res);
				refresh();
 }
	 }

}