package in.ineuron.main;
import java.util.Scanner;

public class Pangram {
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int count[] = new int[26];
		boolean flag = true;
		char ch = ' ';
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			if(ch==' ') {
				continue;
			}
			/*
	          *check if the character is among 26 alphabets, If so
	          *then increment the count of their respective index position
	          'b'-'a' = 1
	          'c'-'a' = 2
	         */
			else if(ch>='a' && ch<='z'){
	            count[ch-'a']++;
			}	
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Is a Pangram");
		}
		else {
			System.out.println("Not a pangram");
		}
	}
}
