import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        int[] coins = {1, 3, 4};
        int[] minNumCoins = new int[m+1];
        minNumCoins[0] = 0;
        for (int i = 1; i < minNumCoins.length; i++) {
            minNumCoins[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    int numCoins = minNumCoins[i-coins[j]] + 1;
                    if (numCoins < minNumCoins[i]) {
                        minNumCoins[i] = numCoins;
                    }
                }
            }
        }
        return minNumCoins[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
    }
}