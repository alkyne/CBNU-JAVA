public class Gugudan {
	public static void main(String args[])	{
		for(int dan=2; dan<10; dan++) {
			System.out.println("[" + dan + "]dan");
			for(int su=1; su<10; su++){
				System.out.print(dan + "*" + su + "=" + (dan*su) + " ");
			}
			System.out.println();
		}
	}
}
