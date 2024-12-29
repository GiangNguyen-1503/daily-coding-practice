package ps2;

import java.util.Scanner;

public class mid4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhập số lượng công việc
		int N = sc.nextInt();
		int[] times = new int[N];

		// Nhập thời gian của từng công việc
		for (int i = 0; i < N; i++) {
			times[i] = sc.nextInt();
		}

		// Tìm thời gian ngắn nhất và vị trí đầu tiên
		int minTime = times[0];
		int minIndex = 0;
		boolean allSame = true; // Để kiểm tra xem tất cả các thời gian có giống nhau không

		for (int i = 1; i < N; i++) {
			if (times[i] < minTime) {
				minTime = times[i];
				minIndex = i;
				allSame = false;
			} else if (times[i] > times[0]) {
				allSame = false;
			}
		}

		// Nếu tất cả thời gian giống nhau, in -1
		if (allSame) {
			System.out.println("-1");
		} else {
			// In chỉ số của công việc có thời gian ngắn nhất
			System.out.println(minIndex);
		}
	}
}


