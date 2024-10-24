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