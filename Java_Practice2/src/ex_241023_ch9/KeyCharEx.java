package ex_241023_ch9;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCharEx extends JFrame {
	private JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다");

	public KeyCharEx() {
		super("KeyListener의 문자 키 입력 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		setSize(250, 150);
		setVisible(true);
		c.setFocusable(true); // 컨텐트팬이 포커스를 받을 수 있도록 설정
		c.requestFocus(); // 컨텐트팬에 포커스 설정
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			// 임의의 색을 만들기 위해 랜덤하게 r, g, b 성분 생성
			int r = (int) (Math.random() * 256); // red 성분
			int g = (int) (Math.random() * 256); // green 성분
			int b = (int) (Math.random() * 256); // blue 성분

			switch (e.getKeyChar()) { // 입력된 키 문자
			case '\n': // <Enter> 키 입력
				la.setText("r=" + r + ", g=" + g + ", b=" + b);
				getContentPane().setBackground(new Color(r, g, b));
				break;
			case 'q':
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		new KeyCharEx();
	}
}
