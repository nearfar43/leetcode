package string;

import java.util.Arrays;

/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
 */

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
		
		if (strs == null || strs.length == 0)
			return "";

		String pre = strs[0];
		int i = 1;
		while(i < strs.length) {
			while(strs[i].indexOf(pre) != 0)
				pre = pre.substring(0,pre.length()-1);
			i++;
		}
		return pre;

	}
	public static void main(String[] args) {
		String[] strs = {"flower", "flow", "flight"};
		
		System.out.println(longestCommonPrefix(strs));

	}

}
