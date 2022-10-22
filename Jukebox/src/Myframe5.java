import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Myframe5 extends JFrame implements ActionListener{

	JButton button1=new JButton("Muffin choco");
	JButton button2=new JButton("Milka choco");
	JButton button3=new JButton("Milka Donut");
	JButton button4=new JButton("Apple pie");
	JButton button5=new JButton("Shake strawberry");
	JButton button6=new JButton("Shake chocolate");
	JButton button7=new JButton("Shake vanilla");
	JButton button8=new JButton("Next");
	JButton button9=new JButton("Small");
	JButton button10=new JButton("Large");
	JButton button11=new JButton("Back");
	JLabel label1=new JLabel("Pick a dessert: ");
	JLabel label2=new JLabel("Pick a shake: ");
	JLabel label3=new JLabel("Pick a size: ");
	JLabel label4=new JLabel("When finished click 'Next' to confirm your order");
	JLabel label5=new JLabel("Click 'Back' to go back and add to your order");
	JTextField field1=new JTextField();
	JTextField field2=new JTextField();
	JTextField field3=new JTextField(); 
	
	Myframe5(){
		
		field1.setSize(120, 30);
		field1.setLocation(20,220);
		field1.setEditable(false);
		
		field2.setSize(140, 30);
		field2.setLocation(325,180);
		field2.setEditable(false);
		
		field3.setSize(100, 30);
		field3.setLocation(325,320);
		field3.setEditable(false);
		
		label1.setSize(100, 50);
		label1.setLocation(20, 20);

		label2.setSize(100, 50);
		label2.setLocation(325, 20);
		
		label3.setSize(150, 50);
		label3.setLocation(325, 200);
		
		label4.setSize(300, 50);
		label4.setLocation(10, 390);
		
		label5.setSize(300,25);
		label5.setLocation(10,370);
		
		button1.setSize(120,30);
		button1.setLocation(20, 60);
		button1.addActionListener(this);
		button1.setFocusable(false);
		
		button2.setSize(120,30);
		button2.setLocation(20, 100);
		button2.addActionListener(this);
		button2.setFocusable(false);
		
		button3.setSize(120,30);
		button3.setLocation(20, 140);
		button3.addActionListener(this);
		button3.setFocusable(false);
		
		button4.setSize(120,30);
		button4.setLocation(20, 180);
		button4.addActionListener(this);
		button4.setFocusable(false);
		
		button5.setSize(140,30);
		button5.setLocation(325, 60);
		button5.addActionListener(this);
		button5.setFocusable(false);
		
		button6.setSize(140,30);
		button6.setLocation(325, 100);
		button6.addActionListener(this);
		button6.setFocusable(false);
		
		button7.setSize(140,30);
		button7.setLocation(325, 140);
		button7.addActionListener(this);
		button7.setFocusable(false);
		
		button8.setSize(100,30);
		button8.setLocation(345, 400);
		button8.addActionListener(this);
		button8.setFocusable(false);
		
		button9.setSize(100,30);
		button9.setLocation(325, 240);
		button9.addActionListener(this);
		button9.setFocusable(false);
		
		button10.setSize(100,30);
		button10.setLocation(325, 280) ;
		button10.addActionListener(this);
		button10.setFocusable(false);
		
		button11.setSize(100,30);
		button11.setLocation(345, 363);
		button11.addActionListener(this);
		button11.setFocusable(false);
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.add(field1);
		this.add(field2);
		this.add(field3);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(label5);
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
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			field1.setText("Muffin choco");
		}
		else if(e.getSource()==button2) {
			field1.setText("Milka choco");
		}
		else if(e.getSource()==button3) {
			field1.setText("Milka donut");
		}
		else if(e.getSource()==button4) {
			field1.setText("Apple pie");
		}
		if(e.getSource()==button5) {
			field2.setText("Shake strawberry");
		}
		else if(e.getSource()==button6) {
			field2.setText("Shake chocolate");
		}
		else if(e.getSource()==button7) {
			field2.setText("Shake vanilla");
		}
		if(e.getSource()==button9) {
			field3.setText("Small");
		}
		else if(e.getSource()==button10) {
			field3.setText("Large");
		}
		if (e.getSource()==button8) {
			 this.dispose();
			Myframe3 frame3=new Myframe3();
		}
		else if (e.getSource()==button11) {
			 this.dispose();
			Myframe2 frame2=new Myframe2();
		}
	}

}
