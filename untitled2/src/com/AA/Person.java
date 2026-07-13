package com.AA;

public class Person {
    private String Name;
    private Vehicles vehicles;

    public Person(String Name, Vehicles vehicles){
        this.Name = Name;
        this.vehicles = vehicles;
    }
    public void A1(){
        if (vehicles instanceof Boat){
            vehicles = GC.getBoat();
        }vehicles.work();
    }
    public void A2(){
        if (vehicles instanceof Horse){
            vehicles = GC.getHorse();
        }vehicles.work();
    }
}
