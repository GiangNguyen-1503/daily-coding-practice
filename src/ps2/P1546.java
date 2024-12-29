package ps2;

import java.util.Scanner;

public class P1546 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) 
			A[i] = input.nextInt();
		long sum = 0;
		long max = 0;
		for (int i = 0; i < N; i++) {
			//if (A[i] > max) max = A[i];
			max = max < A[i] ? A[i] : max;
			sum += A[i];
		}
		
		System.out.println(sum*100/max/N);
	}
}
