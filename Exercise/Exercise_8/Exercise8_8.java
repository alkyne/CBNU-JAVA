import java.util.*;

public class Exercise8_8 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		do {

			count++;
			System.out.print("1�� 100������ ���� �Է��Ͻÿ� :");
			try {
				input = new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("�ùٸ��� ���� ���Դϴ�. ���� �ٽ� �Է��Ͻÿ�");
				continue;
			}
			if (answer > input) {
				System.out.println("�� ū ���� �Է��Ͻÿ�.");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��Ͻÿ�.");
			} else {
				System.out.println("������ϴ�..");
				System.out.println("�õ�Ƚ���� " + count + "�� �Դϴ�.");
				break;

			}
		} while (true);
	}
}
