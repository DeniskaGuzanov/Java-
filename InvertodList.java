import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


public class InvertodList {
    public static void main (String[]args ) {  
        LinkedList<Integer> list = new LinkedList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
        System.out.println("Добавленный список" + list);

        Collections.reverse(list);
        System.out.println("Перевернутый список " + list);
        
    }
    
}
