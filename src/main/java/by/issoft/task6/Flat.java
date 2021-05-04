package by.issoft.task6;

public class Flat extends House {

    int roomNumber;

    public Flat(int room) {
        if (room > 0) {
            this.roomNumber = room;
            this.area = room * 20 + 20;
            this.person = room * 2;
        } else {
            System.out.println("Incorrect room number!");
        }
    }

    @Override
    public double getRent() {
        return this.area * this.person;
    }
}
