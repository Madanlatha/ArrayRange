package SubArrayMAx;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
	public static int[] Range(int arr[],int b, int c) {
		int p[]=new int[c-b+1];
		int j=0;
		for(int i=b;i<=c;i++) {
			p[j]=arr[i];
			j++;
		}
		return p;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int b=sc.nextInt();
		int c=sc.nextInt();
		int value[]=Range(arr,b,c);
		System.out.println(Arrays.toString(value));
			}

}
