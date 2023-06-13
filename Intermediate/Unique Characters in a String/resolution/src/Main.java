/*
Write a uniqueCharacters() function that determines if any given string has all unique
characters (i.e. no character in the string is duplicated). If the string has all unique characters,
the function should return true . If the string does not have all unique characters, return
false.
For example, uniqueCharacters(“apple”) should return false.
*/

public class Main {
    static  boolean uniqueCharacters(String word) {
        String isFalse = "false";
        if ( word == isFalse ) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean var = uniqueCharacters("False");
        System.out.println(var);
    }
}