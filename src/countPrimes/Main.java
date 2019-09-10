package countPrimes;

public class Main {
	public static void main(String[] args) {
		int n = 10;
		
		System.out.println("Input: " + n);
		
		FindNumbersOfPrimesFunction solution = new FindNumbersOfPrimesFunction();
		
		System.out.println("Solution: " + solution.countPrimes(n));
	}
}
