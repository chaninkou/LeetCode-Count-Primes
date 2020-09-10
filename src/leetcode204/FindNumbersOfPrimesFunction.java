package leetcode204;

public class FindNumbersOfPrimesFunction {
    // Using sieve of eratosthenes algorithm
    public int countPrimes(int n) {
        // Every number is a prime at first, false means prime number
    	boolean[] notPrime = new boolean[n];
    	
    	// Number of prime numbers
    	int count = 0;
    	
    	// Starting from 2 because the first number of prime is 2
    	// Til n cause we are counting number of prime under n
    	for(int i = 2; i < n; i++){
    		// If it is a prime number, increase the count
    		if(notPrime[i] == false){
    			// Increase the count every time if its a prime number
    			count++;
    			
    			// Marking whichever one that is not a prime, by multiply from 2 and above
    			// i * j < n cause the boolean is only n size
    			for(int j = 2; i * j < n; j++)
    			{
    				// Sometimes we might make something that is already true to true, but no harm
    				notPrime[i * j] = true;
    			}
    		}
    	}
        
        return count;
    }
   
}
