package com.company;

public class Bubble {
    public static String[] randomStringArr(int count, int letters)
    {
        String[] randomStringArr = new String[count];
        while (count > 0)
        {
            String x = " ";
            for (int i = 0; i < letters; i++)
            {
                char y = (char) ((Math.random() * 26) + 97);
                x = x + y;
            }
            count--;
            randomStringArr[count] = x;
        }
        return randomStringArr;
    }

    public static String[] copyStringArr(String[] StringArr)
    {
        String[] copyStringArr = new String[10];
        for (int n = 0; n < StringArr.length ; n++) {
            copyStringArr[n] = StringArr[n];
        }
        return copyStringArr;
    }

    public static String[] bubbleSort(String[] StringArr){
        for(int n = 0; n < StringArr.length - 1; n++){
            if (0 > StringArr[n + 1].compareTo(StringArr[n])) {
                swap(StringArr, n, n + 1);
                n = -1;
            }
        }
        return StringArr;
    }

    public static void swap(String[] StringArr, int x, int y)
    {
        String temp = StringArr[x];
        StringArr[x] = StringArr[y];
        StringArr[y] = temp;
    }

    public static boolean isSorted(String[] StringArr)
    {
        for (int n = 0; n < StringArr.length - 1; n++)
        {
            if (0 > StringArr[n+1].compareTo(StringArr[n]))
            {
                swap(StringArr, n, n + 1);
            }
        }
        return true;
    }
}
