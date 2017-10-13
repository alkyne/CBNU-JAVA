import java.io.BufferedReader;
import java.io.InputStreamReader;

class Employee {
	private String empNo; // 사원번호
	private String name; // 이름
	private String part; // 부서

	// 매개변수 없는 생성자
	public Employee() {
	}

	// 오버로딩
	public Employee(String empNo, String name, String part) {
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}

	public String getEmpNo() {
		return empNo;
	};

	public String getName() {
		return name;
	};

	
	public String getPart() {
		return part;
	};
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	};
	public void setName(String name) {
		this.name = name;
	};
	public void setPart(String part) {
		this.part = part;
	};

	// 멤버값을 결과 문자열로 결합
	public String resultStr() {
		String result = "";

		result += "사번 : " + empNo + "\n";
		result += "이름 : " + name + "\n";
		result += "부서 : " + part + "\n";

		return result;
	}
}


class Manager extends Employee {
	private String position; // 직책

	// 매개변수 4개 생성자
	public Manager(String empNo, String name, String part, String position) {
		super(empNo, name, part);
		this.position = position;
	}

	public String resultStr() {
		String result = super.resultStr();
		result += "직책 : " + position + "\n";
		return result;
	}
}


public class Company {
	public static void main(String args[]) {
		String result = ""; // 결과 문자열
		Employee obj = null;
		String empNo = null; // 사원번호를 입력받는 변수
		String name = null; // 이름을 입력받는 변수
		String part = null; // 부서를 입력받는 변수
		String position = null; // 직책을 입력받는 변수
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("사번 입력(예)A1010 : ");
			empNo = in.readLine();
			System.out.print("이름 입력(예)박문석 :");
			name = in.readLine();
			System.out.print("부서 입력(예)기획 :");
			part = in.readLine();
			System.out.print("직책 입력(예)사원-1, 대리-2, 과장-3 :");
			position = in.readLine();
		} catch (Exception e) {
			System.out.println("입력 오류");
		}
		// position == 1이면 사원,아니면 관리자 
		if (position.equals("1")) { // 사원
					// Employee클래스의 객체 obj를 생성 - new
					obj = new Employee(empNo, name, part);
					result += obj.resultStr();
				} else { // 관리자
					// position == 2이면 대리로, 그 외이면 과장으로 대치
					position = (position.equals("2")) ? "대리" : "과장";
					// Manager클래스의 객체 obj를 생성 new
					obj = new Manager(empNo, name, part, position);
					result += obj.resultStr();
				}

				System.out.println(result);
			}
		}
