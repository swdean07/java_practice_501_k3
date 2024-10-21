package ex_241021_ch3.homework;

import java.util.Scanner;

public class Hsw1009_arrayTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menu = new String[3];
        
        System.out.println("============오늘 먹고 싶은 점심 메뉴 3개 작성해보기=============");
        for (int i = 0; i < 3; i++) {
            System.out.print("메뉴" + (i + 1) + " : ");
            menu[i] = scanner.nextLine();
        }
        System.out.println("=================================================");
        System.out.println("오늘 먹고 싶은 메뉴 출력");
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
        
        scanner.close();
	}
}
