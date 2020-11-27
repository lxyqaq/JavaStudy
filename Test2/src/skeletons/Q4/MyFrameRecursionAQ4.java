package skeletons.Q4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrameRecursionAQ4 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Recur  Application  ");
	private JLabel l1 = new JLabel("Number: ");
	private JTextField t1=new JTextField("34567",8);
	private JLabel lc = new JLabel("Target: ");
	String [] list = {"1","2","3","4","5","6","7","8"};
	private JComboBox c1=new JComboBox(list);
	private JTextField t2=new JTextField("",8);
	private JTextField t3=new JTextField("",8);
	
	private JButton b1=new JButton("countLessThan"); 
	private JButton b2=new JButton("noneGreater"); 
	private JPanel p1=new JPanel();
	
	// addEven(12348) = 14
	// 
	public int countLessThan(int value,int target) {
    	 int last = value%10;
    	 int rest= value/10;
    	 return 0;
	}
	// noTwos(11345)=true
	// noTwos(12345)=false
	public boolean noneGreater(int value, int target) {
   	 int last = value%10;
   	 int rest= value/10;
   	 return true;
	}
	
	public MyFrameRecursionAQ4(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(4,2));
		l0.setFont(f);  
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(lc); p1.add(c1);
		p1.add(b1); p1.add(t2);
		p1.add(b2); p1.add(t3);

		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
		setSize(280,200);    setVisible(true);}
	
	

	
	public void actionPerformed(ActionEvent e){
        
	  	Object Target=e.getSource();
	 	if (Target==b1){
	            int value=Integer.parseInt(t1.getText());
	            int target= Integer.parseInt((String)c1.getSelectedItem());
	            int res=this.countLessThan(value,target);
                t2.setText(""+res);
	 	}
	    if (Target==b2){
            int value=Integer.parseInt(t1.getText());
            int target= Integer.parseInt((String)c1.getSelectedItem());
            boolean res=this.noneGreater(value,target);
            t3.setText(""+res);
             }
	 }

}