import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long[] len = new long[n - 1];
		long[] price = new long[n];

		for (int i = 0; i < n - 1; i++) {
			len[i] = sc.nextLong();
		}

		for (int i = 0; i < n; i++) {
			price[i] = sc.nextLong();
		}

		long sum = 0;
		long min = price[0]; // 이전 까지의 과정 중 주유 최소 비용

		for (int i = 0; i < n - 1; i++) {
			// 현재 주유소가 이전 주유소의 기름값보다 쌀 경우 minCost를 갱신해준다.
			if (price[i] < min) {
				min = price[i];
			}

			sum += (min * len[i]);
		}

		System.out.println(sum);

	}
}