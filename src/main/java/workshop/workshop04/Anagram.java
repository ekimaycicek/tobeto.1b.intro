package workshop.workshop04;

import java.util.Arrays;
import java.util.Map;

public class Anagram {
    /*
    How to check if two Strings are anagrams of each other?
     */


        public static boolean areAnagrams(String str1, String str2) {
            char[] chars1 = str1.toCharArray();
            Arrays.sort(chars1);
            char[] chars2 = str2.toCharArray();
            Arrays.sort(chars2);


            return Arrays.equals(chars1, chars2);
        }

        public static void main(String[] args) {
            String str1 = "silent";
            String str2 = "listen";

            boolean areAnagrams = areAnagrams(str1, str2);

            System.out.println(str1 + " ve " + str2 + " anagram mıdır? " + areAnagrams);
        }
    }



