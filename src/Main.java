void main() {
    // --- Test the SLOW one ---
    long startTimeSlow = System.nanoTime();
    System.out.println(STR."Slow fib(45) result: \{fibRecursive(45)}");
    long durationSlow = (System.nanoTime() - startTimeSlow) / 1_000_000;
    System.out.println("Time taken (slow): " + durationSlow + " milliseconds\n");

    // --- Test the FAST one ---
    long startTimeFast = System.nanoTime();
    System.out.println("Fast fib(45) result: " + fibFast(45));
    long durationFast = (System.nanoTime() - startTimeFast) / 1_000_000;
    System.out.println("Time taken (fast): " + durationFast + " milliseconds");

    Message message = new Message();
    message.run();
}

// O(2^n) - The SLOW recursive method
public static long fibRecursive(int n) {
    if (n <= 1) return n;
    return fibRecursive(n - 1) + fibRecursive(n - 2);
}

// O(n) - The FAST iterative (loop) method
public static long fibFast(int n) {
    if (n <= 1) return n;

    long a = 0; // Represents fib(n-2)
    long b = 1; // Represents fib(n-1)

    // Loop from 2 up to n
    for (int i = 2; i <= n; i++) {
        long temp = a + b; // This is the new fib(n)
        a = b;        // The old fib(n-1) becomes the new fib(n-2)
        b = temp;     // The new fib(n) becomes the new fib(n-1)
    }

    return b; // b holds the final result
}
