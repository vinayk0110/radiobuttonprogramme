package javaexamples;

import java.util.ArrayList;

public class collections {

	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("vinay");
		a.add("Sindhu");
		a.add("srivaishnav");
		a.add("vinay");
		
		
		for(String array : a)
		{
			 String[] myArray = new String[a.size()];
		      a.toArray(myArray);

			
			//System.out.println("List of elements are:" + array);
			
			
			for(int i=0;i<myArray.length;i++)
			{
				int count =1;
				for(int j=i+1;j<myArray.length;j++)
				{
					
					if(myArray[i]==myArray[j])
					{
						count++;
						System.out.println(myArray[i]);
						
					}
				}
				if(count>=1)
				{
					System.out.println(count);
				}
				
			}
			
		}
		
		//System.out.println(a.get(2));

	}

}
