package acess1;

class Person {
	Phone p;
	
	Person (Phone p) {
		this.p = p;
	}
	
	void buyNewPhone(Phone p) {
		this.p = p;
		System.out.println("========");
		System.out.println("새 폰을 샀다");
	}
	
	void turnOnPhone() {
		p.powerOn();
	}
	
	void turnOffPhone() {
		p.powerOff();
	}
	
	void watchUtube () {
		if (p.isOn()) {
			p.watchUtube();
		} else {
			System.out.println("유튜브 못봐");
		}
		
	}
	
	void chargePhone() {
		p.charge();
	}
}
