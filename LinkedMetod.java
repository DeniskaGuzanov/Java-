import java.util.Deque;
import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - 
// помещает элемент в конец очереди, dequeue() - 
// возвращает первый элемент из очереди и удаляет его, first() - 
// возвращает первый элемент из очереди, не удаляя.

public class LinkedMetod {
    public static void main(String[]args) {

        int[] list = {10, 20, 30, 40, 50, 60 };

        LinkedList<Integer> ll = new LinkedList<>();
        for (Integer items : list) {
            ll.add(items);
        } 
        System.out.println("Список элементов : " + ll);
        enqueue(ll, 100);

        System.out.println("Добавлен элемент : 100 -> " + ll);

        System.out.println("Вовзращает первый элемент из списка и удаляет его : -> " + dequeue(ll));
        System.out.println(ll);

        System.out.println("Возвращает первый элемент из списка : " + first(ll));
        }
    

    public static void enqueue(LinkedList<Integer> list, int number) { 
        list.addLast(number);
    }
    public static int dequeue(LinkedList<Integer> list) {
        int number = 0;
        number = list.get(0);
        list.remove(0);
        return number;
    
        }


    public static int first(LinkedList<Integer> list) {
        int number = 0;
        number = list.get(0);
        return number;

    
    }        
}

