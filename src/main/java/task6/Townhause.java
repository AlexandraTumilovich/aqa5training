package task6;

public class Townhause extends House {

    Cottage[] hauses;

    public Townhause(int roomNumber, int floorNumber, int area) {
        hauses = new Cottage[]{new Cottage(roomNumber, floorNumber, area), new Cottage(roomNumber, floorNumber, area)};
        this.area = area * 2;
        this.person = hauses[0].person + hauses[1].person;
    }

    @Override
    public double getRent() {
        return hauses[0].getRent() + hauses[1].getRent();
    }
}
