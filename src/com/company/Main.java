package com.company;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Car, CarInfo> map = new HashMap<>();
        map.put(new Car(429,"01kg 333 FDF"),new CarInfo(2001,"Nisan Primera",7000,"Red"));
        map.put(new Car(450,"02kg 777 GGF"),new CarInfo(2021,"Audi",50000,"Blue"));
        map.put(new Car(320,"06kg 555 QWE"),new CarInfo(2006,"Mersedes",5000,"Black"));
        map.put(new Car(640,"09kg 111 TRY"),new CarInfo(2002,"Honda",10000,"Blue"));
        map.put(new Car(310,"04kg 000 OIU"),new CarInfo(1995,"Toyota",2000,"Silver"));

        for (Map.Entry<Car, CarInfo> carCarInformationEntry : map.entrySet()) {
            System.out.println(carCarInformationEntry.getKey() + " "+ carCarInformationEntry.getValue());

        }
    }
}
