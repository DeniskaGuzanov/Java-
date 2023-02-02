import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class DeleteEvenNumbers {
    public static void main(String[]args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int number = random.nextInt(100);
            list.add(number);
            
        }
        System.out.printf("Первичный список %s \n ", list);
        
        int s = 0;
        while (s < list.size()) {
            if (list.get(s) % 2 == 0) {
                list.remove(s);
                
            }
        else {
            s++;

        }



        }
        System.out.printf("Список из удаленных целых чисел %s \n ", list);

    }    




} 