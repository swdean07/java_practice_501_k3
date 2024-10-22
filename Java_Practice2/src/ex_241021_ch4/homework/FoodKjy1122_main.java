package ex_241021_ch4.homework;


import java.util.Random; // Random 클래스 임포트

public class FoodKjy1122_main {
    public static void main(String[] args) {
        String[] food1Materials = {"돼지고기", "밥", "국수"};
        String[] food2Materials = {"닭고기", "양파", "당근"};
        String[] food3Materials = {"밀가루", "계란", "파"};

        // Kjy1122_Food 클래스를 사용해야 합니다.
        FoodKjy1122 food1 = new FoodKjy1122("돼지국밥", 9000, food1Materials);
        FoodKjy1122 food2 = new FoodKjy1122("닭볶음탕", 12000, food2Materials);
        FoodKjy1122 food3 = new FoodKjy1122("칼국수", 8000, food3Materials);

        FoodKjy1122[] foods = {food1, food2, food3};

        System.out.println("==== 음식 소개 ====");
        for (FoodKjy1122 food : foods) {
            food.introduce();
            System.out.println();
        }

        // 랜덤으로 하나의 음식을 추천
        Random random = new Random();
        int randomIndex = random.nextInt(foods.length);
        System.out.println("==== 추천 음식 ====");
        foods[randomIndex].introduce();
    }
}

