package task6;

import java.util.ArrayList;

public class Street {

    private ArrayList<House> houses;

    public Street() {
        houses = new ArrayList<House>();
    }

    public void buildApartment(int number, int floorNumber, int entranceNumber) {
        /*
        Apartment house building.
        number - number of houses to build.
        floorNumber - number of floors in one apartment house.
        entranceNumber - number of entrances in one apartment house.
         */
        for (int i = 0; i < number; i++) {
            houses.add(new Apartment(floorNumber, entranceNumber));
        }
    }

    public void buildTownhouse(int number, int roomNumber, int floorNumber, int area) {
        /*
        Townhause house building.
        number - number of houses to build.
        roomNumber - number of rooms in one half of Townhause.
        floorNumber - number of floors in one Townhause.
        area - area of one half of Townhause.
         */
        for (int i = 0; i < number; i++) {
            houses.add(new Townhause(roomNumber, floorNumber, area));
        }
    }

    public void buildCottage(int number, int roomNumber, int floorNumber, int area) {
        /*
        Cottage house building.
        number - number of houses to build.
        roomNumber - number of rooms in one cottage.
        floorNumber - number of floors in one cottage.
        area - area of one cottage.
         */

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
        Street Lenin = new Street();
        Lenin.buildApartment(10, 5, 7);
        Lenin.buildApartment(5, 9, 5);
        Lenin.buildTownhouse(8, 5, 2, 120);
        Lenin.buildTownhouse(5, 7, 3, 150);
        Lenin.buildCottage(3, 4, 2, 120);
        Lenin.buildCottage(7, 3, 1, 90);
        Lenin.printStreet();
    }
}
