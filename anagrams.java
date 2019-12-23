/* The purpose of this Hacker Rank challenge is to write a method that,
 * given two Strings, can determine if those Strings are anagrams.
 * An anagram is any word which has all the same letters as another word, in the
 * same amounts as the other word, but may
 * or may not have them spelled the same way.
 * /

 /* For a full description of this problem, and more challenges from Hacker Rank,
  * check out https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
  */

  /* Credit for the starter code, including the main method and the declaration
  * of the isAnagram method, belongs to Hacker Rank, at
   * https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
   */

import java.util.*;

public class Solution {

    /*
     * Pre: String a and String break;
     * Post: Boolean stores whether a and b have the same number of char
     */
     public static boolean wordLengthMatch(String a, String b) {
         return a.length() == b.length();
     }

     /*
      * Pre: String word
      * Post: an ArrayList<char> letters storing the characters that
      *       make up word
      */
     public static ArrayList<String> makeLetterCollection(String word) {
         ArrayList<String> letters = new ArrayList<String>();

         for(int i = 0; i < word.length(); i++){
             String nextLetter = word.substring(i, i+1);
             letters.add(nextLetter);
         }

         return letters;
     }

    /*
     * Pre: ArrayList word and ArrayList word2, who comprise of char data
     * Post: common chars between the ArrayList will be deleted
     */
    public static void removeCommonLetters(ArrayList<String> word1,
                                           ArrayList<String> word2) {
        // remove all char from word1, and in word2 as well if they exist
        do {
            String letter = word1.get(0);
            word1.remove(0);
            // if letter exists, remove through a traversal
            for(int i = 0; i < word2.size(); i++){
                if (letter.equalsIgnoreCase(word2.get(i))){
                    word2.remove(i);
                }
            }
        } while (word1.size() > 0);
   }
    /*
     * Pre: ArrayList word 1, nd ArrayList 2 storing char
     * Post: Boolean storing if both ArrayLists are emptied out
     */
    public static boolean checkBothEmpty(ArrayList<String> word1,
                                         ArrayList<String> word2){
        return (word1.size() == 0 && word2.size() == 0);
    }


    /*
     * Pre: String a and String b
     * Post: Boolean that determines whether or not
     * a and b are anagrams
     */
    public static boolean isAnagram(String a, String b) {
        // if both Strings not same length, return False
        if (!(wordLengthMatch(a, b))) {
            return false;
        } else {
            // make ArrayLists of both String, to isoloate char
            ArrayList<String> word1 = makeLetterCollection(a);
            ArrayList<String> word2 = makeLetterCollection(b);

            // remove chars held in common in both ArrayList
            removeCommonLetters(word1, word2);

            // make sure no letters remaining, after all common are removed
            if (checkBothEmpty(word1, word2)) {
                return true;
            } else {
                return false;
            }
        }
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
