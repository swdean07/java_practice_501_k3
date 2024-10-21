package ex_241021_ch3.homework;

import java.util.Scanner;

public class Asy0705_arrayTest  {
    public static void main(String[] args) {
        // 스캐너 객체 생성 (사용자로부터 입력을 받기 위해)
        Scanner scanner = new Scanner(System.in);

        // 배열의 크기를 지정 (예: 5개의 점심 메뉴 입력)
        String[] lunchMenu = new String[3];

        // 배열에 점심 메뉴 입력 받기
        System.out.println("점심메뉴 3개");
        for (int i = 0; i < lunchMenu.length; i++) {
            System.out.print((i + 1) + "번째 메뉴: ");
            lunchMenu[i] = scanner.nextLine(); // 사용자가 입력한 값을 배열에 저장
        }

        // 입력된 점심 메뉴를 출력
        System.out.println("점심 메뉴:");
        for (int i = 0; i < lunchMenu.length; i++) {
            System.out.println((i + 1) + ". " + lunchMenu[i]);
        }

        // 스캐너 종료
        scanner.close();
    }
}