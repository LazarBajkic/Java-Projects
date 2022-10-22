
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Myframe4 extends JFrame implements ActionListener {

	
	JLabel label=new JLabel();
	JButton button=new JButton("Order");
	JTextField field=new JTextField();
	ImageIcon icon=new ImageIcon("Freddy.png");
	
	Myframe4(){
		
		label.setLocation(10,0);
		label.setSize(500, 250);
		label.setIcon(icon);
		
		button.setLocation(95, 300);
		button.setSize(100, 25);
		button.setFocusable(false);
		button.addActionListener(this);
		
		this.setSize(300,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.add(label);
		this.add(button);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			 this.dispose();
			Myframe2 frame2=new Myframe2();
		}
	}

}
