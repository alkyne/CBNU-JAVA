import java.io.BufferedReader;
import java.io.InputStreamReader;

class Employee {
	private String empNo; // �����ȣ
	private String name; // �̸�
	private String part; // �μ�

	// �Ű����� ���� ������
	public Employee() {
	}

	// �����ε�
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

	// ������� ��� ���ڿ��� ����
	public String resultStr() {
		String result = "";

		result += "��� : " + empNo + "\n";
		result += "�̸� : " + name + "\n";
		result += "�μ� : " + part + "\n";

		return result;
	}
}


class Manager extends Employee {
	private String position; // ��å

	// �Ű����� 4�� ������
	public Manager(String empNo, String name, String part, String position) {
		super(empNo, name, part);
		this.position = position;
	}

	public String resultStr() {
		String result = super.resultStr();
		result += "��å : " + position + "\n";
		return result;
	}
}


public class Company {
	public static void main(String args[]) {
		String result = ""; // ��� ���ڿ�
		Employee obj = null;
		String empNo = null; // �����ȣ�� �Է¹޴� ����
		String name = null; // �̸��� �Է¹޴� ����
		String part = null; // �μ��� �Է¹޴� ����
		String position = null; // ��å�� �Է¹޴� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("��� �Է�(��)A1010 : ");
			empNo = in.readLine();
			System.out.print("�̸� �Է�(��)�ڹ��� :");
			name = in.readLine();
			System.out.print("�μ� �Է�(��)��ȹ :");
			part = in.readLine();
			System.out.print("��å �Է�(��)���-1, �븮-2, ����-3 :");
			position = in.readLine();
		} catch (Exception e) {
			System.out.println("�Է� ����");
		}
		// position == 1�̸� ���,�ƴϸ� ������ 
		if (position.equals("1")) { // ���
					// EmployeeŬ������ ��ü obj�� ���� - new
					obj = new Employee(empNo, name, part);
					result += obj.resultStr();
				} else { // ������
					// position == 2�̸� �븮��, �� ���̸� �������� ��ġ
					position = (position.equals("2")) ? "�븮" : "����";
					// ManagerŬ������ ��ü obj�� ���� new
					obj = new Manager(empNo, name, part, position);
					result += obj.resultStr();
				}

				System.out.println(result);
			}
		}
