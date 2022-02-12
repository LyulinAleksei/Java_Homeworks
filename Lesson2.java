/**
* Java. Homework 2
*
* @auhtor Liulin Aleksei
*
* @version 12.02.2022
*/
class Lesson2 {
    public static void main(String[] args) {
        System.out.println(within10and20(5,10));
        isPositiveOrNegative(-5);
        System.out.println(isNegative(-5));
        printWordNTimes("Alex",7);
    }
    public static boolean within10and20(int x1, int x2) {
        return x1 + x2 >=10 && x1 + x2 <=20;
    }
    public static void isPositiveOrNegative(int x) {
        if (x >=0) {
        System.out.println("Positive");
        } else {
        System.out.println("Negative");
        }
    }
    public static boolean isNegative(int x) {
        if (x <0) {
        return true;
        }
        return false;
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 1; i<= times; i++) {
        System.out.println(word);
        }
    }
}
