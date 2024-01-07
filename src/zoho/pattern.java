package zoho;
import java.util.*;
import java.io.*;
public class pattern {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long result = minCostToConnectGraph(N);
        System.out.println(result);

        scanner.close();
    }

    static long minCostToConnectGraph(int N) {
        long totalCost = 0;

        for (int i = 2; i <= N; i++) {
            totalCost += lcm(1L, i);
            totalCost %= 1_000_000_007; // To avoid overflow
        }

        return totalCost;
    }

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}