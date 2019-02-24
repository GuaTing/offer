package 面试题4;

import java.util.Scanner;

public class sort {
	
	public static boolean Find(int[][] a,int k) {
		boolean found = false; 
		int y = a[0].length;
		int x = a.length;
		int i = 0;
		while (i<x&&y>0) {
			if(a[i][y-1] == k) {
				found = true;
				break;
			}
			//减列
			else if (a[i][y-1]>k) {
				y--;
			}
			//减行
			else {
				i++;
			}
		}
		
		return found;
	}

	public static void main(String[] args) {
		//例子测试
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数组行数和列数");
		int x = input.nextInt();
		int y = input.nextInt();
		int[][] a = new int[x][y];
		System.out.println("请输入数组元素");
		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				a[i][j] = input.nextInt();
		System.out.println("输入一个整数");
		int k = input.nextInt();
		boolean result = Find(a,k);
		System.out.println(result);

	}

}
