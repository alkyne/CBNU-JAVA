
public class Ex2 {

	public static void main(String[] args) {
		int coin[] = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money = " + money);
		
		for(int i=0; i<coin.length; i++) {
			if(money>=500) {
				System.out.println("500원 : "+ money/coin[i]);
				money -= 500*(money/coin[i]);
			}
			else if(money>=100){
				System.out.println("100원 : "+ money/coin[i]);
				money -= 100*(money/coin[i]);
			}
			
			else if(money>=50){
				System.out.println("50원 : "+ money/coin[i]);
				money -= 50*(money/coin[i]);
			}
			
			else {
				System.out.println("10원 : "+ money/coin[i]);
				money -= 10*(money/coin[i]);
			}
			
		}
	}
}
