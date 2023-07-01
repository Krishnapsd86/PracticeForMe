
public class reverseForInt {

	public static void main(String[] args) {
		
		int number = 12345; // The integer to be reversed

		String originalString = String.valueOf(number); // Convert the integer to a string
		String reversedString = new StringBuilder(originalString).reverse().toString(); // Reverse the string
		int reversedNumber = Integer.parseInt(reversedString); // Parse the reversed string back to an integer

		System.out.println("Original number: " + number);
		System.out.println("Reversed number: " + reversedNumber);
		
		int num =9876543;//define integar
		String OrgNum =String.valueOf(num);//convert integar to string
		String revNum = new StringBuilder(OrgNum).reverse().toString();//call builder class
		int reverseNumber =Integer.parseInt(revNum);//convert string to integar
		System.out.println(reverseNumber);//result
		
		  
	    int no=5470321;//define
	    int rev=0;//add variable
	    int rem;//add reminder
	    while(no!=0) {//iterate 
	      rem=no%10;//call reminder
	      rev=rev*10+rem;
	      no=no/10;
	      
	    }
	    System.out.println(rev);
	    
	    int num1=7865438;
	    int reve=0;
	    int reme;
	    while(num1!=0) {
	    	reme=num1%10;
	    	reve = reve*10+reme;
	    	num1=num1/10;
	    }
	    System.out.println(reve);


	}

}
