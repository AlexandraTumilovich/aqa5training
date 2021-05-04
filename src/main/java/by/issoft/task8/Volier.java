package by.issoft.task8;

import by.issoft.task8.animals.Animal;

public class Volier extends Cluster{

    public Volier(int area) {
        super(area);
    }

    public void addAnimals(Animal animal, int number) throws MyException {
        this.addItem(animal);
        if (number > 1) {
            for (int i = 0; i < number-1; i++) {
                
            }
        }
    }
}
