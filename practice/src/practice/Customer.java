package practice;

public class Customer extends Person{
	int memberId;
	
	Customer(String name, int age, int memberId) {
		super(name, age);
		
		this.memberId = memberId;
	}
	
	void enter() {
		System.out.println("회원번호 : " + memberId
				+ " (" + name + ", " + age + "세) 님 입장하셨습니다.");
	}

}
