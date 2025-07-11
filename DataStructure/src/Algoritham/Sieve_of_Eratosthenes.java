package Algoritham;

import java.util.Arrays;

public class Sieve_of_Eratosthenes {
	public Sieve_of_Eratosthenes()
	{
		int n = 10;
        System.out.println("Prime numbers up to " + n + ":");
        printPrimes(n);
	}
	public static void printPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {//j=2*2   ; j=j+i  //4+2,6+2,8+2
                    isPrime[j] = false;
                }
            }
        }

        // প্রিন্ট করো প্রাইমগুলো
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
