import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;
//К калькулятору из предыдущего дз добавить логирование.

public class CallLog {
 
   
    public static void main(String[] args) throws SecurityException, IOException {
        double number_1;
        double number_2;
        double result;
        char operator;
        Logger log = Logger.getLogger(CallLog.class.getName());
        FileHandler fh = new FileHandler("calk.xml");
        log.addHandler(fh);
        XMLFormatter xForm = new XMLFormatter();
        fh.setFormatter(xForm);
        log.info("Это простой калькулятор - придуманный мною");
        
        
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число :");
        number_1 = iScanner.nextDouble();


        System.out.println("Введите второе число :");
        number_2 = iScanner.nextDouble();

        log.log(Level.WARNING, "Внимание : ставьте правильно знаки оператора ");
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
        log.info("У вас все получилось!");
        iScanner.close();

    }

}