package ex_241023_cha15.homework;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Hsw1009ProTest extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JTable memberTable;
    private DefaultTableModel tableModel;
    private Hsw1009DAO memberDAO;
	private String url;
	private String userid;
	private String passwd;

    public Hsw1009ProTest() {
        setTitle("회원 관리 프로그램 V 1.0.0");
        setSize(800, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        memberDAO = new Hsw1009DAO();
        
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Name: "));
        nameField = new JTextField(10);
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("E-mail: "));
        emailField = new JTextField(10);
        inputPanel.add(emailField);

        inputPanel.add(new JLabel("Password: "));
        passwordField = new JPasswordField(10);
        inputPanel.add(passwordField);

        JButton addButton = new JButton("Add");
        JButton fetchButton = new JButton("Search");
        inputPanel.add(addButton);
        inputPanel.add(fetchButton);

        add(inputPanel, BorderLayout.NORTH);

        String[] columnNames = { "이름", "이메일", "패스워드" };
        tableModel = new DefaultTableModel(columnNames, 0);
        memberTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(memberTable);
        add(scrollPane, BorderLayout.CENTER);

        addButton.addActionListener(e -> addMember());
        fetchButton.addActionListener(e -> fetchMembers());

        setVisible(true);
    }
    
    private void addMember() {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            try {
                String hashedPassword = PasswordUtil.hashPassword(password);
                Hsw1009DTO member = new Hsw1009DTO(name, email, hashedPassword);
                boolean isSaved = memberDAO.insertMember(member);

                if (isSaved) {
                    JOptionPane.showMessageDialog(null, "회원 정보가 성공적으로 저장되었습니다.", "저장 성공", JOptionPane.INFORMATION_MESSAGE);
                    tableModel.addRow(new String[] { name, email, hashedPassword });
                    nameField.setText("");
                    emailField.setText("");
                    passwordField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "회원 정보 저장에 실패했습니다.", "저장 실패", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "오류 발생: " + e.getMessage(), "오류", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "이름, 이메일, 패스워드를 모두 입력해주세요.", "입력 오류", JOptionPane.ERROR_MESSAGE);
        }
        
        if (memberDAO.isEmailExists(email)) {
            JOptionPane.showMessageDialog(null, "이미 존재하는 이메일입니다.", "입력 오류", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }
  
    private void fetchMembers() {
        List<Hsw1009DTO> members = memberDAO.fetchAllMembers();
        tableModel.setRowCount(0);

        if (members == null || members.isEmpty()) {
            JOptionPane.showMessageDialog(null, "조회된 회원이 없습니다.", "조회 실패", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for (Hsw1009DTO member : members) {
                tableModel.addRow(new String[] { member.getName(), member.getEmail(), "*****" });
            }
            JOptionPane.showMessageDialog(null, "회원 목록이 성공적으로 불러왔습니다.", "조회 성공", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public boolean validateUser(String email, String password) {
        String hashedInputPassword = PasswordUtil.hashPassword(password);
        List<Hsw1009DTO> members = memberDAO.fetchAllMembers();

        for (Hsw1009DTO member : members) {
            if (member.getEmail().equals(email) && member.getPassword().equals(hashedInputPassword)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isEmailExists(String email) {
        String query = "SELECT COUNT(*) FROM members WHERE email = ?";
        try (Connection connection = DriverManager.getConnection(url, userid, passwd);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        new Hsw1009ProTest();
    }
}





