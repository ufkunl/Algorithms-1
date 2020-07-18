package com.loodos1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci kelimeyi girin :");
        String firstText = scanner.next();
        System.out.println("İkinci kelimeyi girin :");
        String secondText = scanner.next();

        boolean result = method(firstText, secondText);

        // if not exist, call same method with reverse parameter
        if (!result) {
            System.out.println("Sonuç : " + method(secondText, firstText));
        } else {
            System.out.println("Sonuç : " + true);
        }

    }

    private static boolean method(String firstText, String secondText) {

        String[] permutationList = new String[factorial(firstText.length())];

        allPermutation("", firstText, permutationList);

        boolean result = false;
        for (String perText : permutationList) {
            if (secondText.contains(perText)) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static void allPermutation(String prefix, String str, String[] array) {
        int count = 0;
        int n = str.length();
        if (n == 0) {
            while (array[count] != null){
                count++;
            }
            array[count] = prefix;
        } else {
            for (int i = 0; i < n; i++) {
                allPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), array);
            }
        }
    }

    private static int factorial(int number) {
        int result = 1;
        for (int i = number; i > 1; i--) {
            result = result * i;
        }
        return result;
    }

}
