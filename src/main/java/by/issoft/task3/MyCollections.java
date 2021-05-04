package by.issoft.task3;

import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class MyCollections {

    public ArrayList<String> intersection(ArrayList<String> arr1, ArrayList<String> arr2) {
        ArrayList<String> arr3 = new ArrayList<String>();
        for (String s : arr1) {
            if (arr2.contains(s)) {
                arr3.add(s);
            }
        }
        return arr3;
    }

    public ArrayList<String> symmetricDifference(ArrayList<String> arr1, ArrayList<String> arr2) {
        ArrayList<String> arr3 = new ArrayList<String>();
        for (String s : arr1) {
            if (!arr2.contains(s)) {
                arr3.add(s);
            }
        }
        for (String s : arr2) {
            if (!arr1.contains(s)) {
                arr3.add(s);
            }
        }
        return arr3;
    }

    public ArrayList<String> union(ArrayList<String> arr1, ArrayList<String> arr2) {
        ArrayList<String> arr3 = new ArrayList<String>(arr1);
        for (String s : arr2) {
            if (!arr1.contains(s)) {
                arr3.add(s);
            }
        }
        return arr3;
    }

    public ArrayList<String> subtract(ArrayList<String> arr1, ArrayList<String> arr2) {
        ArrayList<String> arr3 = new ArrayList<String>();
        for (String s : arr1) {
            if (!arr2.contains(s)) {
                arr3.add(s);
            }
        }
        return arr3;
    }

    public void printCollection(ArrayList<String> arr1) {
        for (int i = 0; i < arr1.size(); i++) {
            if (i < arr1.size() - 1) {
                System.out.print(arr1.get(i) + ", ");
            } else {
                System.out.print(arr1.get(i));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyCollections c1 = new MyCollections();
        ArrayList<String> a1 = new ArrayList<String>(Arrays.asList("Anna", "Olga", "Alex", "Vasya", "Ivan", "Stepa"));
        ArrayList<String> a2 = new ArrayList<String>(Arrays.asList("Anna", "Olga", "Kolya", "Nastya", "Ivan", "Ira"));

        c1.printCollection(c1.intersection(a1, a2));
        c1.printCollection(c1.symmetricDifference(a1, a2));
        c1.printCollection(c1.union(a1, a2));
        c1.printCollection(c1.subtract(a1, a2));


        System.out.println("\nStandard library: ");
        c1.printCollection(new ArrayList<String>(ListUtils.intersection(a1,a2)));
        c1.printCollection(new ArrayList<String>(ListUtils.subtract(a1,a2)));
    }
}
