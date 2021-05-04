package by.issoft.task8;

import java.util.ArrayList;
import java.util.List;

public abstract class Cluster extends Item{
    List<Item> items;

    public Cluster(int area) {
        super(area);
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) throws MyException{
        if(item.area <= this.area){
            items.add(item);
            this.area-=item.area;
            this.cost = items.stream().mapToInt(i->i.cost).sum();
        } else {
            throw new MyException("Too large item!");
        }
    }
}
