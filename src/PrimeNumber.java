
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
		
		int prime = 15;//initialized prime number variable
		int count ;
		for (int i = 1; i <=prime; i++) {//iterate whether its reminder is zero
			count=0;
			for (int j = 2; j <=i/2; j++) {//iterate whether its reminder is zero
				if (i%j==0) {//if reminder comes zero increase
					count++;
					break;
				}
			}
			if (count==0) {//if zero than print
				System.out.println(i);
			}
		}

	}
	
	
}
