

package HotDrink;

public class Drink {
    private String name;
    private double volume;
    private int money;
    
    public Drink(String name, double volume, int money){
        this.name = name;
        this.volume = volume;
        this.money = money;
    }
    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }
    public double getVolume() {
        return volume;
    }

    
    
}
