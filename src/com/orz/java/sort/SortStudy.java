package com.orz.java.sort;

public class SortStudy {
    private static final int[] ARRAY = {10, 2, 4, 8, 81, 13, 25, 0, 5, 62};

    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        //外层循环一次为一趟排序
        for (int i = 0; i < array.length; i++) {
            //设置标识，判断这趟排序是否发生了交换，如果未发生交换，则说明数组已经有序，不必再排序了
            boolean isSwap = false;
            //内层循环一次为一次相邻比较
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.print("before: ");
        printArray(ARRAY);
        int[] array = bubbleSort(ARRAY);
        System.out.print("after: ");
        printArray(array);
    }

    private static void printArray(final int[] array) {
        if (array == null) {
            return;
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
