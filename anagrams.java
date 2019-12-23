/* The purpose of this Hacker Rank challenge is to write a method that,
 * given two Strings, determine if those Strings are anagrams.
 * An anagram is any word which has all the same letters as another word, in the
 * same amounts as the other word, but may
 * or may not have them spelled the same way.
 * /

 /* For a full description of this problem, and more challenges from Hacker Rank,
  * check out https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
  */

  /* Credit for this starter code belongs to Hacker Rank, at
   * https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
   */

import java.util.Scanner;

public class Solution {

    /*
     * Pre: String a and String break;
     * Post: Boolean stores whether a and b have the same number of char
     */
     public static boolean wordLengthMatch(String a, String b) {
         return a.length == b.length;
     }


    /*
     * Pre: String a and String b
     * Post: Boolean that determines whether or not
     * a and b are anagrams
     */
    public static boolean isAnagram(String a, String b) {
        // Complete the function
     }

   public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         String a = scan.next();
         String b = scan.next();
         scan.close();
         boolean ret = isAnagram(a, b);
         System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
     }
 }
