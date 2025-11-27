public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        int primeCounter = 0;
        int i = 2;
        if (i % 2 == 0) {
            System.out.println(i);
            i += 1;
            primeCounter += 1;
        }
        if (i % 3 == 0) {
            System.out.println(i);
            i += 2;
            primeCounter += 1;
        }
        if (i % 5 == 0) {
            System.out.println(i);
            i += 2;
            primeCounter += 1;
        }
        while (i <= N) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
            }
            else {
                System.out.println(i);
                primeCounter += 1;
            }
            i += 2; }

        double total_num = N;
        double percentage = Math.ceil((primeCounter/(total_num)*100) -1);
        System.out.println("There are " + primeCounter + " primes between 2 and " + N + " (" + percentage + "% are primes)");
    }
}