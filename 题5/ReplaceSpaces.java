package √Ê ‘Ã‚5;

import java.util.Scanner;

public class ReplaceSpaces {
	public static String replace(String a) {
		if (a == null) {
			return null;
		}
		int blanknum = 0;
		int length = a.length();
		int newlength;
		for (int i = 0; i < length; i++) {
			if (a.charAt(i) == ' ')
				blanknum++;
		}
		newlength = length + 2 * blanknum;
		char[] newA = new char[newlength];
		int index = newlength-1;
		for (int i = length-1; i >= 0; i--) {
			if(a.charAt(i)==' ') {
				newA[index--] = '0';
				newA[index--] = '2';
				newA[index--] = '%';
			}
			else {
				newA[index--] = a.charAt(i);
			}
		}
		return new String(newA);

	}

	public static void main(String[] args) {
		//¿˝◊”≤‚ ‘
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		System.out.println(replace(a));
		// TODO Auto-generated method stub

	}

}
