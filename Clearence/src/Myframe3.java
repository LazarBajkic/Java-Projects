import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Myframe3 extends JFrame{

	JTextField field=new JTextField();
	Random random=new Random();
	int x=random.nextInt(98)+1;
	
	
	Myframe3(){
		
		field.setLocation(0,0);
	    field.setSize(500,50);
	    field.setEditable(false);
	    field.setText("Your order has been received and is being made,the number of your order: "+x);
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.add(field);
	}
	
}
