package ex_241021_ch4.homework;

import java.util.Random;

class Menu {
    
    String name;
    int price;
    String[] material;

    
    public Menu (String name, int price, String[] material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

   
    
    
    
    public void introduce() {
        System.out.println("음식은 : " + name); 
        System.out.print("음식의 재료는 ");
        for (int i = 0; i < material.length; i++) {
            System.out.print(material[i]);
            if (i < material.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" (을)를 사용합니다.");
        System.out.println("가격은 : " + price + "원");
    }
}

public class Kdh1018Menu {
    public static void main(String[] args) {
        
        Menu[] foods = new Menu[3];

       
        foods[0] = new Menu("봉골레 파스타", 7900, new String[]{"파스타면", "모시조개(봉골레)", "소금","올리브오일"});
        foods[1] = new Menu("스시", 28000, new String[]{"밥", "단촛물", "생선"});
        foods[2] = new Menu("스테이크", 45000, new String[]{"고기", "소금", "후추"});

        
        Random random = new Random();
        int randomIndex = random.nextInt(foods.length);
        
       
        System.out.println("추천하는 점심메뉴는:");
        foods[randomIndex].introduce();
    }
}