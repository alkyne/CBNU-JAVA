import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch {
	public static void main(String[] args) {
		int data[] = {11, 16, 21, 26, 35, 39, 47};
		int k=0, cnt = 0;
		int low =0;
		int high = data.length-1;
		int middle = (low+high)/2;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� : ");
		
		try {
			k = Integer.parseInt(in.readLine());
		}
		catch (Exception e){
			System.out.println("�Է� ����");
		}
		
		boolean flag = false;
		while(low<=high) {
			middle = (low+high)/2;
			if(k<data[middle])
				high = middle-1;
			else if (data[middle] < k)
				low = middle + 1;
			else {
				flag = true;
				break;
			}
		}
		
		if(flag)
			System.out.println("ã�ҽ��ϴ�.");
		else
			System.out.println("�� ã�ҽ�");
		
	}
}
