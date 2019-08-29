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
            System.out.println("Результат операции: " + result);
            if(repeat() == false) break;
        }
    }

    private static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    private static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
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
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }

    private static boolean repeat(){
        boolean check = true;
        System.out.println("Еще раз? 1 - Да. 0 - Нет");
        int temp;
        if(scanner.hasNextInt()){
            temp = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            temp = scanner.nextInt();
        }
        if(temp == 1)
            check = true;
        if(temp == 0)
            check = false;
        if(temp != 0 && temp != 1){
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            repeat();
        }
        return check;
    }
}