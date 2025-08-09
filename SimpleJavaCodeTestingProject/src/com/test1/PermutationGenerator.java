package com.test1;
public class PermutationGenerator {

    public static void main(String[] args) {

    	String input = "ABC";
        System.out.println("Permutations of " + input + ":");
        generatePermutations("", input);
    }

    // Recursive function to generate permutations
    public static void generatePermutations(String prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char ch = remaining.charAt(i);
            String before = remaining.substring(0, i);
            String after = remaining.substring(i + 1);
            generatePermutations(prefix + ch, before + after);
            System.out.println("Prefix + character: " + prefix + ch + ",before: " + before + ", after: " + after);
            System.out.println("Here is the prefix: " + prefix + ", remaining: " + remaining);
        }
    }
}
