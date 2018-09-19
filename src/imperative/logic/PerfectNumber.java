package imperative.logic;

import java.util.HashSet;
import java.util.Set;

public class PerfectNumber {
		
	private static void validatePositiveNumber(int n) {
		if (n <= 0) throw new IllegalArgumentException("Only positive integers allowed");		
	}
	
	public static STATE process(int n) {	
		validatePositiveNumber(n);
		int sum = 0;	
		for(int i = 1; i < n; i++)
		{
			if (n % i == 0) sum += i;			
		}	
		if (sum == n) return STATE.PERFECT;
		if (sum < n) return STATE.DEFICIENT;
		return STATE.ABUNDANT;		
	}

	public  static Set<Integer> divisors(int n)	{				
		validatePositiveNumber(n);
		Set<Integer> divisors = new HashSet<>();
		for(int i = 1; i <= n; i++)
		{
			if (n % i == 0) divisors.add(i);			
		}
		return divisors;
	}

}
