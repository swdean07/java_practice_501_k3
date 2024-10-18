package ex_241018_ch2.homework;

import java.util.Scanner;

public class Psj0925Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String id = "admin";
        String pass = "1234";
        
        System.out.print("아이디를 입력하세요: ");
        String userId = scanner.next();
        System.out.print("비밀번호를 입력하세요: ");
        String userPass = scanner.next();
        
        // Use .equals() to compare string content
        if (id.equals(userId)) {
            // System.out.println("아이디가 맞습니다.");
            if (pass.equals(userPass)) {
                System.out.println("환영합니다. 이상용님.");
            } else {
                System.out.println("다시 로그인 해주세요.");
            }
        } else {
            System.out.println("아이디가 틀렸습니다.");
        }
        
        scanner.close();
    }
}
