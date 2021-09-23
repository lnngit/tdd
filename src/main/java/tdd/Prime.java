package tdd;

import java.util.ArrayList;
import java.util.List;

public class Prime {
	private List<Integer> primes = new ArrayList<>();
	
	public static void main(String[] args) {
		Prime p  =  new Prime();
		p.printPrimeNumbers(100);
		
	}
	
	
	public void printPrimeNumbers(int number) {
		int number2 = 2;
		if(number>=number2) {
			addPrime(number2);
		}
		for(int i=3; i<=number; i=i+number2) {
			addPrime(i);
		}
		
		for(int prime:primes) {
			System.out.println(prime);
		}
	}
	
	public void addPrime(int number) {
		if(number<2) {
			return;
		}
		
		for(int prime:primes) {
			if(number%prime==0) {
				return;
			}
		}
		 primes.add(number);
	}

}
