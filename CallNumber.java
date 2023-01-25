import java.util.Scanner;

// Реализовать простой калькулятор 
// (пользователь вводит 2 числа и вводит операцию (+ - / *). 
// int a ; int b; String op (op!=”Stop”); (char != ’b’)

public class CallNumber {
    public static void main(String[] args) {
        double number_1;
        double number_2;
        double result;
        char operator;
        
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число :");
        number_1 = iScanner.nextDouble();

        System.out.println("Введите второе число :");
        number_2 = iScanner.nextDouble();

        System.out.println("\n Введите оператор (+, -, /, *) ");
        operator = iScanner.next().charAt(0);

        switch (operator) {
            case '+': result = number_1 + number_2;
                break;
            case '-': result = number_1 - number_2;
                break;
            case '*': result = number_1 * number_2;
                break;
            case '/': result = number_1 / number_2; 
                break;
            default: System.out.println("Ввведите корректный оператор");
                return;
                
            
        }
        System.out.println("Решение :\n" + number_1 + " " + operator + " " + number_2 + " = " + result);
        iScanner.close();

    }

}