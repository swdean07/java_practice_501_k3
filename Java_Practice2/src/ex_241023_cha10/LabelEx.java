package ex_241023_cha10;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("제임스 고슬링 입니더!");
		ImageIcon img = new ImageIcon("images/test11.png");
		
		JLabel imageLabel = new JLabel(img);
		ImageIcon icon = new ImageIcon("images/test22.png");
		JLabel label = new JLabel("커피한잔 하실래예, 전화주이소", icon, SwingConstants.CENTER);
		c.add(imageLabel);
		c.add(label);
		
		c.add(textLabel);
		setSize(300, 500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new LabelEx();
	}
}
