// exercise 5_4
public class Ex1 {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		
		int total = 0;
		float average = 0;
		
		for(int i=0; i<4; i++) 
			for(int j=0; j<5; j++)
				total += arr[i][j];
		
		
		average = total/(5*4);
		
		System.out.println("total = "+total);
		System.out.println("average = "+average);

	}

}
