package ������4;

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
			//����
			else if (a[i][y-1]>k) {
				y--;
			}
			//����
			else {
				i++;
			}
		}
		
		return found;
	}

	public static void main(String[] args) {
		//���Ӳ���
		Scanner input = new Scanner(System.in);
		System.out.println("��������������������");
		int x = input.nextInt();
		int y = input.nextInt();
		int[][] a = new int[x][y];
		System.out.println("����������Ԫ��");
		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				a[i][j] = input.nextInt();
		System.out.println("����һ������");
		int k = input.nextInt();
		boolean result = Find(a,k);
		System.out.println(result);

	}

}
