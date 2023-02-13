
package Final_project;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_Laptop {

    public static void main(String[]args ) {
        Note_book book1 = new Note_book();
        book1.id = 1;
        book1.osu = "4 ГБ";
        book1.hdd = "1000 ГБ";
        book1.nameLaptop = "Asus";
        book1.collorLaptop = "Red";
        book1.operationSystem = "Linux";
        book1.price = 30000;
        
        Note_book book2 = new Note_book();
        book2.id = 2;
        book2.osu = "6 ГБ";
        book2.hdd = "1500 ГБ";
        book2.nameLaptop = "Lenovo";
        book2.collorLaptop = "Black";
        book2.operationSystem = "Windows 10";
        book2.price = 35000;

        Note_book book3 = new Note_book();
        book3.id = 3;
        book3.osu = "8 ГБ";
        book3.hdd = "500 ГБ";
        book3.nameLaptop = "Aser";
        book3.collorLaptop = "Gold";
        book3.operationSystem = "WindowVista";
        book3.price = 15000;
        
        Note_book book4 = new Note_book();
        book4.id = 4;
        book4.osu = "16 ГБ";
        book4.hdd = "400 ГБ";
        book4.nameLaptop = "Apple";
        book4.collorLaptop = "Silver";
        book4.operationSystem = "Mac Os";
        book4.price = 95000;

        List<String> filter1 = Arrays.asList(book1.nameLaptop, book2.nameLaptop, book3.nameLaptop, book4.nameLaptop);
        Collections.sort(filter1);


        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите номер запроса : \n 1 --> osu \n 2 --> hdd \n 3 --> Name Laptop \n 4 --> Collor \n 5 --> Model Laptop");
        int number = iScanner.nextInt();
        System.out.println("Вы ввели запрос № : " + number);


        switch (number) {
            case 1:
            System.out.println("| Имя   | ОЗУ    | \n|-------|--------|\n" + "| " + book1.nameLaptop + "  | " + book1.osu + "   |\n" + 
                                                                     "| " + book2.nameLaptop + "| " + book2.osu + "   |\n" +
                                                                     "| " + book3.nameLaptop + "  | " + book3.osu + "   |\n" +
                                                                     "| " + book4.nameLaptop + " | " + book4.osu + "  |\n"); 

                break;
         
            case 2:
            System.out.println("| Имя   | ОЗУ    | \n|-------|--------|\n" + "| " + book1.nameLaptop + "  | " + book1.hdd + "|\n" + 
                                                                     "| " + book2.nameLaptop + "| " + book2.hdd + "|\n" +
                                                                     "| " + book3.nameLaptop + "  | " + book3.hdd + " |\n" +
                                                                     "| " + book4.nameLaptop + " | " + book4.hdd + " |\n"); 

                break;

            case 3:
            System.out.println("| Имя   | ОЗУ    | \n|-------|--------|\n" + "| " + book1.nameLaptop + "  | " + book1.nameLaptop + "   |\n" + 
                                                                         "| " + book2.nameLaptop + "| " + book2.nameLaptop + " |\n" +
                                                                         "| " + book3.nameLaptop + "  | " + book3.nameLaptop + "   |\n" +
                                                                         "| " + book4.nameLaptop + " | " + book4.nameLaptop + "  |\n"); 
                break;                                                        
            
            case 4:
            System.out.println("| Имя   | ОЗУ    | \n|-------|--------|\n" + "| " + book1.nameLaptop + "  | " + book1.collorLaptop + "    |\n" + 
                                                                         "| " + book2.nameLaptop + "| " + book2.collorLaptop + "  |\n" +
                                                                         "| " + book3.nameLaptop + "  | " + book3.collorLaptop + "   |\n" +
                                                                         "| " + book4.nameLaptop + " | " + book4.collorLaptop + " |\n"); 
                break;

            case 5:
            System.out.println("Фильтр \n Фильтруем по имени ноутбука --> нажмите 1 \n Фильтруем по цене ноутбука --> нажмите 2 ");
            int filterLaptop = iScanner.nextInt();
            System.out.println("Вы ввели запрос на фильтрацию № : " + filterLaptop );
            if(filterLaptop == 1 ) {
                for (String i  : filter1) {
                    System.out.println("| Имя   | ОЗУ    | Цена  | \n|-------|--------|-------| \n" +  "| " + filter1.get(3) + "  | " + book1.osu + "   | " + book1.price + " |\n" 
                                                                                               +  "| " + filter1.get(2) + "| " + book2.osu + "   | " + book2.price + " |\n" 
                                                                                               +  "| " + filter1.get(1) + "  | " + book3.osu + "   | " + book3.price + " |\n" 
                                                                                               +  "| " + filter1.get(0) + " | " + book4.osu + "  | " + book4.price + " |\n"  );

                    
                }
            }



            }   
        
    }
}
