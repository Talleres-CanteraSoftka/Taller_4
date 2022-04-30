package exercise_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this class contains the methods to create an array of random numbers
 * @version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
 * it has suffered 0 refactorings during the version
 * 0 minor changes were made
 * @author Jhon Dorado jhd400@gmail.com
 * @since 01.00.00 2022-04-23
 */
public class RandomNumbers {

    int[] array = new int[10];
    int i, j, aux;
    Scanner sca = new Scanner(System.in);

    public void randomNumbers() {
        System.out.println("The array of random numbers generated is:");
        for (i = 0; i < array.length; i++) {
            array[i] = 1 + (int) (Math.random() * 20);
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    /**
     * this class contains the method to sort the array using the bubble method. It works by checking each item in the list to be sorted with the next,
     * swapping them if they are in the wrong order. It is necessary to check the entire list several times until no more exchanges are needed,
     * which means that the list is ordered
     * @version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     * it has suffered 0 refactorings during the version
     * 0 minor changes were made
     * @author Jhon Dorado jhd400@gmail.com
     * @since 01.00.00 2022-04-23
     *
     */
    public int [] bubbleMethod(int[] array) {
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }

    /**
     *
     * @param array is the array of random numbers
     * @param left is a sub array of numbers smaller than the pivot
     * @param right is a sub array of numbers bigger than the pivot
     *
     * this class contains the method to sort the array using the quicksort method. In this method, an element is chosen from the set of elements to be sorted, which we will call the pivot.
     * Then we relocate  the other elements of the list on each side of the pivot, so that all the smaller ones are on one side, and the larger ones are on the other.
     * @version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     * it has suffered 0 refactorings during the version
     * 0 minor changes were made
     * @author Jhon Dorado jhd400@gmail.com
     * @since 01.00.00 2022-04-23
     */
    public void quicksort(int[] array, int left, int right) {
        int pivot = array[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (array[i] <= pivot && i < j) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i < j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }

        array[left] = array[j];
        array[j] = pivot;

        if (left < j - 1) {
            quicksort(array, left, j - 1);
        }
        if (j + 1 < right) {
            quicksort(array, j + 1, right);
        }

    }

    /**
     *this class is the menu for the program and contains all the methods mentioned before.
     * @version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     * it has suffered 0 refactorings during the version
     * 0 minor changes were made
     * @author Jhon Dorado jhd400@gmail.com
     * @since 01.00.00 2022-04-23
     */
    public void menu() {


            System.out.println(" ");
            System.out.println("You can sort the array using the following methods");
            System.out.println("1. Bubble method");
            System.out.println("2. Quicksort method");
            System.out.println("3. Exit");

            try {

                System.out.println("Type one of the options");
                int option = sca.nextInt();

                switch (option) {
                    case 1:
                        bubbleMethod(array);


                    case 2:
                        quicksort(array, 0, array.length - 1);
                        for (i = 0; i < array.length; i++) {
                            System.out.print(array[i] + "\t");
                        }
                        break;
                    case 3:

                        break;
                    default:
                        System.out.println("Sorry, only the numbers between  1, 2 and 3 are allowed");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must type a number");
                sca.next();
            }

    }

}
