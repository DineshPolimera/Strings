//WAP to sort a String Alphabetically.
package in.ineuron.main;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		char []ch = str.toCharArray();
		int len=ch.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
			System.out.print(ch[i]+",");
		}
		
	}

}
