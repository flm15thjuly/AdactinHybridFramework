package strings;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String s1="Creating robust web applications using Python, from dynamic UIs to powerful back ends";
		
		String s2="Web";
		
		System.out.println(s1.contains(s2));
		
		System.out.println(s1.startsWith("Creating"));
		
		System.out.println(s1.endsWith("ends"));
		
		//System.out.println(s2.contains(s1));

	}

}
