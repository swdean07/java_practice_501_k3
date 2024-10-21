package ex_241021_ch3.homework;

import java.util.Scanner;

public class Kjy1122_homework {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 배열 정의
        String[] menu = new String[3];
        
        System.out.println("============오늘 먹고 싶은 점심 메뉴 3개 작성해보기=============");
        
        // 메뉴 입력받기
        for (int i = 0; i < menu.length; i++) {
            System.out.print("메뉴" + (i + 1) + " : ");
            menu[i] = scanner.nextLine();  // 사용자가 입력한 메뉴 저장
        }
        
        System.out.println("=================================================");
        System.out.println("오늘 먹고 싶은 메뉴 출력");
        
        // 입력된 메뉴 출력하기
        for (String m : menu) {
            System.out.println(m);
        }
        
        // Scanner 객체 닫기
        scanner.close();
    }
}
