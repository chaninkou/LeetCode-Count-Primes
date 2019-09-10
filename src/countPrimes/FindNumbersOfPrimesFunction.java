package countPrimes;

public class FindNumbersOfPrimesFunction {
    // Using sieve of eratosthenes algorithm
    public int countPrimes(int n) {
        // All the element will be false as default
        boolean[] notPrime = new boolean[n];
        
        int count = 0;
        
        for(int i = 2; i < n; i++){
            // Every element will be prime at first
            if(notPrime[i] == false){
                // Add count since it is a prime
                count++;
                // i * j since it is not prime
                for(int j = 2; i * j < n; j++){
                    // 2 * 2, 2 * 3, 2 * 4 ....
                    notPrime[i * j] = true;
                }
            }
        }
        
        return count;
    }
}
