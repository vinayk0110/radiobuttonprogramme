package javaexamples;

import java.util.HashMap;

public class duplicates 
{
	public static void main(String[] args)
	{
	duplicate("javata");
	}
	public static void  duplicate(String str) 
	{
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		String s[] = str.split("");
		for(String s1 : s)
		{
			Integer count =hm.get(s1);
			System.out.println(count);
			if(count==null)
			{
				hm.put(s1, 1);
			}
			else
			{
				hm.put(s1, hm.get(s1)+1);
			}
			
			System.out.println(hm);
			//System.out.println(s1);
			
		}
	}

}
