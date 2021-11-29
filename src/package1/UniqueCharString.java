package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UniqueCharString 
{
	private boolean findUniqueString(String s) {
		String s1 = "";
		boolean flag = true;
		for(int i=0;i<s.length();i++)
		{
			if(s1.contains(String.valueOf(s.charAt(i))))
			{
				flag = false;
				break;
			}
			else	
			{
				s1 = s1  + String.valueOf(s.charAt(i));
			}
		}
		return flag;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(findUniqueString("A"), true);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(findUniqueString("@#!$"), true);
	}
	@Test
	public void testCase3()
	{
		Assert.assertEquals(findUniqueString("abab"), false);
	}


}
