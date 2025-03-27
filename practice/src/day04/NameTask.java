package day04;

import java.util.Iterator;
import java.util.Scanner;

public class NameTask {
	public static void main(String[] args) {
		String message = "숫자를 입력해주세요 : ";
		String hanguel = "공일이삼사오육칠팔구";
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String result = "";
		
		for (int i = 0; i < num.length(); i++) {
			result += hanguel.charAt(num.charAt(i) - 48);
		}
		
		System.out.println(result);
	}

}
