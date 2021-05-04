package by.issoft.task6;

import java.util.ArrayList;

public class Apartment extends House {
    private int flatNumber;
    private int floorNumber;
    private int entranceNumber;
    private ArrayList<Flat> flats;

    public Apartment(int floorNumber, int entranceNumber) {
        flats = new ArrayList<Flat>();

        if (floorNumber > 0 && entranceNumber > 0) {
            this.floorNumber = floorNumber;
            this.entranceNumber = entranceNumber;
            this.flatNumber = floorNumber * entranceNumber * 3;
            for (int i = 0; i < flatNumber / 3; i++) {
                flats.add(new Flat(1));
                flats.add(new Flat(2));
                flats.add(new Flat(3));
            }
        }

    }

    @Override
    public double getRent() {
        double rent = 0;
        for (Flat flat : flats) {
            rent += flat.getRent();
        }
        return rent;
    }
}
