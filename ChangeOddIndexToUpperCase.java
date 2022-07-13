package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] strArray = test.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			if (i%2!=0) {
				strArray[i] = Character.toUpperCase(strArray[i]);
			}
		}
		System.out.println(strArray);
	}
}
