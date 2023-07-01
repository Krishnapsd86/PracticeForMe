
public class Fibonacciseries {

	public static void main(String[] args) {
		int n = 7; // Desired number of terms

		int a = 0;
		int b = 1;

		System.out.print("Fibonacci Series: " + a + ", " + b);
		

		for (int i = 3; i <= n; i++) {
			int c = a + b;//0/1/1/3/5/8
			System.out.print(", " + c);
			a = b;
			b = c;
		}
		
		int e = 10; //desire number of fibonacci to printed
		int f= 0; //1st define variable
		int g= 1; // 2nd  "
		System.out.print(" ===> Value :"+f +" "+g); //result
		for(int k=3;k<=e;k++) { //iterate
			int h = f +g; //define third variable and + 1 and 2 variable 
			System.out.print(" ,"+h); //print 3rd variable
			f=g; //1 equal to 2
			g=h; //2 equa/ to 3rd
		}

      int i =10;
      int j=0;
      int k=3;
      System.out.print("Class Value :"+j + " "+ k);
      for (int l=3;l<=i;l++) {
    	  int result =j + k;
    	  System.out.print(" ,"+result);
    	  j =k;
    	  k=result;
		
	}

	}

}
