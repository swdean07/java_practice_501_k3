package ex_241021_ch4.homework;

import java.util.Random;

public class Asy0705_Foodrandom {
    // 속성 정의
    String name;          // 음식 이름
    int price;            // 음식 가격
    String[] material;    // 음식 재료들

    // 생성자: Asy0705_Food 객체 생성 시 속성을 초기화
    public Asy0705_Foodrandom(String name, int price, String[] material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

    // 음식 소개하는 메서드
    public void introduce() {
        // 음식 이름 출력
        System.out.println("음식 이름은: " + name);

        // 음식 재료 출력
        System.out.print("음식의 재료들은: ");
        for (int i = 0; i < material.length; i++) {
            System.out.print(material[i]);
            if (i < material.length - 1) {
                System.out.print(", ");  // 재료 사이에 쉼표 추가
            }
        }
        System.out.println(" 등 사용합니다.");

        // 음식 가격 출력
        System.out.println("가격은: " + price + "원");
    }

    // 랜덤하게 음식 추천하는 메서드
    public static Asy0705_Foodrandom recommendRandomFood(Asy0705_Foodrandom[] foods) {
        Random random = new Random();  // 랜덤 객체 생성
        int randomIndex = random.nextInt(foods.length);  // 0부터 배열 길이-1까지의 무작위 인덱스 생성
        return foods[randomIndex];  // 해당 인덱스에 있는 Food 객체 반환
    }

    // main 메서드에서 테스트
    public static void main(String[] args) {
        // 3개의 Food 객체 생성
        String[] materials1 = {"돼지고기", "밥", "국수"};
        Asy0705_Foodrandom food1 = new Asy0705_Foodrandom("돼지국밥", 9000, materials1);

        String[] materials2 = {"닭고기", "감자", "대파"};
        Asy0705_Foodrandom food2 = new Asy0705_Foodrandom("닭볶음탕", 15000, materials2);

        String[] materials3 = {"소고기", "양파", "마늘"};
        Asy0705_Foodrandom food3 = new Asy0705_Foodrandom("불고기", 18000, materials3);

        // Food 객체를 배열에 담기
        Asy0705_Foodrandom[] foodArray = {food1, food2, food3};

        // 랜덤으로 하나 추천받기
        Asy0705_Foodrandom recommendedFood = recommendRandomFood(foodArray);

        // 추천받은 음식 소개
        System.out.println("오늘의 추천 음식입니다!");
        recommendedFood.introduce();
    }
}
