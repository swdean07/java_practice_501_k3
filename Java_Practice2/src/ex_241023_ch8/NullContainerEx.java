package ex_241023_ch8;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {
	 NullContainerEx() { 
		  setTitle("배치관리자 없이 절대 위치에 배치하는 예제"); 
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		  Container contentPane = getContentPane(); 
		  // 
		  contentPane.setLayout(null); // 컨텐트팬의 배치관리자 제거 
		 
		  JLabel la = new JLabel("Hello, Press Buttons!"); 
		  //
		  la.setLocation(130, 50); // la를 (130,50) 위치로 지정 
		  la.setSize(200, 20); // la를 200x20 크기로 지정 
		  contentPane.add(la); // la를 컨텐트팬에 부착 
		 
		  // 9개의 버튼 컴포넌트를 생성하고 동일한 크기로 설정한다. 
		  // 위치는 서로 겹치게 설정한다. 
		  for(int i=1; i<=9; i++) { 
		   JButton b = new JButton(Integer.toString(i)); // 버튼 생성
		   //
		   b.setLocation(i*15, i*15); // 버튼의 위치 설정 
		   b.setSize(50, 20); // 버튼의 크기는 동일하게 50x20 
		   contentPane.add(b); // 버튼을 컨텐트팬에 부착 
		  } 
		  setSize(300, 200); 
		  setVisible(true); 
		 } 
		 public static void main(String[] args) { 
		  new NullContainerEx(); 
		 } 
	
}
