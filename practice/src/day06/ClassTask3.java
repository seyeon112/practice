package day06;

class Market {
	String productName;
	int productPrice;
	int productStock;
	
//	기본 생성자 
	public Market() {;}

//	초기화 생성자
	public Market(String productName, int productPrice, int productStock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
	
//	판매 메서드 구현
	void sell(Customer customer) {
		customer.money -= productPrice - productPrice * (customer.discount / 100.0);
		productStock--;
	}

	
	
	
}

class Customer {
	String name;
	String phone;
	int money;
	int discount;

	//  기본 생성자
		public Customer() {;}
//		초기화 생성자
	public Customer(String name, String phone, int money, int discount) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.discount = discount;
	}
		

		
		
}


	
public class ClassTask3 {

	public static void main(String[] args) {
//	마켓 구현 emart("감자", 7000, 300);
		Market emart = new Market("감자", 7000, 300);
		Customer yea = new Customer("칸예", "01020394857", 10000, 30);
//		구매자 칸예 ("칸예", "01020394857", 10000, 30);
		emart.sell(yea);
		System.out.println(emart.productStock);
		System.out.println(yea.money);
	}

}
