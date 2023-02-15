package FinalProject1;

import java.util.HashSet;
import java.util.Set;

public class LaptopMain {

    public static void main(String[] args) {
                Laptop Asser = new Laptop("Asser", "красный", "Windows 7", "4", 400, 25000); 
                Laptop HP = new Laptop("HP", "чёрный", "Windows 10", "8", 200, 20000);
                Laptop MSI = new Laptop("MSI", "серый", "Linux", "6", 500, 19000);
                Laptop MAC = new Laptop("MAC", "серебристый", "MAC OS", "16", 300, 75000);
        
               
                Set <Laptop> laptop = new HashSet<>();
                laptop.add(Asser);      
                laptop.add(HP);
                laptop.add(MSI);
                laptop.add(MAC);
            
       
                Laptop FilterLaptop = new Laptop();
        
        
                System.out.println(FilterLaptop.newFilter(laptop));
            }
        }
        
    

