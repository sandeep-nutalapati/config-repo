package com.sample;
public class PermutationString {  
    public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  
      
    public static void main(String[] args)  
    {  
        String str = "ABCD";  
        int len = str.length();  
        permutation(str, 0, len);  
    }  
      
    public static void permutation(String str, int start, int end)  
    {  
        if (start == end-1)  
            System.out.println(str);  
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                str = swapString(str,start,i);  
                permutation(str,start+1,end);  
                str = swapString(str,start,i);  
            }  
        }  
    }  
}  