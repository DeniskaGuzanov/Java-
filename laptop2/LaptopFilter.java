package laptop2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
public class LaptopFilter {

    public static void laptopMain(List<LaptopName> laptopNames) {
        Scanner iScanner = new Scanner(System.in);
        Map<Integer, Runnable> lM = new HashMap<>();
        lM.put(1, () -> getColor1(laptopNames));
        lM.put(2, () -> getOperationSystem1(laptopNames));
        lM.put(3, () -> getOsu1(laptopNames));
        lM.put(4, () -> getHdd1(laptopNames));
        lM.put(5, () -> getPrice1(laptopNames));
        lM.put(6, () -> System.out.println("Выход"));
        int number = 0;
        try {System.out.println("\nВведите цифру, соответствующую необходимому критерию:");
            System.out.println("1 --> Цвет\n2 --> Операционная система \n3 --> Оперативня память\n4 --> Обьём HDD\n5 --> Цена\n6 --> Выход");
            number = iScanner.nextInt();
            lM.get(number).run();
            sortLaptop(laptopNames,number);
                } catch (Exception e) {
                    System.out.println("Неправильно введено значение");
            }
        while (number != 6);
        iScanner.close();
    }
    public static void sortLaptop(List<LaptopName> list,int number){
    
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Если хотитe отсортировать выбранную категорию : нажмите y\nЕсли нет : n" );
        String sort_1 = iScanner.next();
        if (sort_1.equals("y"))
        System.out.println("\n|Имя | Цвет  | OS.System |OSU|HDD | Цена  ");
        try {
           sortInt((sortLaptopInt(filLaptopMapsInteger(list,number))));
        } catch (Exception e) {
            sortString((sortLaptopString(latopMapFilter(list,number))));
        }
    }
    public static Map<String, Object> getColor1(List<LaptopName> laptopNames) {
            Map<String, Object> lColor = new HashMap<>();
            for (LaptopName lColor1 : laptopNames) {
                lColor.put(lColor1.getName(), lColor1.getColor());
            }
                KeyValueMap(lColor, "");
                return lColor;
        }

    public static Map<String, Object> getOperationSystem1(List<LaptopName> laptopNames) {
            Map<String, Object> osSystem = new HashMap<>();
            for (LaptopName osSystem1 : laptopNames) {
                osSystem.put(osSystem1.getName(), osSystem1.getOperationSystem());
            }
                KeyValueMap(osSystem, "");
                return osSystem;
        }

    public static Map<String, Object> getOsu1(List<LaptopName> laptopNames) {
            Map<String, Object> osu = new HashMap<>();
            for (LaptopName lOsu1 : laptopNames) {
                osu.put(lOsu1.getName(), lOsu1.getOsu());
                }
                KeyValueMap(osu, " ГБ");
                return osu;
            }

    public static Map<String, Object> getHdd1(List<LaptopName> laptopNames) {
            Map<String, Object> hdd = new HashMap<>();
            for (LaptopName hdd1 : laptopNames) {
                hdd.put(hdd1.getName(), hdd1.getHdd());
            }
                KeyValueMap(hdd, " ГБ");
                return hdd;
        }

    public static Map<String, Object> getPrice1(List<LaptopName> laptopNames) {
        Map<String, Object> price = new HashMap<>();
        for (LaptopName price1 : laptopNames) {
            price.put(price1.getName(), price1.getPrice());
        }
            KeyValueMap(price, " руб");
            return price;
    }

    public static void KeyValueMap(Map<String, Object> map, String numberKey) {
        Map<String,Object> sortedMap=new TreeMap<>(map);
        for (Map.Entry<String, Object> numberKey1 : sortedMap.entrySet()) {
            System.out.println(" |  " + numberKey1.getKey() + "|" +  numberKey1.getValue() + numberKey + "|");
        }
    }
    public static List<String> getLaptop(LaptopName laptopName){
        List<String> getLaptop_1 = Arrays.asList(laptopName.getName(), laptopName.getColor(), laptopName.getOperationSystem(),
                                                 laptopName.getOsu(),Integer.toString(laptopName.getHdd()), Integer.toString(laptopName.getPrice()));
       
            return getLaptop_1;
    }

    public static Map<List<String>, String> latopMapFilter(List<LaptopName> laptopNames1,int sort1){
        Map<List<String>, String> laptopMapFilter_1 = new HashMap<>();
        String number = new String();
        for (LaptopName n1 : laptopNames1) {
            List<String> n2 = new ArrayList<>();
            n2 = getLaptop(n1);
            number = n2.get(sort1);
            laptopMapFilter_1.put(n2, number);
        }
            return laptopMapFilter_1;
    
    }
    public static Map<List<String>, Integer> filLaptopMapsInteger(List<LaptopName> laptopNames1,int sort1){
        Map<List<String>, Integer> filLaptopMapInteger_1 = new HashMap<>();
        Integer number = 0;
        for (LaptopName n1 : laptopNames1) {
            List<String> n2 = new ArrayList<>();
            n2 = getLaptop(n1);
            number = Integer.parseInt(n2.get(sort1));
            filLaptopMapInteger_1.put(n2, number);
        }
            return filLaptopMapInteger_1;
    
    }
    public static Map<List<String>, String> sortLaptopString(Map<List<String>, String> sortMapString) {
        sortMapString = sortMapString.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));
        return sortMapString;
    }
    public static Map<List<String>, Integer> sortLaptopInt(Map<List<String>, Integer> sortMapInt) {
        sortMapInt = sortMapInt.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));
        return sortMapInt;
    }
    public static void sortInt(Map<List<String>,Integer> mapInt){
        for (var mI : mapInt.entrySet()) {
            System.out.println(String.join("| ", mI.getKey()));
        }

    }
    public static void sortString(Map<List<String>,String> mapString){
        for (var mS : mapString.entrySet()) {
            System.out.println(String.join("| ", mS.getKey()));
        }
    }   
}
