package section14;

import java.util.Scanner;

public class EX14_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("당신의 나이 입력해쉐요 :");
			int age = scan.nextInt();
			
			if(age < 0) {
				throw new InputErrorException("입력이 잘못됐습니다.");
			}
			
			if(age > 19) {
				System.out.println("성인입니다.");
			} else if(age > 13) {
				System.out.println("청소년입니다.");
			} else if(age > 6){
				System.out.println("어린이입니다.");
			} else {
				System.out.println("아동입니다,");
			}
		} catch(InputErrorException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		} finally {
			if(scan != null) {
				scan.close();
			}
		}
	}

}
