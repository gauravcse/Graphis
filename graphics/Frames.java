package graphics;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*class Dimension {
	int x;
	int y;
	public Dimension(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
*/
public class Frames implements ActionListener {

	JButton button1;
	JButton button2;
	
	public Frames() {
		//Dimension d = new Dimension(400, 200);
		JFrame jframe = new JFrame();
		jframe.setBackground(Color.GREEN);
		jframe.setTitle("GAURAV MITRA");
		jframe.setSize(400,400);
		jframe.setLocation(100, 100);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout flowLayout = new FlowLayout();
		jframe.setLayout(flowLayout);
		
		JLabel myLabel = new JLabel("THIS IS GAURAV MITRA");
		jframe.add(myLabel);
		
		button1 = new JButton();
		button1.setText("Click Me");
		button1.addActionListener(this);
		//button.setEnabled(false);
		jframe.add(button1);
		
		button2 = new JButton();
		button2.setText("Click Me");
		button2.addActionListener(this);
		//button.setEnabled(false);
		jframe.add(button2);
		
		//jframe.pack();
		
		jframe.setVisible(true);	
	}
	
	public static void main(String[] args) {
		Frames frame = new Frames();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.print(e.equals("Click Me"));
		Object controlObject = e.getSource();
		if (controlObject == button1) {
			JOptionPane.showMessageDialog(null, "HELLO ");
		}
		else {
			JOptionPane.showMessageDialog(null, "HELLO NO");
		}
	}

}
