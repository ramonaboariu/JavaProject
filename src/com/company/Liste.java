package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramonaboariu on 7/20/2017.
 */
public class Liste {
    //List<Integer> array = new ArrayList<Integer>();

    public void getLista(List<Integer> array , int n) {

    boolean swap1 = true;
    int j = 0;
    int tmp;
        while(swap1)
    {
        swap1 = false;
        j++;
        for (int i = 0; i < array.size() - j; i++) {
            if (array.get(i) > array.get(i + 1)) {
                tmp = array.get(i);
                array.set(i, array.get(i + 1));
                array.set(i + 1, tmp);
                swap1 = true;

            }

        }
        System.out.println(array);

        List<Integer> newArray = new ArrayList<Integer>();

        for (int i = 0; i < array.size(); i++) {
            if (!((i + 1) % n == 0)) {
                newArray.add(array.get(i));

            }

        }
        System.out.println(newArray);
    }


    }
}
