package ps2;

import java.util.*;

public class mid5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // Số lượng nút
		int X = scanner.nextInt(); // Nút cần tìm cấp độ

		int[] nodeValues = new int[N + 1]; // Mảng giá trị của các nút
		for (int i = 1; i <= N; i++) {
			nodeValues[i] = scanner.nextInt();
		}

		List<List<Integer>> adjList = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			adjList.add(new ArrayList<>());
		}

		for (int i = 0; i < N - 1; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			adjList.get(A).add(B);
			adjList.get(B).add(A);
		}

		// BFS để tìm cấp độ của từng nút
		int[] levels = new int[N + 1];
		Arrays.fill(levels, -1); // Đặt mặc định là chưa thăm

		Queue<Integer> queue = new LinkedList<>();
		queue.add(1); // Bắt đầu từ nút gốc
		levels[1] = 0; // Cấp độ của nút gốc là 0

		while (!queue.isEmpty()) {
			int node = queue.poll();
			for (int neighbor : adjList.get(node)) {
				if (levels[neighbor] == -1) { // Nếu nút này chưa thăm
					levels[neighbor] = levels[node] + 1;
					queue.add(neighbor);
				}
			}
		}

		// Tính tổng các chỉ số của các nút có cùng cấp độ với X
		int targetLevel = levels[X];
		int totalSum = 0;
		for (int i = 1; i <= N; i++) {
			if (levels[i] == targetLevel) {
				totalSum += i;
			}
		}

		// In ra kết quả
		System.out.println(totalSum > 0 ? totalSum : 0);
	}
}
