package javaexamples;

public class strings {
	
	public static void m()
	{

	String s = new String("vinay@ 123");
	int len = s.length();
	String text = s.substring(s.indexOf("@")+2, s.length());
	System.out.println(text);
	//
	String s1 = "Vinay@sindhu";
	String []l = s1.split("@");
	
	for(String s2:l)
	{
		System.out.println(s2);
	}
	
	
	

	
	String a = "vinaysindhu";
	System.out.println(a.charAt(4));//y
	System.out.println(a.indexOf("y"));//4
	System.out.println(a.indexOf("s", 1));//5
	
	
	//duplicate characters
	String string[] = {"vinay","vinay","abhi","sindhu","vag"};
	String arr = "viinnay"; 
	char a1[] = arr.toCharArray();
	for(int i=0;i<arr.length();i++)
	{
		int count =1;
		for(int j =i+1;j<arr.length();j++)
		{
			if(a1[i]==a1[j])
			{
				count++;
				System.out.println(a1[i]);
			}
		}
				
	
	if(count>1)
	{
		System.out.println("Duplicate characters are"+ a1[i] + ":"+ count+"    times inserted");
	}
	}
	
	// Palindrome code		
	String palin = "Madam";
	String rev = "";
	for(int i=palin.length()-1;i>=0;i--)
	{
		rev = rev+palin.charAt(i);
		System.out.println(rev);
	}
	if(rev.equalsIgnoreCase(palin))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	
	//sorting order
	
	int[] arr1= new int[]{10,4,5,6,8};
	
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=i+1;j<arr1.length;j++)
		{	int temp =0;
			if(arr1[i]>arr1[j])
			{
				
				temp = arr1[i];
				arr1[i] = arr1[j];
				arr1[j] = temp;
				
				
			}
		}
			System.out.println(arr1[i]);
		
	}
	//fibonacci
	int n1 = 0,n2 =1,sum;
	System.out.println(n1+"" +n2);
	for(int i=2;i<=10;i++)
	{
		sum= n1+n2; // sum = 0+1=2, 1+2 =3, 2+3=5
		
		System.out.println("" +sum);
		n1=n2; // n1 =1, n1 = 2
		n2=sum;//n2 =2, n2 =3, n2 =
	}
	
			
	//Missing number
 //	rules: array should not be duplicates
	//array should be in sorted order
	int a2[] = {0,1,2,3,4,5,7};
	int sum1 =0;
	for(int i=0;i<a2.length;i++)
	{
		sum1 = sum1+a2[i]; // sum of al elements
		System.out.println(sum1);
		
	}
	int sum2 =0;
	for(int i=1;i<=a2.length;i++) // sum of range the element
		
	{
		sum2 = sum2+i;
		System.out.println(sum2);
	}
	sum2 = sum2 - sum1;
	System.out.println("Missing number is" + ":"  +sum2);
	
	
	//Reverse a number
	
	int Rev = 0;
	int num = 2345;
	while(num!=0)
	{
		Rev = Rev*10+num%10; //remainder 0+ 5 =5
		num=num/10; // dividend  2345/10 = 234
	}
	
	System.out.println(Rev);
	
}
	public static void main(String[] args)
	{
		m();
	}

}
