package homeworkfinal.model;

import homeworkfinal.logger.MyLogger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MyListTest {
    List<Integer> integerList1;
    List<Integer> integerList2;
    MyList myList;
    MyList myListMock;
    double averageList1;
    double averageList2;

    @BeforeEach
    void setUp() {
        myList = new MyList();
        myListMock = mock(MyList.class);
        integerList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        integerList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
        averageList1 = 3.0;
        averageList2 = 3.2;
    }

    /**
     * Mock-тест - проверка метода сравнения средних значений двух списков (средние значения равны)
     */
    @Test
    void compareArrays() {
        double average1 = myList.averageArray(integerList1);
        double average2 = myList.averageArray(integerList2);
        myList.compareArrays(average1, average2);
    }

    /**
     * Unit, Mock-тест - проверка метода вычисления среднего значения списка
     */
    @Test
    void averageArray() {
        assertThat(myList.averageArray(integerList1)).isEqualTo(3);

        when(myListMock.averageArray(integerList1)).thenReturn(averageList1);
    }

    /**
     * Unit, Mock-тест - проверка метода создания списка
     */
    @Test
    void createArray() {
        //проверка на ограничение длины списка равное 10
        assertThat(myList.createList()).hasSize(5);
        //проверка с помощью Mock
        when(myListMock.createList()).thenReturn(integerList2);
    }

    /**
     * Mock-тест - проверка создания нового списка в классе MyList
     */
    @Test
    void createMyList() {
        when(myListMock.createList()).thenReturn(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));

        assertEquals(myListMock.createList(), integerList1);
    }
}