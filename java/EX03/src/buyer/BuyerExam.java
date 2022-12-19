package buyer;

public class BuyerExam {

	public static void main(String[] args) {
		int tvPrice = 100;
		int cPrice = 200;
		int aPrice = 50;
		Buyer buyer1 = new Buyer(1000);
		
		Tv tv = new Tv(tvPrice, "TV");
		Computer com = new Computer(cPrice, "COMPUTER");
		Audio audio = new Audio(aPrice, "AUDIO");
		
		buyer1.buy(tv);
		buyer1.summary();
	}

}
