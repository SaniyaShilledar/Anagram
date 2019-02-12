import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("ENter string1: ");
		String s1 = kb.nextLine();
		System.out.println("ENter string2: ");
		String s2 = kb.nextLine();
		s1 = removeSpace(s1);
		s2 = removeSpace(s2);
		if (s1.length() == s2.length()) {
			s1 = lowerCase(s1);
			s2 = lowerCase(s2);
			s1 = sort(s1);
			s2 = sort(s2);
		
		for (int i = 0; i < s2.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				System.out.println("Not anagram");
				return;
			}
			}
		System.out.println("Anagram");
	}

			else {
				System.out.println("Not anagram");
			}
		

	}
	
//loop for removing spaces present in string
	static String removeSpace(String s) {
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				temp += s.charAt(i);
			}
		}
		return temp;

	}

	//loop for converting a letter to upercase or lowercase
	static String lowerCase(String s) {
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				temp += (char) (s.charAt(i) + 32);
			} else {
				temp += s.charAt(i);
			}
		}
		return temp;
	}

	//loop for sorting the characters
	static String sort(String s) {
		char[] ar = s.toCharArray();
		String temp = "";
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length ; j++) {
				if (ar[i] > ar[j]) {
					char t = ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				

				}

			}

		}
		for(int i=0;i<ar.length;i++) {
			temp+=ar[i];
		}
		
		return temp;
	}

}
