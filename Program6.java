//WAP to count number of special characters.
package in.ineuron.main;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		str=str.toLowerCase();
		char []ch = str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')||(ch[i]>='0'&&ch[i]<='9')){
				continue;
			}
			else
				count++;
		}
		System.out.println("No.of Special characters in String are : "+count);

	}

}
