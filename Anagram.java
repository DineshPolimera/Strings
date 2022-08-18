package in.ineuron.main;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println("Strings to check Anagrams:"+str1+" "+str2);
		boolean c = isAnagram(str1,str2);
		if(c==true) {
			System.out.println("Is a Anagram");
		}
		else {
			System.out.println("Is Not a Anagram");
		}
	}

	private static boolean isAnagram(String str1, String str2) {
		char[] w1 = str1.toCharArray();
		char[] w2 = str2.toCharArray();
		Arrays.sort(w1);
		Arrays.sort(w2);
		return Arrays.equals(w1, w2);
	}

}
