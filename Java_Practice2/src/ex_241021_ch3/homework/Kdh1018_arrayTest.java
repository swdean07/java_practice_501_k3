package ex_241021_ch3.homework;

import java.util.Scanner;

public class Kdh1018_arrayTest {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menu = new String[3];

        System.out.println("오늘먹을 점심메뉴");
        
        
        for (int i = 0; i < menu.length; i++) {
            System.out.print("메뉴" + (i + 1) + " : ");
            menu[i] = scanner.nextLine();
        }

        
        System.out.println("점심메뉴");


       
        for (String item : menu) {
            System.out.println(item);
        }

        scanner.close();
    }
	
}
