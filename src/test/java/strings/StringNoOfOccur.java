package strings;

import java.util.HashMap;
import java.util.Map;

public class StringNoOfOccur {
	
	public static void main(String[] args) {
		
		String s1="Creating robust web applications using Python, from dynamic UIs to powerful back ends.";
		
		char[] allChars=s1.toCharArray();
		
		Map<Character, Integer> hMap=new HashMap<Character, Integer>();
		
		for(int i=0;i<allChars.length;i++)
		{
			if(hMap.containsKey(allChars[i]))
			{
				hMap.put(allChars[i], hMap.get(allChars[i])+1);
			}
			else
			{
				hMap.put(allChars[i], 1);
			}
		}
		
		System.out.println(hMap);
		
	}

}
