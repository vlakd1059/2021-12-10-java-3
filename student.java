
public class student {
	String name; // 이름
	String number; // 학번
	int age; // 나이
	int scorejava; // 자바점수
	int scoreweb; // 웹점수
	int scoreandroid; // 안드로이드점수
	
	//생성부
	public student(String name, String number, int age, int scorejava, int scoreweb, int scoreandroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scorejava = scorejava;
		this.scoreweb = scoreweb;
		this.scoreandroid = scoreandroid;
	}
	
	// 출력부
	public void show() {
		System.out.println(name + "님 안녕하세요");
		System.out.println("[" + number + ", " + age + "살" + "]");
		System.out.println(name + "님의" + "Java점수는 " + scorejava + "점 입니다.");
		System.out.println(name + "님의" + "Web점수는 " + scoreweb + "점 입니다.");
		System.out.println(name + "님의" + "Android점수는 " + scoreandroid + "점 입니다.");
		System.out.println("===========================================================");
	}

}
