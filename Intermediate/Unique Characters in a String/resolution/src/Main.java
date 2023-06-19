/*
Write a uniqueCharacters() function that determines if any given string has all unique
characters (i.e. no character in the string is duplicated). If the string has all unique characters,
the function should return true . If the string does not have all unique characters, return
false.
For example, uniqueCharacters(“apple”) should return false.
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    /**
     * Checks if a string has all unique characters.
     *
     * @param str the string to be checked
     * @return true if all characters are unique, otherwise false
     */
    static boolean uniqueCharacters(String str) {
        // Create a set to store the characters
        Set<Character> characters = new HashSet<>();

        // Check if the string is empty and return false
        if (str.isEmpty()) {
            return false;
        }

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // If the character is already in the set, return false
            if (characters.contains(c)) {
                return false;
            }
            // Add the character to the set
            characters.add(c);
        }
        // If no duplicate character was found, return true
        return true;
    }

    /**
     * Main function that prompts the user for a word and checks if it has all unique characters.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in); scn) {
            System.out.println("Check the word\n");
            String str = scn.next();
            boolean hasUniqueChars = uniqueCharacters(str);
            System.out.println("Does the string \"" + str + "\" have all unique characters? " + hasUniqueChars);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}