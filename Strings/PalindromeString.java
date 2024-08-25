package Strings;

public class PalindromeString
{
    public static void main(String[] args)
    {
        String str="Mom";
        boolean ans=IsPalindrome(str);
        if(ans)
            System.out.println(" "+str +" is a string palindrome .");
        else
            System.out.println(" "+str +" is not a string palindrome .");

    }

    public static boolean IsPalindrome(String str)
    {
        int len = str.length();
        String reversedString = "";
        for (int i = len - 1; i >= 0; i--)
        {
            char ch = str.charAt(i);
            reversedString += ch;
        }
        return str.equalsIgnoreCase(reversedString);
    }
}
