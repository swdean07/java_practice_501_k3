package ex_241021_ch4.homework;

import java.util.Arrays;

public class jih0316_Food {
    String name;
    int price;
    String[] materials;

    public jih0316_Food(String name, int price, String[] materials) {
        this.name = name;
        this.price = price;
        this.materials = materials;
    }

    void materialsFoods() {
        System.out.println("재료 목록:");
        for (String material : materials) {
            System.out.println(material);  // 각 재료 출력
        }
    }

    void introduce() {
        System.out.println("음식의 이름은: " + name + ", 가격은: " + price + ", 재료는 " + Arrays.toString(materials));
    }
}