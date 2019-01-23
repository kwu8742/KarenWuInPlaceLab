package com.company;

public class Selection {
    public static double[] randomDoubleArr(int count){
        double[] randomDoubleArr = new double[count];
        for(int n = 0; n < count - 1; n++){
            randomDoubleArr[n] = (Math.random() * 1001);
            randomDoubleArr[n] = Math.round(randomDoubleArr[n] + 100.0) / 100.0;
        }
        return randomDoubleArr;
    }

    public static double[] copyDoubleArr(double[] doubleArr)
    {
        double[] copyDoubleArr = new double[10];
        for (int n = 0; n < doubleArr.length ; n++) {
            copyDoubleArr[n] = doubleArr[n];
        }
        return copyDoubleArr;
    }

    public static double[] selectionSort(double[] doubleArr) {
        int lowest;
        for (int i = 0; i < doubleArr.length - 1; i++) {
            lowest = i;
            for (int j = 1; j < doubleArr.length - i; j++) {
                if (doubleArr[lowest] > doubleArr[i + j]) {
                    lowest = i + j;
                }
            }
            swap(doubleArr, i, lowest);
        }
        return doubleArr;
    }

    public static void swap(double[] doubleArr, int i, int j) {
        double temp = doubleArr[i];
        doubleArr[i] = doubleArr[j];
        doubleArr[j] = temp;
    }

    public static boolean isSorted(double[] doubleArr)
    {
        for (int n = 0; n < doubleArr.length - 1; n++) {
            if (doubleArr[n] > doubleArr[n + 1]) {
                swap(doubleArr, n, n + 1);
            }
        }
        return true;
    }

    public static boolean checkSum(double[] before, double[] after) {
        double beforesum = 0.0;
        double aftersum = 0.0;
        for (int b = 0; b < before.length; b++) {
            beforesum = beforesum + before[b];
        }
        for (int a = 0; a < after.length; a++) {
            aftersum = aftersum + after[a];
        }
        if (aftersum == beforesum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
