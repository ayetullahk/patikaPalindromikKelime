package org.example;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Palindrom değildir.");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("Palindromdur");
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("Palindromdur.");
            return true;
        }else{
            System.out.println("Palindrom değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aka"));

    }
}