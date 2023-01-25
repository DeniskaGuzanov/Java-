import java.util.Scanner;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


public class TriangularNumber {
    public static void main(String[]args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int x = iScanner.nextInt();
        int result = (x * (x + 1)) / 2;
        System.out.printf("Треугольное число : %d \n", result );
        iScanner.close();

        
    }
    
}
