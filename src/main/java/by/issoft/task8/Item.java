package by.issoft.task8;

public abstract class Item {
    int area;
    int cost;

    public Item(int area) {
        this.area = area;
    }

    public Item(int area, int cost) {
        this.area = area;
        this.cost = cost;
    }
}
