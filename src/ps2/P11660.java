package ps2;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class P11660 {
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		long[][] S = new long[N-1][N-1];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		for (int i = 1; i<=N; i++)
			for (int j = 1; j<=N; j++)
				S[i][j] = S[i-1][j-1] + Integer.parseInt(stringTokenizer.nextToken());
		
		for (int m = 0; m <= M; m++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			
			
		}
	}
}
