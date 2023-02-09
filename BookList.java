import java.util.HashMap;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.



public class BookList {
    public static void main(String[]args) {
        Map<String, String> mp = new HashMap<>();
        mp.put("8 903 564 58 41", "Petrov");
        mp.put("8 903 564 59 74", "Smirnov");
        mp.put("8 908 564 58 41", "Sidorov");
        mp.put("8 945 564 57 41", "Ivanov");
        mp.put("8 936 777 00 41", "Petrov");   
         
        for (var i  : mp.entrySet()){
            if (i.setValue(null) == "Petrov" ){
                System.out.printf("\nPetrov -->  " + i.getKey());
            }

        }

    }

}
