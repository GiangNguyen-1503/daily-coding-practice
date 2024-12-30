package Doit;
import java.util.*;

public class P1546_평균 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int A[] = new int[N];
		int sum = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			A[i] = input.nextInt();
			sum += A[i];
			max = max > A[i] ? max : A[i];
		}
		System.out.print(sum*100.0/N/max);
		input.close();
	}
}
