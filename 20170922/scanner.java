import java.util.*;

class scanner {
	public static void main(String args[]) {
		int jumsu = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("input num : ");
		jumsu = scanner.nextInt();
		System.out.println("jumsu :" + jumsu);
		scanner.close();
	}		
}
