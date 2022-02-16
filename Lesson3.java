/**
* Java. Homework 2
*
* @auhtor Liulin Aleksei
*
* @version 16.02.2022
*/
class Lesson3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        Task5(7,5);
    }
        // task 1
    static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] > 0) ? 0 : 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "-" + arr[i]);
        }
    }
        // task 2
    static void fillArray() {
        int[] array = new int[100];
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }
    }
        // task 3
    static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
            arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i] + " ");
        }
    }
        // task 4
    static void fillDiagonal() {
        int[][] arr = new int[4][4];
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                arr[i][j]= 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
        // task 5
    static void Task5(int len, int initialValue){
        int[] arr = new int[len];
        System.out.println(" ");
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("[" + i + "]" + arr[i] + " ");
            }
    }
}
