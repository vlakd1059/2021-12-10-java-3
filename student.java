
public class student {
	String name; // �̸�
	String number; // �й�
	int age; // ����
	int scorejava; // �ڹ�����
	int scoreweb; // ������
	int scoreandroid; // �ȵ���̵�����
	
	//������
	public student(String name, String number, int age, int scorejava, int scoreweb, int scoreandroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scorejava = scorejava;
		this.scoreweb = scoreweb;
		this.scoreandroid = scoreandroid;
	}
	
	// ��º�
	public void show() {
		System.out.println(name + "�� �ȳ��ϼ���");
		System.out.println("[" + number + ", " + age + "��" + "]");
		System.out.println(name + "����" + "Java������ " + scorejava + "�� �Դϴ�.");
		System.out.println(name + "����" + "Web������ " + scoreweb + "�� �Դϴ�.");
		System.out.println(name + "����" + "Android������ " + scoreandroid + "�� �Դϴ�.");
		System.out.println("===========================================================");
	}

}
