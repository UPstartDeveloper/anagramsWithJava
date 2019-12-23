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

import java.util.*;

public class Solution {

    /*
     * Pre: String a and String break;
     * Post: Boolean stores whether a and b have the same number of char
     */
     public static boolean wordLengthMatch(String a, String b) {
         return a.length == b.length;
     }

     /*
      * Pre: String word
      * Post: an ArrayList<char> letters storing the characters that
      *       make up word
      */
     public static ArrayList<char> makeLetterCollection(String word) {
         ArrayList<char> letters = new ArrayList<char>();

         for(char letter: word){
             letters.add(letter);
         }

         return letters;
     }

    /*
     * Pre: ArrayList word and ArrayList word2, who comprise of char data
     * Post: common chars between the ArrayList will be deleted
     */
    public static void removeCommonLetters(ArrayList<char> word1,
                                           ArrayList<char> word2) {
        // remove all char from word1, and in word2 as well if they exist
        do {
            char letter = word1.get(0);
            word1.remove(0);
            // check if the letter is in the other word
            if (word2.contains(letter)) {
                // letter exists, remove through a traversal
                for(int i = 0; i < word2.size(); i++){
                    if (letter == word2.get(i)){
                        word2.remove(i);
                    }
                }
            }
        } while (word1.size() > 0);
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
