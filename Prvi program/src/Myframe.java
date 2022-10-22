
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Myframe extends JFrame implements ActionListener{

	
	JButton button1=new JButton("Small");
	JButton button2=new JButton("Medium");
	JButton button3=new JButton("Big");
	JButton button4=new JButton("Small");
	JButton button5=new JButton("Medium");
	JButton button6=new JButton("Big");
	JButton button7=new JButton("Next");
	JButton button8=new JButton("Back");
	JLabel label1=new JLabel();
	JLabel label2=new JLabel();
	JLabel label3=new JLabel();
	JLabel label4=new JLabel();
	JTextField field1=new JTextField();
	JTextField field2=new JTextField();
	
	Myframe(){
	
		
		field1.setSize(300,30);
		field1.setLocation(90,80);
		field1.setEditable(false);
		
		field2.setSize(300,30);
		field2.setLocation(90,200);
		field2.setEditable(false);
		
		label1.setSize(200,30 );
		label1.setText("Pick a size for your fry order: ");
		label1.setLocation(0, 0);

		label2.setSize(200,50 );
		label2.setText("Pick a size for your drink: ");
		label2.setLocation(0, 110);
		
		label3.setSize(300,25);
		label3.setLocation(10,400);
		label3.setText("When finished click 'Next' to confirm your order");
		
		label4.setSize(300,25);
		label4.setLocation(10,370);
		label4.setText("Click 'Back' to go back and add to your order");
		
		button1.setFocusable(false);
		button1.setSize(100, 25);
		button1.setLocation(90,30);
		button1.addActionListener(this);
		
		button2.setFocusable(false);
		button2.setSize(100, 25);
		button2.setLocation(190,30);
		button2.addActionListener(this);
		
		button3.setFocusable(false);
		button3.setSize(100, 25);
		button3.setLocation(290,30);
		button3.addActionListener(this);
		
		button4.setFocusable(false);
		button4.setSize(100, 25);
		button4.setLocation(90,150);
		button4.addActionListener(this);
		
		button5.setFocusable(false);
		button5.setSize(100, 25);
		button5.setLocation(190,150);
		button5.addActionListener(this);
		
		button6.setFocusable(false);
		button6.setSize(100, 25);
		button6.setLocation(290,150);
		button6.addActionListener(this);
		
		button7.setFocusable(false);
		button7.setSize(100, 25);
		button7.setLocation(350,400);
		button7.addActionListener(this);
		
		button8.setFocusable(false);
		button8.setSize(100, 25);
		button8.setLocation(350,370);
		button8.addActionListener(this);
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(field1);
		this.add(field2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			field1.setText("Small");
		}
		else if(e.getSource()==button2) {
			field1.setText("Medium");
		}
		else if(e.getSource()==button3) {
			field1.setText("Big");			
		}
	     if(e.getSource()==button4) {
			field2.setText("Small");
			}
	     else if(e.getSource()==button5) {
	    	 field2.setText("Medium");
	     }
	     else if(e.getSource()==button6) {
	    	 field2.setText("Big");
	}
	     if (e.getSource()==button7) {
	    	 this.dispose();
	    	  Myframe3 frame3=new Myframe3();
	     }
	     else if(e.getSource()==button8) {
	    	 this.dispose();
	    	 Myframe2 frame2=new Myframe2();
	     }
	}
}
