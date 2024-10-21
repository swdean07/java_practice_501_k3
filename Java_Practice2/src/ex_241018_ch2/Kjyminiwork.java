package ex_241018_ch2;

import java.util.Scanner;

public class Kjyminiwork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Id를 입력 해주세요: ");
        String userId = scanner.next();
        
        System.out.println("패스워드 입력해주세요 : ");
        String userPw = scanner.next();
        
        // Use .equals() to compare string values
        if(userId.equals("admin")) {
            if(userPw.equals("1234")) {
                System.out.println("환영합니다. 강준영님");
            } else {
                System.out.println("비밀 번호가 다릅니다.");
            }
        } else if(userPw.equals("1234")) {
            System.out.println("아이디가 다릅니다");
        } else {
            System.out.println("아이디 비번이 다릅니다.");
        }
        
        scanner.close(); // Correctly closing the scanner
    }
}
