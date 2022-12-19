package human11;

public class Buyer {
	public int money;
	public Product[] cart = new Product[10];
	public int index;
	
	public Buyer(int money) {
		this.money = money;
		this.index = 0;
	}
	public void buy(Product product) {
		// Product product = tv(자동타입변환)
		// Product product = audio(자동타입변환)
		// Product product = computer(자동타입변환)
		if(this.money - product.price < 0) {
			System.out.println("잔고가 부족해서 추가 구매가 어렵습니다.");
			System.out.printf("현재 잔액 : %d / 제품(%s): %d\n", this.money, product.name, product.price);
			return;
		}
		else {
			this.money = this.money - product.price;
			add(product);
		}
	}
	public void add(Product product) {
		this.cart[this.index] = product;
		System.out.printf("cart[%d] : %s(%d)\n", this.index, product.name, product.price);
		this.index = this.index+1;
	}
	public void summary() {
		String itemList = "";
		int sum = 0;
		for(int i = 0; i<cart.length; i++) {
			if(this.cart[i] == null) {
				break;
			}
			itemList = itemList + this.cart[i].name+ ", ";
			// this.cart[i]는 product 객체
			sum = sum +this.cart[i].price;
//			TV, AUDIO, COMPUTER
		}
		System.out.printf("구입한 물건 : %s\n", itemList);
		System.out.printf("총 사용금액 : %d\n", sum);
		System.out.printf("현재 잔고 : %d\n", this.money);
				
	}
	

}
