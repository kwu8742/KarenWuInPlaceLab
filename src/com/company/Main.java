package com.company;

public class Main {

    public static void main(String[] args) {
        //BubbleSort
        String[] stringArr = Bubble.randomStringArr(10, 3);

        System.out.print("Before: ");
        for (String num : stringArr)
            System.out.print(num + " ");
        System.out.println();

        long time = System.nanoTime();
        String[] beforeStringArr = Bubble.copyStringArr(stringArr);
        Bubble.bubbleSort(stringArr);

        time = System.nanoTime() - time;

        System.out.print("After: ");
        for (String num : stringArr)
            System.out.print(num + " ");

        if (Bubble.isSorted(stringArr)) {
            System.out.println();
            System.out.println("Time taken: " + time);
            System.out.println();
        }
        else {
            System.out.println("Not Sorted Correctly");
        }

        //SelectionSort
        double[] doubleArr = Selection.randomDoubleArr(10);

        System.out.print("Before: ");
        for (double num : doubleArr)
            System.out.print(num + " ");
        System.out.println();

        long timedouble = System.nanoTime();
        double[] beforeDoubleArr = Selection.copyDoubleArr(doubleArr);
        Selection.selectionSort(doubleArr);

        timedouble = System.nanoTime() - timedouble;

        System.out.print("After: ");
        for (double num : doubleArr)
            System.out.print(num + " ");

        if (Selection.isSorted(doubleArr)) {
            System.out.println();
            System.out.println("Time taken: " + timedouble);
            System.out.println("Same Sum: " + Selection.checkSum(beforeDoubleArr, doubleArr));
            System.out.println();
        }
        else {
            System.out.println("Not Sorted Correctly");
        }

        //InsertionSort
        int[] intArr = Insertion.randomIntArr(10);

        System.out.print("Before: ");
        for (int num : intArr)
            System.out.print(num + " ");
        System.out.println();

        long timesort = System.nanoTime();
        int[] beforeIntArr = Insertion.copyIntArr(intArr);
        Insertion.insertionSort(intArr);

        timesort = System.nanoTime() - timesort;

        System.out.print("After: ");
        for (int num : intArr)
            System.out.print(num + " ");

        if (Insertion.isSorted(intArr)) {
            System.out.println();
            System.out.println("Time taken: " + timesort);
            System.out.println("Same Sum: " + Insertion.checkSum(beforeIntArr, intArr));
            System.out.println();
        }
        else {
            System.out.println("Not Sorted Correctly");
        }
    }
}
