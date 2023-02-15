package FinalProject1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Laptop {

    private String nameLaptop;
    private String colorLaptop;
    private String operationSystem;
    private String osu;
    private int hdd;
    private int price;
    public Laptop() {
    }
    public Laptop(String nameLaptop, String colorLaptop, String operationsystem, String osu, int hdd, int price) {
        this.nameLaptop = nameLaptop;
        this.colorLaptop = colorLaptop;
        this.operationSystem = operationsystem;
        this.osu = osu;
        this.hdd = hdd;
        this.price = price;
        
    }

    public String getNameLaptop() {return nameLaptop;}
    public String getcolorLaptop() {return colorLaptop;}
    public String getOperationSystem() {return operationSystem;}
    public String getOsu() {return osu;}
    public int getHdd() {return hdd;}
    public int getPrice() {return price;}


    public List<Laptop> filter(Set<Laptop> laptop) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Укажите параметры ноутбука" +
                "\nУкажите размер жёсткого диска \nВналичии : 200, 300, 400, 500");
        String hddDisk = iScanner.nextLine();
        int parseHddDisk = Integer.parseInt(hddDisk);
        System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 4, 6, 8, 16 ");
        String operOsu = iScanner.nextLine();
        System.out.println("Укажите операционную систему\nВналичии : Window 7, Windows 10, Linux, MAC OS");
        String operSystem = iScanner.nextLine();
        System.out.println("Укажите цвет ноутбука\nВналичии : красный, чёрный, серый, серебристый");
        String color = iScanner.nextLine();

        List<Laptop> listLaptop = new ArrayList<>();
        for (Laptop tempLaptop : laptop) {
            if ( parseHddDisk == tempLaptop.hdd) {
                if (operOsu.equals(tempLaptop.osu)) {
                    if (operSystem.equals(tempLaptop.operationSystem)) {
                        if (color.equals(tempLaptop.colorLaptop)) {
                            listLaptop.add(tempLaptop);
                        }
                    }
                }
            }
        }
        return listLaptop;
    }


    public Set<Laptop> newFilter(Set<Laptop> laptop) {
        Scanner iScanner = new Scanner(System.in);
        Set<Laptop> listLaptop = new HashSet<>(laptop);

        System.out.println("Укажите номер или номера критериев фильрации ноутбуков," + 
        "\n1. Ёмкость жёсткого диска\n2. Оперативная память\n3. Операционная система\n4. Цвет");
        String userRequest = iScanner.nextLine();
            
        for (int i = 0; i < userRequest.length(); i++) {
            if(1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите размер жёсткого диска в гб\nИмеется : 200, 300, 400, 500");
                String enterHardDisk = iScanner.nextLine();
                int iHddDisk = Integer.parseInt(enterHardDisk);
                for (Laptop tempLaptop : laptop) {
                    if (iHddDisk != tempLaptop.hdd){ 
                        listLaptop.remove(tempLaptop);
                    }
                }          
            }
            
            if(2 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите количество оперативной памяти\nИмеется : 4, 6, 8, 16 (ГБ)");
                String enterOperativeMemory = iScanner.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperativeMemory.equals(tempLaptop.osu)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }   

            if(3 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите операционную систему\nИмеется : Window 7, Windows 10, Linux, MAC OS");
                String enterOperatingSystem = iScanner.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperatingSystem.equals(tempLaptop.operationSystem) == false)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        
            if(4 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите цвет ноутбука\nИмеется : красный, чёрный, серый, серебристый");
                String enterColor = iScanner.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterColor.equals(tempLaptop.getcolorLaptop())) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        }
        return listLaptop;
    }


    @Override
    public String toString() {
        return "\nНазвание ноутбука : " + nameLaptop + "\nЦвет : = " + colorLaptop 
                +  ",\nHDD Disk = " + hdd + ",\nOSU = " + osu 
                + ",\nSystem = " +  operationSystem + ",\nЦена = " + price;
    }

}

    

