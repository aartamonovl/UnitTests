package homeworkfinal.controllers;

import homeworkfinal.model.MyList;

import java.util.List;

public class Controller {
    private final MyList myList;

    public Controller() {
        this.myList = new MyList();
    }

    public double averageArray(List<Integer> array) {
        return myList.averageArray(array);
    }

    public void compareArrays(double resultAverage1, double resultAverage2) {
        myList.compareArrays(resultAverage1, resultAverage2);
    }

    public List<Integer> createArray() {
        return myList.createList();
    }
}
