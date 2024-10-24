package ex_241023_ch9;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		setSize(250, 120);
		setVisible(true);

	}

	public static void main(String[] args) {
		new IndepClassListener();
	}

}

// 독립된 클래스로 이벤트 리스너를 작성한다.
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}
