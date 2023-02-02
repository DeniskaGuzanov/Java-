import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static java.util.Collections.max;
import static java.util.Collections.min;
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф из этого списка.


public class ArrayListMinMax {
    public static void main(String[]args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int s = random.nextInt(100);
            list.add(s);
            
        }
        System.out.printf("Первоначальный набор целых чисел %s \n", list);

        int min = min(list);
        int max = max(list);

        int maxNumber = list.get(0);
        int minNumber = list.get(0);
        int sumNumber = 0;
        for (int i : list) {
            if (i > maxNumber) {
                maxNumber = i;
            }
            if (i < minNumber){
                minNumber = i;
            }
            sumNumber += i;

        }
        float floatNumber = (float)sumNumber / list.size();
        System.out.printf("Максимальное число %s \n", maxNumber );
        System.out.printf("Минимальное число %s \n", minNumber);
        System.out.printf("Среднее арифметическое чисел %s \n",floatNumber); 
    }

}
