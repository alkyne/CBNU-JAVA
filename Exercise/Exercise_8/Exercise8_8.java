import java.util.*;

public class Exercise8_8 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		do {

			count++;
			System.out.print("1과 100사이의 값을 입력하시오 :");
			try {
				input = new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("올바르지 못한 값입니다. 값을 다시 입력하시오");
				continue;
			}
			if (answer > input) {
				System.out.println("더 큰 수를 입력하시오.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하시오.");
			} else {
				System.out.println("맞췄습니다..");
				System.out.println("시도횟수는 " + count + "번 입니다.");
				break;

			}
		} while (true);
	}
}
