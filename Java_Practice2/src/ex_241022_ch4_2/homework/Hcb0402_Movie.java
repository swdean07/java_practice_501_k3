package ex_241022_ch4_2.homework;

public class Hcb0402_Movie {
	//property
	String name;
	String author;
	int release;
	String [] character;

	//static property
	static String tbd = "tbd";
	static String [] tbdArray = {"tbd"};
	
	//constructor
	public Hcb0402_Movie() {
		this(tbd);
	}
	public Hcb0402_Movie(String name) {
		this.name = name;
		this.author = tbd;
		this.release = 000000;
		this.character = tbdArray;
	}
	public Hcb0402_Movie(String name, String author, int release, String[] character) {
		this.name = name;
		this.author = author;
		this.release = release;
		this.character = character;
	}
	
	//method
	public void introduce() {
		System.out.println("이 영화의 제목은 " + name + "입니다");
		System.out.println("이 영화의 감독은 " + author + "입니다");
		System.out.println("이 영화의 발매일은 " + release + "입니다");
		System.out.println("이 영화의 등장인물은");
		for(String c:character) {
			System.out.println(c);
		}
		System.out.println("입니다");
	}
	//method overload
	public void introduce(String name, String author) {
		System.out.println(name + "은/는 " + author+ " 감독이 메가폰을 잡았습니다");
	}

}
