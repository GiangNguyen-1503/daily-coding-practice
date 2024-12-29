package ps2;

import java.util.Scanner;

public class P11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		for (int i = 0; i < N; i++) //thay vi cNum.lenght thi N dung voi de bai hon!!
			sum += cNum[i] - '0';
		System.out.print(sum);
		
		sc.close();
	}
}
