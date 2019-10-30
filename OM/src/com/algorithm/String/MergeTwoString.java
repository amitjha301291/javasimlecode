/**
 * 
 */
package com.algorithm.String;

/**
 * @author Amit Jha
 *
 */
public class MergeTwoString {

	public static String join(String str1, String str2) {
	    int length1 = str1.length();
	    int length2 = str2.length();
	    int commonLength = Math.min(length1, length2);
        System.out.println(commonLength);
	    StringBuilder mixedStringBuilder = new StringBuilder(length1 + length2);
	    // Append the characters which both strings have, mixing them
	    for (int i = 0; i < commonLength; i++) {
	        mixedStringBuilder.append(str1.charAt(i)).append(str2.charAt(i));
	    }
      System.out.println(mixedStringBuilder);
      System.out.println( mixedStringBuilder.append(str1, commonLength, length1));
      System.out.println( mixedStringBuilder.append(str2, commonLength, length2));
	    // Append the remaining characters
	    mixedStringBuilder.append(str1, commonLength, length1).append(str2, commonLength, length2);

	    return mixedStringBuilder.toString();
	}
	public static void main(String[] args) {
		System.out.println(join("ani","jhug"));

	}

}
