package strings;

public class StringNonRepeat {

	public static void main(String[] args) {
		
		String s1="abc def cda bghe";
		
		char[] allChars=s1.toCharArray();
		
		for(int i=0;i<allChars.length;i++)
		{
			if(s1.indexOf(allChars[i])==s1.lastIndexOf(allChars[i]))
				{
					System.out.println("first non-repeating character is "+allChars[i]);
					break;
					}
		}
		

	}

}
