package strings;

public class StringDemo5 {

	public static void main(String[] args) {
		
		String s1="chrome";
		String s2="Chrome";
		// ACSII value of a 97
		//ASCII value of A 65
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));

	}

}
