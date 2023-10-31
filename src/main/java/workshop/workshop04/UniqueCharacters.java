package workshop.workshop04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {

    /*
    How to determine if the string has all unique characters.
     */

        public static boolean hasUniqueCharacters(String str) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i] == chars[i + 1]) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            String str1 = "abcdef";
            String str2 = "abcabc";

            boolean hasUniqueCharacters1 = hasUniqueCharacters(str1);
            boolean hasUniqueCharacters2 = hasUniqueCharacters(str2);

            System.out.println(str1 + " has all unique characters: " + hasUniqueCharacters1);
            System.out.println(str2 + " has all unique characters: " + hasUniqueCharacters2);
        }
    }

