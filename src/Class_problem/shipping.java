package Class_problem;
import java.util.*;
public class shipping {

	public static int shipWithinDays(int[] weights, int D) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();

        while (left < right) {
            int mid = left + (right - left) / 2;
            int daysRequired = calculateDays(weights, mid);

            if (daysRequired > D) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    // Helper function to calculate the number of days required to ship all parcels with given capacity
    private static int calculateDays(int[] weights, int capacity) {
        int days = 1;
        int currentWeight = 0;

        for (int weight : weights) {
            currentWeight += weight;

            if (currentWeight > capacity) {
                days++;
                currentWeight = weight;
            }
        }

        return days;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter t");
        int T = scanner.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); 
            int D = scanner.nextInt(); 
            int[] weights = new int[N];

            for (int i = 0; i < N; i++) {
                weights[i] = scanner.nextInt(); 
            }

            int capacity = shipWithinDays(weights, D);
            System.out.println(capacity);
        }
    }

}
