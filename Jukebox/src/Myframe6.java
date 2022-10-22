import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Myframe6 extends JFrame implements ActionListener{

	JButton button1=new JButton("Caesar salad chicken");
	JButton button2=new JButton("Small salad");
	JButton button3=new JButton("Grilled chicken salad");
	JButton button4=new JButton("Crispy chicken salad");
	JButton button5=new JButton("Yogurt dressing");
	JButton button6=new JButton("Chilli sauce");
	JButton button7=new JButton("BBQ sauce");
	JButton button8=new JButton("Ketchup");
	JButton button9=new JButton("Back");
	JButton button10=new JButton("Next");
	JLabel label1=new JLabel("Pick a salad:");
	JLabel label2=new JLabel("Pick a sauce:");
	JLabel label3=new JLabel("When finished click 'Next' to confirm your order");
	JLabel label4=new JLabel("Click 'Back' to go back and add to your order");
	JTextField field1=new JTextField();
	JTextField field2=new JTextField();
	
	Myframe6(){
		
		label1.setSize(150, 30);
		label1.setLocation(20,20);
		
		label2.setSize(150, 30);
		label2.setLocation(335,20);
		
		label3.setSize(300, 30);
		label3.setLocation(20,387);
		
		label4.setSize(300, 30);
		label4.setLocation(20,350);
		
		field1.setLocation(20, 250);
		field1.setSize(170, 30);
		field1.setEditable(false);
		
		field2.setLocation(335, 250);
		field2.setSize(130, 30);
		field2.setEditable(false);
		
		button1.setLocation(20, 50);
		button1.setSize(170, 30);
		button1.addActionListener(this);
		button1.setFocusable(false);
		
		button2.setLocation(20, 100);
		button2.setSize(170, 30);
		button2.addActionListener(this);
		button2.setFocusable(false);
		
		button3.setLocation(20, 150);
		button3.setSize(170, 30);
		button3.addActionListener(this);
		button3.setFocusable(false);
		
		button4.setLocation(20, 200);
		button4.setSize(170, 30);
		button4.addActionListener(this);
		button4.setFocusable(false);
		
		button5.setLocation(335, 50);
		button5.setSize(130, 30);
		button5.addActionListener(this);
		button5.setFocusable(false);
		
		button6.setLocation(335, 100);
		button6.setSize(130, 30);
		button6.addActionListener(this);
		button6.setFocusable(false);
		
		button7.setLocation(335, 150);
		button7.setSize(130, 30);
		button7.addActionListener(this);
		button7.setFocusable(false);
		
		button8.setLocation(335, 200);
		button8.setSize(130, 30);
		button8.addActionListener(this);
		button8.setFocusable(false);
		
		button9.setSize(100,30);
		button9.setLocation(335, 350);
		button9.addActionListener(this);
		button9.setFocusable(false);
		
		button10.setLocation(335, 390);
		button10.setSize(100, 30);
		button10.addActionListener(this);
		button10.setFocusable(false);
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(field1);
		this.add(field2);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(button9);
		this.add(button10);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button1) {
			field1.setText("Caesar salad chicken");
		}
		else if (e.getSource()==button2) {
			field1.setText("Small salad");
		}
		else if (e.getSource()==button3) {
			field1.setText("Grilled chicken salad");
		}
		else if (e.getSource()==button4) {
			field1.setText("Crispy chicken salad");
		}
		if(e.getSource()==button5) {
			field2.setText("Yogurt dressing");
		}
		else if(e.getSource()==button6) {
			field2.setText("Chilli sauce");
		}
		else if(e.getSource()==button7) {
			field2.setText("BBQ sauce");
		}
		else if(e.getSource()==button8) {
			field2.setText("Ketchup");
		}
		if(e.getSource()==button9) {
			 this.dispose();
			Myframe2 frame2=new Myframe2();
		}
		else if(e.getSource()==button10) {
			 this.dispose();
			Myframe3 frame3=new Myframe3();
		}
	}

}
