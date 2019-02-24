package √Ê ‘Ã‚3;

import java.util.Scanner;

public class DuplicationInArrayNoEdit {
	public static int getDuplication(int[] a) {
        if (a == null || a.length == 0) {
            return -1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1 || a[i] >= a.length) {
                return -1;
            }
        }

        int[] tempArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
        	int t =a[i];
            if (a[i] == tempArr[t]) {
                return t;
            }
            tempArr[t] = a[i];
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a=new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		System.out.println(getDuplication(a));
	}

}
