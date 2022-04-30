package exercise_6;

import java.util.Scanner;

/**
 * this class create a vector, and it saves the numbers until the user writes the same number twice in a row,
 * at the end the apps prints all the numbers
 *@version 01.00.00 2022-04-25, The class corresponds to version 1 of the system,
 *it has suffered 0 refactorings during the version
 *0 minor changes were made
 *@author Jhon Dorado jhd400@gmail.com
 *@since 01.00.00 2022-04-25
 */
public class Vector {
    public static void main(String[] args) {

        java.util.Vector vector = new java.util.Vector();
        Scanner read = new Scanner(System.in);
        int num, temp = 0, temp2 = 0, cont = 0;
        do {
            System.out.println("You can create a vector writing  as much numbers as you want but if you write the same number twice in a row, the app stops. \nType a number to save: ");
            num = read.nextInt();

            if (cont <= 0) {
                temp = num;
                vector.add(num);
                if (temp == temp2) {
                    temp2 = temp + 1;
                }
            } else {
                temp2 = temp;
                temp = num;
                if (temp2 != temp) {
                    vector.add(num);
                }
            }
            cont++;
        } while (temp != temp2);

        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.elementAt(i) + "\t");
        }

    }

}
