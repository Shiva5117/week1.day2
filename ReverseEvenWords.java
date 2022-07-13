package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] wordArray = test.split(" ");
		String[] resArray = new String[wordArray.length];
		for (int i = 0; i < wordArray.length; i++) {
			if (i%2!=0) {
				resArray[i] = wordArray[i];
				System.out.print(resArray[i]+ " ");
			}else {
				char[] ch1 = wordArray[i].toCharArray();
				char[] ch2 = new char[ch1.length];
				int k=0;
				for (int j = ch1.length-1; j >=0 ; j--) {
					ch2[k] = ch1[j];
					k++;
				}
				String string1 = new String(ch2);
				resArray[i] = string1;
				System.out.print(resArray[i]+ " ");
			}
		}

	}
}
