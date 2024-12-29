package ps2;

import java.util.Scanner;

public class mid3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhập số lượng phần tử trong mảng N và độ dài cửa sổ K
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];

		int currentSum = 0;
		// Nhập các phần tử của mảng
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			currentSum += arr[i];
		}

		// Khởi tạo tổng lớn nhất là tổng của K phần tử đầu tiên
		int maxSum = currentSum;

		// Sử dụng Sliding Window để tính tổng của các dãy tiếp theo
		for (int i = K; i < N; i++) {
			// Di chuyển cửa sổ: trừ phần tử ở đầu và cộng phần tử mới vào cuối
			currentSum = currentSum - arr[i - K] + arr[i];
			// Cập nhật tổng lớn nhất
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
		}

		// In ra tổng lớn nhất
		System.out.println(maxSum);
	}
}
