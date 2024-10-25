package ex_241023_cha10;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame {
	public ButtonImageEx() { 
		  setTitle("이미지 버튼 예제"); 
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		  Container c = getContentPane(); 
		  c.setLayout(new FlowLayout()); 
		 
		  ImageIcon normalIcon = new ImageIcon("images/test11.png"); 
		  ImageIcon rolloverIcon = new ImageIcon("images/test22.png"); 
		  ImageIcon pressedIcon = new ImageIcon("images/test44.png"); 
		 
		  JButton btn = new JButton("call~~", normalIcon); 
		  btn.setPressedIcon(pressedIcon); // pressedIcon용 이미지 등록 
		  btn.setRolloverIcon(rolloverIcon); // rolloverIcon용 이미지 등록 
		  
		  c.add(btn); 
		  setSize(250,150); 
		  setVisible(true); 
		 } 
		 public static void main(String [] args) { 
		  new ButtonImageEx(); 
		 } 
}
