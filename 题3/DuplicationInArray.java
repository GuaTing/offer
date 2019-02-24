package √Ê ‘Ã‚3;

import java.util.Scanner;

public class DuplicationInArray {
	public static int duplication;

    public static boolean duplicate(int[] a) {
        if (a == null || a.length == 0) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 || a[i] >= a.length) {
                return false;
            }
        }

        for (int i = 0; i < a.length; i++) {
            while (a[i] != i) {
            	int t = a[i];
                if (a[i] == a[t]) {
                    duplication = t;
                    System.out.println(t);
                    return true;
                }
                a[i] = a[t];
                a[t] = t;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a=new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		boolean result = duplicate(a);
		System.out.println(result);

}}
