
public class ExceptionProb {

	public static void main(String[] args) {
		int arr[] = {1,23,4,1,5,6};
		
		
		try {
			for(int i=0; i<=arr.length; i++)
				System.out.println("arr[i] == " + arr[i]);
		}
		
		catch (Exception e) {
			System.out.println("���� �߻� !");
		}
		
		finally {
			System.out.println("���� �߻� ���ο� �������~");
		}
	}
}
