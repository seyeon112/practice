package practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
