/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jamar Jackson
 */

package base;

import java.util.Scanner;

/*
Exercise 21 - Numbers to Names

Many programs display information to the end user in one form but use a different form inside the program. For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color or an internal value because you may need to represent the textual description in another language for Spanish-speaking visitors.

Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display an appropriate error message.
Example Output

Please enter the number of the month: 3
The name of the month is March.

Constraints

    Use a switch or case statement for this program.
    Use a single output statement for this program.

Challenges

    Use a map or dictionary to remove the switch statement from the program.
    Support multiple languages. Prompt for the language at the beginning of the program.

 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int number = myApp.monthNumber();
        String month = myApp.actualMonth(number);
        String outputString = myApp.generateOutputString(month);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public int monthNumber() {
        System.out.println("Please enter the number of the month: ");
        return in.nextInt();
    }

    public String actualMonth(int number) {
        return switch (number) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
    }

    public String generateOutputString(String month) {
        return "The name of the month is " + month + ".";
    }
}
