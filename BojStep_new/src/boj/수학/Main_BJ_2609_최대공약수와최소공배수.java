package boj.수학;

import java.util.Scanner;

public class Main_BJ_2609_최대공약수와최소공배수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int ans1 = gcd(n1,n2);
		int ans2 = lcm(n1,n2);
		
		System.out.println(ans1);
		System.out.println(ans2);
	}

	private static int lcm(int n1, int n2) {
		
		return (n1*n2)/gcd(n1,n2);
	}

	private static int gcd(int n1, int n2) {
		while(n2>0) {
			int tmp = n1%n2;
			n1 = n2;
			n2 = tmp;
		}
		return n1;
	}

}
