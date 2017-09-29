class Student {
	int m_nKor;
	int m_nEng;
	int m_nMath;
	
	static String g_strTeacher = "김선생";
}

public class InstanceVariable {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.m_nKor = 10;
		obj.m_nEng = 20;
		obj.m_nMath = 30;

		
		System.out.println("영어 점수 : "+obj.m_nEng);
		System.out.println("선생님 이름 : "+obj.g_strTeacher);
		Student.g_strTeacher = "뻥이야 !";
		System.out.println("선생님 이름 : "+obj.g_strTeacher);
		
	}
}
