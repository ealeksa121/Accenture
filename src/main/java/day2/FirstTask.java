package day2;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean isUsersInputsAreEquals = a == b;
        boolean isUsersFirstInputsAreLess = a < b;
        boolean isUsersFirstInputsAreLessOrEqual = a <= b;
        boolean isUsersSecondInputsAreGreater = a > b;
        boolean isUsersSecondInputsAreGreaterOrEqual = a >= b;

        System.out.println("Is " + a + " equal to " + b + " -" + isUsersInputsAreEquals);
        System.out.println("Is " + a + " less than " + b + " -" + isUsersFirstInputsAreLess);
        System.out.println("Is " + a + " less or equal " + b + " -" + isUsersFirstInputsAreLessOrEqual);
        System.out.println("Is " + a + " greater than " + b + " -" + isUsersSecondInputsAreGreater);
        System.out.println("Is " + a + " greater or equal " + b + " -" + isUsersSecondInputsAreGreaterOrEqual);

        System.out.print("Please enter two boolean statements:");
        boolean c = scanner.nextBoolean();
        boolean d = scanner.nextBoolean();

        boolean isUserBooleanInputsAreEquals = c == d;

        System.out.println("Is " + c + " equals " + d + " -" + isUserBooleanInputsAreEquals);

        System.out.println("Please enter whole number: ");
        int e = scanner.nextInt();

        if((e % 2 ) == 0){
            System.out.println("Your number: " + e + " is even");
        }else{
            System.out.println("Your number " + e +  " is odd");
        }

        System.out.print("Please enter boolean statements:");
        boolean f = scanner.nextBoolean();

        if(f){
            System.out.println("Opposite of " + f + " is false");
        }else{
            System.out.println("Opposite of " + f + " is true");
        }

        System.out.println("Please enter two whole numbers: ");
        int g = scanner.nextInt();
        int h = scanner.nextInt();

        if(g == h || g < 0 && h > 0 || g > 100 && h > 100){
            System.out.println("true");
        }else{
            System.out.println("false");
        }










    }
}
