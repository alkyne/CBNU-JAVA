
public class Ex6_2 {
	
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
	
	
}


class SutdaCard {
	
	int num;
	boolean isKwang;
	
	public SutdaCard(int n, boolean k) {
		this.num = n;
		this.isKwang = k;
	}
	
	public SutdaCard() {
		this.num = 1;
		this.isKwang = true;
	}
	
	String info() {
		if(isKwang == true)
			return num + "K";
		else
			return num + "";
	}
}
