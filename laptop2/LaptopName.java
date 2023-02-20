package laptop2;

public class LaptopName extends LaptopFilter{

    String name;
    String color;
    String operationSystem;
    String osu;
    Integer hdd;
    Integer price;

    LaptopName(String name, String color, String operationSystem , String osu, int hdd, int price) {
        this.name = name;
        this.color = color;
        this.operationSystem = operationSystem;
        this.osu = osu;
        this.hdd = hdd;
        this.price = price;
        
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getOsu() {
        return osu;
    }

    public int getHdd() {
        return hdd;
    }

    public int getPrice() {
        return price;
    } 
    
}

    

