package Doit;
import java.util.*;

public class P11720_숫자의합 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String sNum = input.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		for (int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		System.out.println(sum);
		input.close();
	}
}
