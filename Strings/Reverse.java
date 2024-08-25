package Strings;

public class Reverse
{
    public static void main(String[] args)
    {
        String str="Hello";
        String ans=ReverseString(str);
        System.out.print("String before reversal is: "+str);

        System.out.print("String after reversal is: "+ans);
    }

    public static String ReverseString(String str)
    {
        int len=str.length();
        String reversedString=" ";
        for (int i = len-1; i >=0 ; i--)
        {
            char ch= str.charAt(i);
            reversedString+=ch;
        }
        return reversedString;
    }
}
