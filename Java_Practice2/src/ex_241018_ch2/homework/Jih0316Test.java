package ex_241018_ch2.homework;

import java.util.Scanner;

public class Jih0316Test {

	public static void main(String[] args) {
        System.out.println("로그인 form");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID를 입력해주세요 : ");
        String userId = scanner.next();
        
        System.out.println("Password를 입력해주세요 : ");
        String userPwd = scanner.next();
        
        if (userId =="admin") {
            if(userPwd == "1234")
                System.out.println("환영합니다! 조이한님!");
            else
                System.out.println("비밀번호가 잘못되었습니다!");
        } else if(userPwd == "1234") {
            System.out.println("아이디가 잘못되었습니다.");
        } else {
            System.out.println("아이디와 비밀번호가 잘못되었습니다.");
        }
    }

}
