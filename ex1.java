import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ex1 extends JFrame {
public JTextField textField_1;
public JButton btn_start;
public String[] game_LV={ "level 1", "level 2", "level 3", "level 4", "level 5", "level 6", "level 7" };
public  ex1(){
	setSize(400,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	setVisible(true);//실행 필요 요소 모음.
	
	textField_1 = new JTextField();// 단어입력
	textField_1.setBounds(115, 631, 267, 38);
	textField_1.setColumns(10);
	getContentPane().add(textField_1); 
  
	

	
}
public static void manin(String[] args) {
	new ex1();
	

}
}