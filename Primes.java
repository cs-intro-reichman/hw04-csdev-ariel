public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        int primeCounter = 0;
        int i = 2;
        if (i % 2 == 0) {
            i += 1;
            primeCounter += 1;
        }
        if (i % 3 == 0) {
            i += 2;
            primeCounter += 1;
        }
        while (i <= N) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                return false;
            }
            else {
                primeCounter += 1;
            }
            i += 2; }

        
        int percentage = (primeCounter/(N-1));
        System.out.println("There are " + primeCounter + " primes between 2 and " + N + ". (" + percentage + "% are primes)");
    }
}