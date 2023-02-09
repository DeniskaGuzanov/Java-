import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ListWorks {
    public static void main(String[]args) {
        Map<String, Integer> mp = new HashMap<>();

        String name = "Ivan Ivanov " +
                      "Petr Petrov " + 
                      "Sergey Sergeev " +
                      "Andrey Zvetkov " + 
                      "Ivan Sidorov " +
                      "Sergey Bulkin "+
                      "Salimov Stas " + 
                      "Ivan Tregubov " +
                      "Ivan Fedorov ";
        String[] listNameSurname = name.split(" ");
        for (int i = 0; i < listNameSurname.length; i+=2) {
            if(mp.containsKey(listNameSurname[i])){
                mp.replace(listNameSurname[i], mp.get(listNameSurname[i]) + 1);
            
            }else {
                mp.put(listNameSurname[i], 1);
            }
            
        }
        System.out.println(mp);
        Map<String, Integer> sortListNameSurname = new LinkedHashMap<>();
        int maxNumber = 1;
        for (int item : mp.values()) {
            if(item > maxNumber){
                maxNumber = item;
            }
            
        }
        for (int i = maxNumber; i > 0; i--) {
            for (Map.Entry<String, Integer> mpEnt : mp.entrySet()) {
                String key = mpEnt.getKey();
                if(mp.get(key) == i) {
                    sortListNameSurname.put(key, mp.get(key));
                }
                
            }
            
        }
        System.out.println(sortListNameSurname);
    }
    
}
