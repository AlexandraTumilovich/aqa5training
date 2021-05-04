package by.issoft.task6;

public abstract class House {
    protected int area;
    protected int person;

    public int getArea() {
        return area;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public abstract double getRent();
}
