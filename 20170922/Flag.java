public class Flag {
	public static void main(String args[]) {
		int hol = 0, jjak = 0;
		boolean flag = false;
		for (int i = 1; i <= 10; i++) {
			if (flag == false) {
				hol = hol + i;
				flag = true;
			} else {
				jjak = jjak + i;
				flag = false;
			}
		}
		System.out.println("sum of odd : " + hol);
		System.out.println("sum of even : " + jjak);
	}
}
