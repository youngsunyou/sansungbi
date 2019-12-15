import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ex2 extends JFrame{

	public ex2() {
		
	setTitle("¿ÃπÃ¡ˆ");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(getOwner());

	Container c = getContentPane();
	c.setLayout(null);
	
	
	
	setLayout(null);
	setContentPane(new MyPanel());
	setSize(300, 300);
	setVisible(true);
}
	public class MyPanel extends JPanel{
		public MyPanel() {
			JButton n = new JButton("hi");
			
			add(n);
			n.setLocation(50,50);
			
		}
public void paintComponent(Graphics g) {
	super.paintComponents(g);
	
Image icon = new ImageIcon("C:\\Users\\Uter\\Desktop/A.jpg").getImage();
g.drawImage(icon,50,50,100,100,this);
	 
	
}
	}
public static void main(String[] args) {
	new ex2();
}}
