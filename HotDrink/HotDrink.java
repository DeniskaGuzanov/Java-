

package HotDrink;

import java.util.jar.Attributes.Name;

public class HotDrink extends Drink {
   
    int temperature;
    public HotDrink(int temperature, String name, double volume, int money){
        super(name, volume, money);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString(){
        return "\n\n name = " + super.getName() + "\n volume = " + super.getVolume() + "\n money = " + super.getMoney() + "\n temperatura = " + temperature;
        
    }

}
