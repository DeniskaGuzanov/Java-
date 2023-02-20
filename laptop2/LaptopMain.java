package laptop2;

import java.util.Arrays;
import java.util.List;

public class LaptopMain {
    
    public static void main(String[] args) {
        LaptopName asser = new LaptopName("Asser", "grey  ", "Windows 7 ", "4 ", 300, 25000);
        LaptopName msi = new LaptopName("MSI  ", "blak  ", "Windows 10" , "6 ", 350, 34000);
        LaptopName asus = new LaptopName("Asus ", "weit  ", "Linux     ", "8 ", 500, 43500);
        LaptopName hp = new LaptopName("HP   ", "red   ", "Linux     ", "8 ", 450, 37000);
        LaptopName mac = new LaptopName("Mac  ", "silver", "MAC OS    ","16", 350, 75000);
       

        List<LaptopName> laptopsList = Arrays.asList(asser, msi, asus, hp, mac);
        
    
       
        LaptopName.laptopMain(laptopsList);

    }

  

    
    
}
