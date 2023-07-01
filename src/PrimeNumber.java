
public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;// less or equal are not prime
		}
		// Checking Square by calling methods of math
		for(int i =2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;//divided by any numbers is not prime
			}
		}
		return true; // Not divided, so it is prime
	}

	public static void main(String[] args) {
		int number =13;
		if(isPrime(number)) {
			System.out.println(number +" is Prime number");
		}else {
			System.out.println(number +" is Not Prime Number");
		}

	}
	
}
