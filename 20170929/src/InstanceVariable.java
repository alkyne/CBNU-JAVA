class Student {
	int m_nKor;
	int m_nEng;
	int m_nMath;
	
	static String g_strTeacher = "�輱��";
}

public class InstanceVariable {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.m_nKor = 10;
		obj.m_nEng = 20;
		obj.m_nMath = 30;

		
		System.out.println("���� ���� : "+obj.m_nEng);
		System.out.println("������ �̸� : "+obj.g_strTeacher);
		Student.g_strTeacher = "���̾� !";
		System.out.println("������ �̸� : "+obj.g_strTeacher);
		
	}
}
