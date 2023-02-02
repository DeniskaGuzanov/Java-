// Реализовать алгоритм сортировки слиянием


public class SortMerge {
    public static void main(String[]args) {
        int[] array = {-5, 1, 6, 12, 33, 4, 18, 36, 100};
        sortMerge(array, array.length);
        for (int i = 0; i < array.length; i++) 
        System.out.println(array[i]);
        }
    
    public static void sortMerge(int[] array_1, int number) {
        if (number < 2) 
        return;
        int m = number / 2;
        int[] l = new int[m];
        int[] r = new int[number - m];

        for(int i = 0; i < m; i++){
            l[i] = array_1[i];
            }
        for (int i = m; i < number; i++) {
            r[i - m] = array_1[i];
            }    
        sortMerge(l, m);
        sortMerge(r, number - m);

        merge(array_1, l, r, m, number - m);
            }

    public static void merge(int[] array_2, int[] left, int[] right, int left_1  , int right_1) {

        int i = 0, j = 0, k = 0;

        while (i < left_1 && j < right_1) {

            if (left[i] <= right[j])
            array_2[k++] = left[i++];
            else
            array_2[k++] = right[j++];
                }
            
        while (i < left_1)
        array_2[k++] = left[i++];

        while (j < right_1) 
        array_2[k++] = right[j++];
            
        }

        
    }
        
        
        
    

