package string;
/*
 * 
Write a function that takes a string as input and returns the string reversed.

Example 1:

Input: "hello"
Output: "olleh"
 */

public class ReverseString {
	
	public static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int first = 0;
        int last = s.length() - 1;
        
        while (first < last) {
            char temp = charArray[first];
            charArray[first] = charArray[last];
            charArray[last] = temp;
            first ++;
            last --;
        }
        
        return new String(charArray);
    }

	public static void main(String[] args) {
		
		System.out.println(reverseString("hello"));
	}

}
