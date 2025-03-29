package day06;

class SuperCarB {
//  브랜드
  String brand;
//  색상
  String color;
//  가격
  long price;
//  엔진
  boolean engine;
//  비밀번호
  String password;
//  비밀번호 오류회수
  int errorCount;

//초기화 블록
{
 this.password="0000";
}

	static {
		System.out.println("출고 축하합니다!");
	}
	
	public SuperCarB() {;}
	
	public SuperCarB(String brand, String color, long price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public SuperCarB(String brand, String color, long price, String password) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}
	
//	 1) 시동켜기
//  "ABC".equals("ABC");
//  사용자가 입력한 비밀번호가 맞을 때에만 시동켜기
//  연속 3회이상 실패하면 경찰 출동
 
// 비밀번호 검사하는 메서드 만들기
	
	SuperCarB check(String password) {
		SuperCarB sc = new SuperCarB();
		sc.errorCount = 3; 
		
		for (int i = 0; i < sc.errorCount; i++) {
			if (sc.password.equals(sc.password)) {
				System.out.println("시동이 켜졌어요");
			} else {
				System.out.println("3회 이상 오류로 경찰이 출동했습니다.");

			}
		}
		return sc;
	}
	
	//2) 시동끄기
	SuperCarB off(boolean engine) {
		SuperCarB sc = new SuperCarB();
		sc.engine = true;
			System.out.println("엔진을 끕니다.");
			engine = false;
		return sc;
	}
	
	//3) 비밀번호검사
	SuperCarB passwordCheck(String password) {
		SuperCarB sc = new SuperCarB();
		if (this.password.equals(password)) {
			System.out.println("비번이 동일해요.");
		} else {
			System.out.println("비번이 틀렸어요.");
		}
		return sc;
	}
	
	

}


public class B {
	
	public static void main(String[] args) {
	//  프로그램 구현
		SuperCarB sc = new SuperCarB("람보르기니","red",1000, "9999");
		 sc.check("9999");	
		 
		 sc.off(true);
		 
		 sc.passwordCheck("9999");
	}


}
	


