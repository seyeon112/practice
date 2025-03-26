package day02;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "이름을 입력해주세요",
				firstName = null, lastName = null,
				name = null;
		
		System.out.println(message);
		name = sc.next();
		System.out.println(name + "님 환영합니당");
	}

}
