package sasha.frolov;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();
            int result = calc(num1, num2, operation);
            System.out.println("Operation Result: " + result);
            if(repeat() == false) break;
        }
    }

    private static int getInt(){
        System.out.println("Enter the number:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("You made a mistake while entering the number. Try again.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    private static char getOperation(){
        System.out.println("Enter the operation:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("You made a mistake while entering the operation. Try again.");
            scanner.next();//recursion
            operation = getOperation();
        }
        return operation;
    }

    private static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("The operation is not recognized. Repeat entry.");
                result = calc(num1, num2, getOperation());//recursion
        }
        return result;
    }

    private static boolean repeat(){
        boolean check = true;
        System.out.println("Again? 1 - Yes. 0 - No.");
        int temp;
        if(scanner.hasNextInt()){
            temp = scanner.nextInt();
        } else {
            System.out.println("You made a mistake while entering the operation. Try again.");
            scanner.next();//recursion
            temp = scanner.nextInt();
        }
        if(temp == 1)
            check = true;
        if(temp == 0)
            check = false;
        if(temp != 0 && temp != 1){
            System.out.println("You made a mistake while entering the operation. Try again.");
            repeat();
        }
        return check;
    }
}