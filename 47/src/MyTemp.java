import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyTemp extends JFrame{
	private JButton t1,t2;
	private JLabel l1;
	private JTextField in1,ou1;
	MyTemp(){
		super("華氏與攝氏的轉換");
		setLayout(new BorderLayout());
		l1 = new JLabel("請輸入溫度:");
		t1 = new JButton("華氏轉攝氏");
	    t2 = new JButton("攝氏轉華氏");
	    in1 = new JTextField();
	    ou1 = new JTextField();
	   
	    
	    JPanel setLocat = new JPanel(new FlowLayout());
	    setLocat.add(l1);setLocat.add(t1);setLocat.add(t2);setLocat.add(in1);setLocat.add(ou1);
	    
	    add(l1,BorderLayout.NORTH);
	    add(t1,BorderLayout.EAST);
	    add(t2,BorderLayout.WEST);
	    add(in1,BorderLayout.CENTER);
	    add(ou1,BorderLayout.SOUTH);
	    
	    t1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double f =Double.parseDouble(in1.getText());
				ou1.setText("華氏" + f +"度等於攝氏"+ ((f-32)*5/9)+"度");
			}
		});
	    t2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double c = Double.parseDouble(in1.getText());
				ou1.setText("攝氏" + c +"度等於華氏"+ ((c/5*9)+32)+"度");
			}
		});
	    
		setSize(400,120);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new MyTemp();

	}

}

	
	
	

