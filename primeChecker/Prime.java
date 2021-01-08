package primeChecker;

import java.lang.System;

public class Prime {
	void checkPrime(int... numbers) {
		for (int number : numbers) {
			if (isPrime(number)) {
				System.out.print(String.format("%s ", number));
			}
		}
		System.out.println();
	}
	
	boolean isPrime(int number) {
		if (number == 2)
	        return true;
	    if (number < 2 || number % 2 == 0) 
	        return false;
	    for (int i = 3; i <= (int)Math.sqrt(number); i += 2){
	        if (number % i == 0)
	            return false;
	    }
	    return true;
    }
}
