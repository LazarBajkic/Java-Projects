import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Myframe2 extends JFrame implements ActionListener{

	JButton button1=new JButton("Hamburger");
	JButton button2=new JButton("Cheesburger");
	JButton button3=new JButton("Double Cheesburger");
	JButton button4=new JButton("Royal Burger");
	JButton button5=new JButton("Chickenburger");
	JButton button6=new JButton("Chicken nuggets");
	JButton button7=new JButton("Chicken wrap");
	JButton button8=new JButton("Spicy nuggets");
	JButton button9=new JButton("Desserts & Shakes");
	JButton button10=new JButton("Salads & Dressings");
	JButton button11=new JButton("Soda & Fries");
	JLabel label1=new JLabel("Pick a burger: ");
	JLabel label2=new JLabel("Pick a Chicken meal: ");
	JTextField field1=new JTextField();
	JTextField field2=new JTextField();
	JLabel label3=new JLabel();
	
	Myframe2(){
		
		field1.setLocation(10, 255);
		field1.setSize(150,30);
		field1.setEditable(false);
		
		field2.setLocation(325, 255);
		field2.setSize(150,30);
		field2.setEditable(false);
		
		label3.setLocation(10,330 );
		label3.setSize(250,30);
		label3.setText("Pick a side dish after picking your main dish");
		
		label1.setLocation(10, 20);
		label1.setSize(100, 90);
		
		label2.setLocation(325, 20);
		label2.setSize(125, 90);
		
		button1.setLocation(10,80);
		button1.setSize(150,25);
		button1.setFocusable(false);
		button1.addActionListener(this);
		
		button2.setLocation(10,125);
		button2.setSize(150,25);
		button2.setFocusable(false);
		button2.addActionListener(this);
		
		button3.setLocation(10,170);
		button3.setSize(150,25);
		button3.setFocusable(false);
		button3.addActionListener(this);
		
		button4.setLocation(10,215);
		button4.setSize(150,25);
		button4.setFocusable(false);
		button4.addActionListener(this);
		
		button5.setLocation(325,80);
		button5.setSize(150,25);
		button5.setFocusable(false);
		button5.addActionListener(this);
		
		button6.setLocation(325,125);
		button6.setSize(150,25);
		button6.setFocusable(false);
		button6.addActionListener(this);
		
		button7.setLocation(325,170);
		button7.setSize(150,25);
		button7.setFocusable(false);
		button7.addActionListener(this);
		
		button8.setLocation(325,215);
		button8.setSize(150,25);
		button8.setFocusable(false);
		button8.addActionListener(this);
		
		button9.setLocation(5,370);
		button9.setSize(150,25);
		button9.setFocusable(false);
		button9.addActionListener(this);
		
		button10.setLocation(167,370);
		button10.setSize(150,25);
		button10.setFocusable(false);
		button10.addActionListener(this);
		
		button11.setLocation(330,370);
		button11.setSize(150,25);
		button11.setFocusable(false);
		button11.addActionListener(this);
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.add(field1);
		this.add(field2);
		this.add(label1);
		this.add(label2);
		this.add(label3);
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
		this.add(button11);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			field1.setText("Hamburger");
		}
		else if(e.getSource()==button2) {
			field1.setText("Cheesburger");
		}
		else if(e.getSource()==button3) {
			field1.setText("Double Cheesburger");
		}
		else if(e.getSource()==button4) {
			field1.setText("Royal Burger");
		}
		if(e.getSource()==button5) {
			field2.setText("Chickenburger");
		}
		else if(e.getSource()==button6) {
			field2.setText("Chicken nuggets");
		}
		else if(e.getSource()==button7) {
			field2.setText("Chicken wrap");
		}
		else if(e.getSource()==button8) {
			field2.setText("Spicy nuggets");
		}
		if(e.getSource()==button11) {
			 this.dispose();
			Myframe frame=new Myframe();
		}
		else if(e.getSource()==button9) {
			 this.dispose();
			Myframe5 frame5=new Myframe5();
		}
		else if(e.getSource()==button10) {
			 this.dispose();
			Myframe6 frame6=new Myframe6();
		}
	}
	
}
