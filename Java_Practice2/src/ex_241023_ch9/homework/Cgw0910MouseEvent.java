package ex_241023_ch9.homework;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.JFrame;

public class Cgw0910MouseEvent extends JFrame {
    HashMap<String, String> wordsHashMap = new HashMap<>();
    Container c = getContentPane();

    public Cgw0910MouseEvent() {
        setTitle("단어장 바꾸기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setVisible(true);
    }

    public void addwordsHashMap(String word, String mean) {
        Label la = new Label(word);  // word 값을 라벨 텍스트로 설정
        wordsHashMap.put(word, mean);
        int gridShell = (int) Math.sqrt(wordsHashMap.keySet().size());
        c.setLayout(new GridLayout(gridShell, gridShell));

        // 라벨에 마우스 리스너를 추가
        la.addMouseListener(new MyMouseListener(la));
        c.add(la);  // 라벨을 컨테이너에 추가
        revalidate(); // 레이아웃 갱신
        repaint();    // 화면 갱신
    }

    // MyMouseListener 클래스 수정
    class MyMouseListener extends MouseAdapter {
        private Label la;
        private String word;
			
        public MyMouseListener(Label la) {
            this.la = la;  // 생성자로 Label을 받아 필드에 저장
        }

        @Override
        public void mousePressed(MouseEvent e) {
            word = la.getText();
            // 해당부분
            System.out.println(wordsHashMap.get(word));
            la.setText(wordsHashMap.get(word));
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            la.setText(word);
        }
    }

    public static void main(String[] args) {
        Cgw0910MouseEvent frame = new Cgw0910MouseEvent();
        frame.addwordsHashMap("apple", "사과");
        frame.addwordsHashMap("delicious", "맛있는");
        frame.addwordsHashMap("banana", "바나나");
        frame.addwordsHashMap("long", "긴");
        frame.addwordsHashMap("train", "기차");
        frame.addwordsHashMap("fast", "빠른");
        frame.addwordsHashMap("airplane", "비행기");
        frame.addwordsHashMap("high", "높은");
    }
}