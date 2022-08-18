package in.ineuron.main;

import java.util.Scanner;

//WAP to reverse a sentence while preserving the position.
//Input : “Think Twice”
//Output : “kniht eciwt”
public class Program2 {

	public static void main(String[] args) {
		int len;
		String reverse="",temp="";
		Scanner sc=new Scanner(System.in);
		String s1= sc.nextLine();
		len=s1.length();
		for(int i=0;i<=len-1;i++) {
			temp = temp+s1.charAt(i);
			if(s1.charAt(i)==' '||i==len-1) {
				for(int j=temp.length()-1;j>=0;j--) {
					reverse=reverse+temp.charAt(j);
					if(j==0&&i!=len-1){
						reverse+=" ";
					}
				}
				temp="";
			}
		}
		System.out.println(reverse);
	}

}
