package section15;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

public class EX15_17 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연도를 입력하세여");
		
		int year = scan.nextInt();
		
		System.out.println("월을 입력하세요");
		int month = scan.nextInt();
		
		cal.set(year, month - 1, 1);
	
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		for (int i = 0; i < week; i++) {
			System.out.print("\t");
			
		}
		
		for (int i = 0; i < lastOfDate; i++) {
			System.out.printf("%d\t", i);
			if (week % 7 == 0) {
				System.out.println();
			}
			week++;
		}
		
		scan.close();
	}

}
