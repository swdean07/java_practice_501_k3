package ex_241021_ch4.homework;

import java.util.Random;

class Food {
    // 속성
    private String name;
    private int price;
    private String[] material;

    // 생성자
    public Food(String name, int price, String[] material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

    // 소개하는 기능
    public void introduce() {
        System.out.println("음식 이름은: " + name);
        System.out.print("음식의 재료들은: ");
        for (int i = 0; i < material.length; i++) {
            System.out.print(material[i]);
            if (i < material.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" 사용합니다.");
        System.out.println("가격은: " + price + "원");
    }

    // getter (이름과 가격만 필요)
    public String getName() {
        return name;
    }
}

public class Hsw1009_Food {
    public static void main(String[] args) {
        // Food 객체 생성
        Food[] foods = new Food[3];
        foods[0] = new Food("돼지국밥", 9000, new String[]{"돼지고기", "밥", "국수", "육수"});
        foods[1] = new Food("비빔밥", 8000, new String[]{"밥", "고추장", "야채", "계란"});
        foods[2] = new Food("김치찌개", 7000, new String[]{"김치", "돼지고기", "두부", "양파"});

        // 랜덤 추천 기능
        Random random = new Random();
        int randomIndex = random.nextInt(foods.length);

        // 추천 음식 소개
        System.out.println("추천 음식:");
        foods[randomIndex].introduce();
    }
}
