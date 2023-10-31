package workshop.workshop04;

public class Character {
    /*
    Write a Java program gives character counts in a string Ex: Tobeto -> t:2, o:2, b:1, e:1
     */

        public static void countCharacters(String string) {
            int[] characterCounts = new int[256];

            for (int i = 0; i < string.length(); i++) {
                char character = string.charAt(i);
                characterCounts[character]++;
            }

            for (int i = 0; i < characterCounts.length; i++) {
                if (characterCounts[i] > 0) {
                    System.out.println((char) i + ": " + characterCounts[i]);
                }
            }
        }

        public static void main(String[] args) {
            String string = "Tobeto";

            countCharacters(string);
        }
    }


