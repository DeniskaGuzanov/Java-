package HotDrink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotDrinkVendingMashine implements VendingMachine{
    private List<HotDrink> hotDrinks;
    
    public HotDrinkVendingMashine()
     {
        this.hotDrinks = new ArrayList<>();
     }
    public void addHotDrink(HotDrink hotDrink)
     {
        hotDrinks.add(hotDrink);
     }

     public List<HotDrink> getHotDrinks(){
        return hotDrinks;
     }

     @Override
     public void deviceGaveDrink(){
        System.out.println("Автомат выдал напиток --> ");

     }

     @Override
     public void deviceMoney(){
        System.out.println("Принять деньги --> ");

     }

     public void buyHotDrinks() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("\n Введите название напитка :\n ");
        for (HotDrink hD : hotDrinks) {
            System.out.println(hD.getName() + "  ");

        }

        System.out.println("\nВвести : ");
        String insertHotDrink = iScanner.nextLine();
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(insertHotDrink)){
                System.out.println("Внесите деньги : " + hotDrink.getMoney());
                System.out.println("Внесение суммы : ");
                
                String gave = iScanner.nextLine();
                int getName = Integer.parseInt(gave);
                if (getName == hotDrink.getMoney()) {
                    deviceMoney();
                    deviceGaveDrink();
                    System.out.println(hotDrink);


                }
        
            } 
            
        }

        
     }






}

