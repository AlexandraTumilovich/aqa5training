package by.issoft.task6;

public class Cottage extends House  {

    private int roomNumber;
    private int floorNumber;

    public Cottage(int roomNumber, int floorNumber, int area) {

        if(roomNumber > 0 && floorNumber > 0 && area > 0){
            this.roomNumber = roomNumber;
            this.floorNumber = floorNumber;
            this.person = roomNumber * 2;
            this.area = area;
        } else {
            System.out.println("Incorrect parameters!");
        }
    }

    @Override
    public double getRent() {
        return this.area * this.person * 1.2;
    }
}
