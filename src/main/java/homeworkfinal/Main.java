package homeworkfinal;

import homeworkfinal.controllers.Controller;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        List<Integer> integerList1 = controller.createArray();
        List<Integer> integerList2 = controller.createArray();

        double averageList1 = controller.averageArray(integerList1);
        double averageList2 = controller.averageArray(integerList2);

        controller.compareArrays(averageList1, averageList2);
    }
}
