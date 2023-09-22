package org.example;

import java.util.Arrays;
import java.util.OptionalDouble;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        //question 1-5
        String[] names = {"Dan", "Tay", "Jake", "Brody"};
        int[] numbers = {5,7,4,12};
        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));

        //question 6-
        System.out.println(getSum(numbers));
        System.out.println(getAverage(numbers));
        System.out.println(extractAllOddNumbers(numbers));
        System.out.println(extractAllEvenNumbers(numbers));
    }
    public static int getLastIndex(String[] names) {
        return names.length -1;

    }
    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length -2;
    }
    //Question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }
    //Question 4
    public static String getLastElement(String[] names) {
        return names[3];
    }
    //Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[2];
    }
    //Question 6
    public static int getSum(int[] ints) {
       int sum = 0;
       for(int i : ints){
           sum = sum + i;
       }

       return sum;
    }
    //Question 7
    public static OptionalDouble getAverage(int[] ints) {
        return Arrays.stream(ints).average();

    }
    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        StringBuilder result = new StringBuilder();

        for(int num : numbers){
            if(num % 2 !=0){
                result.append(num).append(" ");
            }
        }

        return result.toString();
    }
    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for (int num : numbers){
            if (num % 2 ==0){
                result.append(num).append(" ");
            }
        }

        return result.toString();
    }
    //Question 10
    public static boolean contains(String[] names, String element) {
        return false;
    }
    //Question 11
    public static int getIndexByElement(String[] names, String element) {
        return 0;
    }
    //Question 12
    public static void printOddNumbersInRange(int start, int end){

    }
    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        return null;
    }
    //Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        return null;
    }
    //Question 15
    // Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str){
        return 0;
    }
}