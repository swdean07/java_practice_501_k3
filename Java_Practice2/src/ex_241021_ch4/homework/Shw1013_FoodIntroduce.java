package ex_241021_ch4.homework;

import java.util.Random;

public class Shw1013_FoodIntroduce {

    public static void main(String[] args) {
        // Food 객체 3개 생성
    	String[] Materials1 = {"돼지고기", "밥", "국수"};
    	String[] Materials2 = {"쌀밥", "채소", "고추장"};
    	String[] Materials3 = {"짜장소스", "면", "계란"};
        Shw1013_Food food1 = new Shw1013_Food("돼지국밥", 9000, Materials1);
        Shw1013_Food food2 = new Shw1013_Food("비빔밥", 8000, Materials2);
        Shw1013_Food food3 = new Shw1013_Food("짜장면", 7000, Materials3);

        // Food 객체 3개를 담는 배열
        Shw1013_Food[] foods = {food1, food2, food3};

        // 랜덤으로 하나의 음식 추천
        Shw1013_Food randomFood = getRandomFood(foods);
        System.out.println("오늘의 추천 음식:");
        randomFood.introduce();
    }

    // 랜덤 음식 추천 기능
    public static Shw1013_Food getRandomFood(Shw1013_Food[] foods) {
        Random random = new Random();
        int index = random.nextInt(foods.length);  // 0 ~ foods.length-1 범위에서 랜덤 인덱스 생성
        return foods[index];
    }
}


