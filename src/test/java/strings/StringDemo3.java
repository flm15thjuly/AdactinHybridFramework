package strings;

public class StringDemo3 {

	public static void main(String[] args) {
		String s1="chrome";
		String s2="Chrome";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.toLowerCase().equals(s2.toLowerCase()));

	}

}
