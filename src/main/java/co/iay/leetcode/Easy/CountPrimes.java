package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/7/31.
 */
public class CountPrimes {
    private boolean[] isPrime = null;

    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        int prevIsPrimeLength = 0;

        if (isPrime == null || n > isPrime.length) {
            if (isPrime != null) {
                prevIsPrimeLength = isPrime.length;
            }

            isPrime = new boolean[n];

            for (int i = 2; i < n; ++i) { // less than n so i < n
                isPrime[i] = true;
            }
        }

        for (int i = 2; i < n && n > prevIsPrimeLength; ++i) {
            if (isPrime[i]) {
                for (int j = i * 2; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int result = 0;

        for (int i = 2; i < n && n > prevIsPrimeLength; ++i) {
            if (isPrime[i]) {
                ++result;
            }
        }

        return result;
    }
}
