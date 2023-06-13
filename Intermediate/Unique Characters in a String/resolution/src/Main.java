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
     * Verifica se uma string possui todos os caracteres únicos.
     *
     * @param str a string a ser verificada
     * @return true se todos os caracteres forem únicos, caso contrário, false
     */
    static boolean uniqueCharacters(String str) {
        // Cria um conjunto para armazenar os caracteres
        Set<Character> characters = new HashSet<>();

        // Verifica se a string está vazia e retorna false
        if (str.isEmpty()) {
            return false;
        }

        // Verifica se a string está vazia e retorna false
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Se o caractere já estiver no conjunto, retorna false
            if (characters.contains(c)) {
                return false;
            }
            // Adiciona o caractere ao conjunto
            characters.add(c);
        }
        // Se nenhum caractere repetido foi encontrado, retorna true
        return true;
    }

    /**
     * Função principal que solicita ao usuário uma palavra e verifica se ela possui todos os caracteres únicos.
     *
     * @param args argumentos da linha de comando (não utilizados)
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