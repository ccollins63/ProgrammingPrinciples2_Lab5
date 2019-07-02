package Exercise2;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleSort
{
    public static void shuffle(ArrayList<Integer> list)
    {
        Collections.shuffle(list);
    }

    public static void sort(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size() - 1; i++) {
            int currentMin = list.get(i);
            int currentIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin > list.get(j)) {
                    currentMin = list.get(j);
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                list.set(currentIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}
