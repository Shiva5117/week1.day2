package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] textStr = text.split(" ");
		String[] newStr = new String[textStr.length];
		for (int i = 0; i < textStr.length; i++) {
			for (int j = i+1; j < textStr.length; j++) {
				if (textStr[i].equalsIgnoreCase(textStr[j])) {
					count++;
					if (count>1) {
						textStr[i] = "";
					}
				}
			}
			newStr[i] = textStr[i];
			System.out.print(newStr[i]+" ");
		}
	}

}
