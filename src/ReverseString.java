
public class ReverseString {

	public static void main(String[] args) {

		String name = "Krishna";
		String sum = "";
		for (int i = 0; i < name.length(); i++) {
			sum = name.charAt(i) + sum;

		}
		System.out.println(sum);

		String Rname = "Kathmandu";
		for (int i = Rname.length() - 1; i >= 0; i--) {
			System.out.print(Rname.charAt(i));
		}

	}

}
