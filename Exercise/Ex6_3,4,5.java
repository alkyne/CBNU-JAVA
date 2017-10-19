
class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student() {

	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
	}

	public String info() {
		String a =  name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + " " + getTotal() + " "
				+ getAverage();
		return a;
	}

}

public class ex6_3_4_5 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "全辨悼";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("捞抚:" + s.name);
		System.out.println("醚痢:" + s.getTotal());
		System.out.println("乞闭:" + s.getAverage());

		Student v = new Student("全辨悼", 1, 1, 100, 60, 76);

		System.out.println(v.info());
	}
}
