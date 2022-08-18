//WAP to print repeatedly occurring characters in the given String.
package in.ineuron.main;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.println("Enter the String");
		String str = sc.nextLine();
		str=str.toLowerCase();
		char []ch = str.toCharArray();
		 for(int i = 0; i <ch.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <ch.length; j++) {  
	                if(ch[i] == ch[j] && ch[i] != ' ') {  
	                    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    ch[j] = '0';  
	                }  
	            }  
	            //A character is considered as duplicate if count is greater than 1  
	            if(count > 1 && ch[i] != '0')  
	                System.out.println(ch[i]+ " "+count);  
	        }  
	}

}
