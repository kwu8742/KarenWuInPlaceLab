package com.company;

public class Insertion {
    public static int[] randomIntArr(int count){
        int[] randomIntArr = new int[count];
        for(int n = 0; n < count - 1; n++){
            randomIntArr[n] = (int)(Math.random()*1001);
        }
        return randomIntArr;
    }

    public static int[] copyIntArr(int[] intArr)
    {
        int[] copyIntArr = new int[10];
        for (int n = 0; n < intArr.length ; n++) {
            copyIntArr[n]= intArr[n];
        }
        return copyIntArr;
    }

    public static int[] insertionSort(int[] intArr){

        for(int x = 1; x < intArr.length; x++){
            for(int y = x; y > 0; y--){

                if (intArr[y] < intArr[y-1])
                {
                    swap(intArr, y,y-1);
                }
            }
        }
        return intArr;
    }

    public static void swap(int[] intArr, int x, int y){
        int temp;
        temp = intArr[x];
        intArr[x] = intArr[y];
        intArr[y] = temp;
    }

    public static boolean isSorted(int[] intArr)
    {
        for (int n = 0; n < intArr.length - 1; n++) {
            if (intArr[n] > intArr[n + 1]) {
                swap(intArr, n, n + 1);
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after) {
        int beforesum = 0;
        int aftersum = 0;
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
