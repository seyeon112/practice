package day05;

public class MethodTask2 {
//  (a)
//	이름을 출력해주는 메소드
	void namePrint(String name) {
		System.out.println(name);
	}
	
//	1부터 10까지 짝수만 출력해주는 메소드
	void printEven() {
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			} else {
				continue;
			}
		}
	}
	
//	10을 5번 출력해주는 메소드
	void printTen5() {
		for (int i = 0; i < 5; i++) {
			System.out.println(10);
		}
	}
	
//	나이에 10을 더해주는 메소드
	int agePlus10(int age) {
		return age + 10;
	}

//	두 정수를 곱해주는 메소드
	int multiplyTwo(int num1, int num2) {
		return num1 * num2;
	}
	
//	세 정수를 더해주는 메소드
	int plusThree(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
//	(b)
//	홍길동을 n번 출력하는 메서드
	void printHong(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("홍길동");
		}
	}
	
//	두 정수의 나눗셈 후 몫과 나머지 두개를 구하는 메소드
	int[] divideTwo(int num1, int num2) {
		int[] arData = new int[2];
		arData[0] = num1 / num2;
		arData[1] = num1 % num2;
		return arData;
	}
	
//	1~n까지의 합을 구해주는 메소드
	int allPlus(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += i + 1;
		}
		return sum;
	}




}
