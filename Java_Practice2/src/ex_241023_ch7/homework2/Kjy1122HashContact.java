package ex_241023_ch7.homework2;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Kjy1122HashContact {
    // HashMap<String, Kjy1122HashMap>으로 선언
    HashMap<String, Kjy1122HashMap> contacts = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Kjy1122HashContact contactManager = new Kjy1122HashContact();
        contactManager.run(); // 메인 로직 실행
    }

    public void run() {
        while (true) {
            System.out.println("=======================================");
            System.out.println("연락처 프로그램");
            System.out.println("1. 입력");
            System.out.println("2. 출력");
            System.out.println("3. 검색");
            System.out.println("4. 삭제");
            System.out.println("5. 랜덤");
            System.out.println("6. 종료");
            System.out.println("=======================================");

            System.out.print("선택할 번호를 입력하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    addContact(); // 연락처 입력
                    break;
                case 2:
                    displayContacts(); // 연락처 출력
                    break;
                case 3:
                    searchContact(); // 연락처 검색
                    break;
                case 4:
                    deleteContact(); // 연락처 삭제
                    break;
                case 5:
                    displayRandomContact(); // 랜덤 연락처 출력
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return; // while 문 종료
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }

    // 1. 연락처 입력
    private void addContact() {
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("연락처를 입력하세요: ");
        String contact = scanner.nextLine();

        // Kjy1122HashMap 객체를 생성해 HashMap에 저장
        contacts.put(name, new Kjy1122HashMap(name, contact));
        System.out.println("연락처가 등록되었습니다.");
    }

    // 2. 연락처 출력
    private void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("등록된 연락처가 없습니다.");
        } else {
            for (Kjy1122HashMap person : contacts.values()) {
                person.printInfo(); // Kjy1122HashMap의 printInfo() 메서드 호출
                System.out.println("---------------------------------");
            }
        }
    }

    // 3. 연락처 검색
    private void searchContact() {
        System.out.print("검색할 이름을 입력하세요: ");
        String searchName = scanner.nextLine();

        Kjy1122HashMap person = contacts.get(searchName);
        if (person != null) {
            person.printInfo(); // Kjy1122HashMap 객체의 printInfo() 호출
        } else {
            System.out.println("해당 이름의 연락처가 없습니다.");
        }
    }

    // 4. 연락처 삭제
    private void deleteContact() {
        System.out.print("삭제할 이름을 입력하세요: ");
        String deleteName = scanner.nextLine();

        Kjy1122HashMap removedPerson = contacts.remove(deleteName);
        if (removedPerson != null) {
            System.out.println(deleteName + "님의 연락처가 삭제되었습니다.");
        } else {
            System.out.println("해당 이름의 연락처가 없습니다.");
        }
    }

    // 5. 랜덤 연락처 출력
    private void displayRandomContact() {
        if (contacts.isEmpty()) {
            System.out.println("등록된 연락처가 없습니다.");
        } else {
            Random random = new Random();
            Object[] names = contacts.keySet().toArray(); // 이름들을 배열로 변환
            String randomName = (String) names[random.nextInt(names.length)];
            Kjy1122HashMap randomPerson = contacts.get(randomName);
            System.out.println("랜덤으로 선택된 연락처:");
            randomPerson.printInfo(); // Kjy1122HashMap 객체의 printInfo() 호출
        }
    }
}

