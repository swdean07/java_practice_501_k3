package ex_241023_ch9.homework;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Csb806Voca extends JFrame {
    private JLabel a = new JLabel("apple");
    private JLabel b = new JLabel("banana");
    private JLabel c = new JLabel("house");
    private JLabel d = new JLabel("car");

    public Csb806Voca() {
        setTitle("Subin Voca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);


        a.setSize(100, 20);
        a.setLocation(200, 60);
        b.setSize(100, 20);
        b.setLocation(200, 80);
        c.setSize(100, 20);
        c.setLocation(200, 100);
        d.setSize(100, 20);
        d.setLocation(200, 120);


        Mouse mouse = new Mouse();
        a.addMouseListener(mouse);
        b.addMouseListener(mouse);
        c.addMouseListener(mouse);
        d.addMouseListener(mouse);

        c.add(a); 
        c.add(b); 
        c.add(c); 
        c.add(d); 

        setSize(500, 300);
        setVisible(true);
    }

    class Mouse extends MouseAdapter {
        private String originalText;

        public void mousePressed(MouseEvent e) {
            JLabel word = (JLabel) e.getSource();
            originalText = word.getText(); 
            switch (originalText) {
                case "apple":
                    word.setText("사과");
                    break;
                case "banana":
                    word.setText("바나나");
                    break;
                case "house":
                    word.setText("집");
                    break;
                case "car":
                    word.setText("차");
                    break;
            }
        }

        public void mouseReleased(MouseEvent e) {
            JLabel word = (JLabel) e.getSource();
            word.setText(originalText);
        }
    }

    public static void main(String[] args) {
        new Csb806Voca();
    }
}
