package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palin = "madam";
		String revStr = "";
		for (int i = palin.length()-1; i>=0 ; i--) {
			revStr+= palin.charAt(i);
		}
		if (palin.equals(revStr)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
