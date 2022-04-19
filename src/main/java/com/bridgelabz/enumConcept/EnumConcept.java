package com.bridgelabz.enumConcept;

import java.util.Scanner;

public class EnumConcept {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("type");
        String s = scanner.nextLine();
        TravelMode travelMode = TravelMode.getType(s);
        System.out.println("Your fare is: " + travelMode.calculateFare());
        int value=Type.LITRE.value;
        System.out.println(value);
    }
}

enum TravelMode {
    AIRLINE {
        @Override
        public int calculateFare() {
            return 2399;
        }
    }, TRAIN {
        @Override
        public int calculateFare() {
            return 6000;
        }
    }, BUS {
        @Override
        public int calculateFare() {
            return 3000;
        }
    }, CAR {
        @Override
        public int calculateFare() {
            return 5000;
        }
    }, BIKE {
        @Override
        public int calculateFare() {
            return  1000;
        }
    };


    public abstract int calculateFare();

    public static TravelMode getType(String type){
        for(TravelMode travelMode : TravelMode.values()){
            if (travelMode.toString().equalsIgnoreCase(type))
                return travelMode;
        }
        return null;
    }


}

enum Type {
    LITRE(1000), MILLILITRE(1), CENTIMETER(12);

    int value;

    Type(int value){
        this.value= value;
    }
}

