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
    static boolean uniqueCharacters(String str) {
        Set<Character> characters = new HashSet<>();
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (characters.contains(c)) {
                return false;
            }
            characters.add(c);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Check the word\n");
        String str = scn.next();
        boolean hasUniqueChars = uniqueCharacters(str);
        System.out.println("Does the string \"" + str + "\" have all unique characters? " + hasUniqueChars );

        scn.close();
    }
}