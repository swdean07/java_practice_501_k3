package ex_241023_cha15.homework;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class Hcb0402_Frame {
	// component 선언
	private static JPanel centerPanel = new JPanel();
	private static JPanel westPanelInside = new JPanel();
	private static JScrollPane westPanel = new JScrollPane(westPanelInside);
	private static JPanel northPanel = new JPanel();
	private static JButton cButton = new JButton("create");
	private static JButton rButton = new JButton("read");
	private static TextField name = new TextField(10);
	private static TextField email = new TextField(10);
	private static TextField pass = new TextField(10);

	// constructor
	public Hcb0402_Frame() {
		JFrame exFrame = new JFrame();

		// frame property
		exFrame.setTitle("GridLayout 예제");
		exFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		exFrame.setSize(800, 300);

		// 추가 panel 생성, 저장된 정보 넣을 panel도 add, 왼쪽에 들어갈 jslidepane도 add

		exFrame.setLayout(new BorderLayout());
		exFrame.add(northPanel, BorderLayout.NORTH);
		exFrame.add(centerPanel, BorderLayout.CENTER);
		exFrame.add(westPanel, BorderLayout.WEST);
		// jslidepane의 property
		westPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		westPanel.setPreferredSize(new Dimension(200, 300));
		// jpanel의 property
		westPanelInside.setLayout(new BoxLayout(westPanelInside, BoxLayout.Y_AXIS));
		// 출력 패널 레이아웃 세팅

		// 추가 panel에 필요한 것들과 이벤트 리스너
		cButton.addActionListener(e -> create());
		rButton.addActionListener(e -> read());

		// 추가 panel 에 add
		northPanel.add(new JLabel("이름: "));
		northPanel.add(name);
		northPanel.add(new JLabel("이메일: "));
		northPanel.add(email);
		northPanel.add(new JLabel("비밀번호: "));
		northPanel.add(pass);
		northPanel.add(cButton);
		northPanel.add(rButton);

		// 끝
		exFrame.setVisible(true);
	}
	
	// read method
	private void read() {
		westPanelInside.removeAll();
		Hcb0402_DAO dao = new Hcb0402_DAO();
		// JDBC_Ex_DAO 클래스를 사용하기 위해서 객체 생성.

		ArrayList<Hcb0402_DTO> list = dao.select();
		// JDBC_Ex_DAO 클래스의 select 메소드 호출.
		// 결과값으로는 dept 테이블의 모든 레코드를 저장하고 있는
		// ArrayList 객체를 리턴 받는다.

		for (Hcb0402_DTO dto : list) {
			int id = dto.getId();
			String name = dto.getName();
			String email = dto.getEmail();
			String password = dto.getPassword();
			JLabel idName = new JLabel(String.valueOf(id)+name);
			idName.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					centerPanel.removeAll();
					JLabel centerLabel = new JLabel("이메일: "+email+" 비밀번호: "+password,SwingConstants.CENTER);
					centerLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
					centerPanel.add(centerLabel);
					centerPanel.revalidate();
					centerPanel.repaint();
					}
			});
			westPanelInside.add(idName);
		}
		westPanelInside.revalidate();
		westPanelInside.repaint();
	}

	// create method
	private void create() {
		if(!name.getText().isEmpty() && !email.getText().isEmpty() && !pass.getText().isEmpty()) {
		Hcb0402_DTO member = new Hcb0402_DTO(name.getText(),email.getText(),pass.getText());
		new Hcb0402_DAO().insert(member);
		read();
		} else {
			JOptionPane.showMessageDialog(null, "이름과 이메일 비밀번호를 모두 입력해주세요.", "오류", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
	public static void main(String[] args) {
		new Hcb0402_Frame();
		}
	}

