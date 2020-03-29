package study.techno;

import java.util.Scanner;

public class ifElseStatementWithAbsoluteValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int myNum = scan.nextInt();

        if (myNum < 0) {
            System.out.println("Absolute value is :" + myNum * (-1));
        } else {
            System.out.println("Absolute value is :" + myNum);


        }

    }
}
