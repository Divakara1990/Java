package com.hibernate.app;

public class Sample {
	
	
	public static int[] test(int[] a1, int[] a2)
	{
		int[] res = new int[2];
		int count = 0;
		for (int i = 0; i < a2.length; i++) {
			
			for (int j = 0; j < a1.length; j++) {
				if (a2[i]>a1[j]) {
					count++;
					res[i] = count;
				}
				
			}
			count = 0;
			
		}
		return  res;
	}
	
	public static void main(String[] args) {
		
		String str = "http:\\www.google.com";
		char ch[] = str.toCharArray();
		
		System.out.println(str.length());
		System.out.println(ch.length);
		String st = "";
		for (int i = 0; i < ch.length; i++) {
			
			if (ch[i] != ':' && ch[i] != '\\' && ch[i] != '.') {
				st = st + ch[i];
				
			} else {
				System.out.println(st);
				st = "";
			}
		}
		System.out.println(st);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		int[] a1 = {1,4,2,1};
		int[] a2 = {2,4};
		int[] res = test(a1, a2);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
	
	
}


