package homeworkfinal.model;

import homeworkfinal.logger.MyLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyList implements IList {
    Random random = new Random();
    MyLogger logger = new MyLogger();

    public List<Integer> createList() {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integerList.add(random.nextInt(0,10));
        }
        logger.showMessage(integerList.toString());
        return integerList;
    }

    @Override
    public void compareArrays(double resultList1, double resultList2) {
        String result = "";
        if (resultList1 > resultList2) {
            result = "Первый список имеет большее среднее значение";
        } else if (resultList1 < resultList2) {
            result = "Второй список имеет большее среднее значение";
        } else {
            result = "Средние значения равны";
        }
        logger.showMessage(result);
    }

    @Override
    public double averageArray(List<Integer> integerList) {
        double sum = 0;
        for (int number : integerList) {
            sum += number;
        }
        double resultAverage = sum / integerList.size();
        logger.showMessage("Среднее значение: " + resultAverage);
        return resultAverage;
    }
}
