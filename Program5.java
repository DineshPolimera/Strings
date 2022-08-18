//WAP to count the number of Vowels and Consonants of a String value.
package in.ineuron.main;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		int count1 = 0,count2 = 0;
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
				count1++;
			}
			else {
				count2++;
			}
		}
		System.out.println("Count of Vowels is "+ " "+count1+" and constants is "+count2+".");
	}

}
