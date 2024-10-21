package ex_241021_ch4.homework;

public class soojong_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] menu1Material1 = {"돼지","국","밥"};
		soojong_menuClass menu1 = new soojong_menuClass("돼지국밥", 9000, menu1Material1);
		menu1.introduce();
		
		String [] menu1Material2 = {"순대","국","밥"};
		soojong_menuClass menu2 = new soojong_menuClass("순대국밥", 9000, menu1Material2);
		menu2.introduce();
		
		String [] menu1Material3 = {"따로","국","밥"};	
		soojong_menuClass menu3 = new soojong_menuClass("따로국밥", 9000, menu1Material3);
		menu3.introduce();
		
		System.out.println("랜덤");

		
	}

}
