package by.issoft.task6;

import java.util.ArrayList;

public class Street {

    private ArrayList<House> houses;

    public Street() {
        houses = new ArrayList<House>();
    }

    public void buildApartment(int number, int floorNumber, int entranceNumber) {

        for (int i = 0; i < number; i++) {
            houses.add(new Apartment(floorNumber, entranceNumber));
        }
    }

    public void buildTownhouse(int number, int roomNumber, int floorNumber, int area) {
        for (int i = 0; i < number; i++) {
            houses.add(new Townhause(roomNumber, floorNumber, area));
        }
    }

    public void buildCottage(int number, int roomNumber, int floorNumber, int area) {
        for (int i = 0; i < number; i++) {
            houses.add(new Cottage(roomNumber, floorNumber, area));
        }
    }

    public double getRent() {
        double rent = 0;
        for (House house : houses) {
            rent += house.getRent();
        }
        return rent;
    }

    public double getAllLivingArea() {
        double allLivingArea = 0;
        for (House house : houses) {
            allLivingArea += house.getArea();
        }
        return allLivingArea;
    }

    public double getAllPeople() {
        double allPeople = 0;
        for (House house : houses) {
            allPeople += house.getPerson();
        }
        return allPeople;
    }

    public void printStreet() {
        int apartments = 0;
        int townhouses = 0;
        int cottages = 0;
        for (House house : houses) {
            if (house.getClass().getSimpleName().equals("Apartment")) {
                apartments++;
            } else if (house.getClass().getSimpleName().equals("Townhause")) {
                townhouses++;
            } else {
                cottages++;
            }
        }
        System.out.println("Houses on the street:" +
                "\nApartments - " + apartments + ";" +
                "\nTownhouses - " + townhouses + ";" +
                "\nCottages - " + cottages + "." +
                "\n\nTotal rent: " + this.getRent() + " $." +
                "\nTotal living area: " + this.getAllLivingArea() + " sq.m." +
                "\nTotal amount of people: " + this.getAllPeople() + ".");
    }

    public static void main(String[] args) {
        Street lenin = new Street();
        lenin.buildApartment(10, 5, 7);
        lenin.buildApartment(5, 9, 5);
        lenin.buildTownhouse(8, 5, 2, 120);
        lenin.buildTownhouse(5, 7, 3, 150);
        lenin.buildCottage(3, 4, 2, 120);
        lenin.buildCottage(7, 3, 1, 90);
        lenin.printStreet();
    }
}
