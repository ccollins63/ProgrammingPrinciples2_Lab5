package Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestExercise2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in 5 integers:");

        ArrayList<Integer> list = new ArrayList <>();

        for (int i = 0; i < 5; i++)
        {
            list.add(scan.nextInt());
        }

        System.out.println("Original Array:\t\t" + list);
        ShuffleSort.shuffle(list);
        System.out.println("Shuffled Array:\t\t" + list);
        ShuffleSort.sort(list);
        System.out.println("Sorted Array:\t\t" + list);
    }
}
