// Создать наследника реализованного класса HotDrink с дополнительным полем int температура
// Создать класс HotDrinkVendingMachine наследника VendingMachine и реализовать перегруженный метод getProduct(String name, double volume, double temperature), 
// выдающий продукт соответствующего имени, объема и температуры. Используйте при итерации конструкцию if 
// (product instance of HotDrink){ HotDrink ht = (HotDrink) product; }
// В main проинициализировать несколько экземпляров HotDrink и один HotDrinkVendingMachine и воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

package HotDrink;

public class DrinkMain {
    public static void main(String[]args) {
        HotDrink coffee = new HotDrink(50, "coffee", 50, 100);
        HotDrink tea = new HotDrink(40, "tea", 70, 50);
        HotDrink capuchino = new HotDrink(45, "capuchino", 60, 120);
        HotDrink espresso = new HotDrink(80, "espresso", 60, 90);
        
        HotDrinkVendingMashine hotDrinkVendingMashine = new HotDrinkVendingMashine();
        hotDrinkVendingMashine.addHotDrink(coffee);
        hotDrinkVendingMashine.addHotDrink(tea);
        hotDrinkVendingMashine.addHotDrink(capuchino);
        hotDrinkVendingMashine.addHotDrink(espresso);

        System.out.println(hotDrinkVendingMashine.getHotDrinks());
        hotDrinkVendingMashine.buyHotDrinks();

        
        
    }
    
}
