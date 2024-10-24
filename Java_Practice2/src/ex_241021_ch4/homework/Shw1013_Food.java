package ex_241021_ch4.homework;

public class Shw1013_Food {
    //  속성 정의
    private String name;
    private int price;
    private String[] material;

    // 생성자 (Constructor)
    public Shw1013_Food(String name, int price, String[] material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

    // 소개하는 기능
    public void introduce() {
        System.out.println("음식 이름: " + name);
        System.out.println("가격: " + price + "원");
        System.out.print("재료: ");
        for (int i = 0; i < material.length; i++) {
            if (i != material.length - 1) {
                System.out.print(material[i] + ", ");
            } else {
                System.out.print(material[i]);
            }
        }
        System.out.println();
        //숙제 제출
    }
}
