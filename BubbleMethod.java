import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class BubbleMethod {
   public static void main (String[]args) {

    int [] arr = {1, -43, 54, -3, 87, -99, 23, 78};
        for (int i = arr.length-1;  i>=0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int p  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = p;

                    
                }
                
            }
            
        }
        System.out.println(Arrays.toString(arr));
   }
}
