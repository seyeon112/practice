package day04;

import java.util.Scanner;

public class ArrTask3 {
	public static void main(String[] args) {
//		사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//		대문자는 모두 소문자로 변경한다.
		
//		입력) 안녕hI!!
//		출력) 안녕Hi!!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해줘! : ");
		String input = sc.next();
		String result = "";
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c >= 65 && c <= 90) {
				result += (char)(c + 32);
			} else if(c >= 97 && c <= 122){
				result += (char)(c - 32);
			}else {
				result += c;
			}
		}
		System.out.println(result);
		
		int a = 0;
	}

}
