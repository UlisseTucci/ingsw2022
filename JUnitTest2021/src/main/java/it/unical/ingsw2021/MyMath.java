package it.unical.ingsw2021;

public class MyMath {

	//private ConnectionManager cm;

	/**
	 * Creating dependency within the class makes testing difficult, 
	 * it might be better to receive the dependency from outside
	 */
	public MyMath() {		
		
	}
	
	/**
	 * This constructor is used to receive the ConnectionManager dependency
	 * (Set methods could also be used)
	 */
	/*public MyMath(ConnectionManager cm) {		
		this.cm = cm;
	}*/

	/**
	 * Calculates the fibonacci series until it finds the nth number in the series
	 * @param n 	the nth position
	 * @return the nth number in the fibonacci series 
	 */
	public int fibonacci(int n) {		
		if (n < 0) {
			throw new IllegalArgumentException("Illegal value " + n);
		}
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	/**
	 * Calculates the factorial of a given number
	 * @param n 	the number to calculate the factorial
	 * @return the factorial for a given integer
	 */
	public int factorial(int n) {

		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	/**
	 * This method is to simulate a network connection manager
	 * @param n		the number to calculate the factorial
	 * @return the factorial calculated remotely 
	 */
	/*public int remoteFactorial(int n) {
		if(!cm.isNetworkConnected()) {
			throw new RuntimeException("It's not posible to reach the server");
		}
		return 12345678;
	}*/

}
