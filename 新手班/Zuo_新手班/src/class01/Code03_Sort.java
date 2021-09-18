package class01;

import java.util.Arrays;

/**
 * @author: zhanghp
 * @version: 1.0
 */
public class Code03_Sort {
    public static int[] rand(){
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // 选择排序
    public static void selectSort(int[] arr) {
        // 边界原则
        if (arr == null || arr.length < 2) {
            return;
        }
        // 缩小边界
        for (int i = 0; i < arr.length; i++) {
            int minValueIndex = i;
            // 和第i个逐一对比 j=i也对，交换的是0,0
            for (int j = i+1; j < arr.length; j++) {
                int num = arr[minValueIndex] > arr[j] ?  j : minValueIndex;
                swap(arr, i, num);
            }
        }
    }

    // 冒泡排序
    public static void bubbleSort1(int[] arr) {
        // 边界原则
        if (arr == null || arr.length < 2) {
            return;
        }
        // 缩小边界
        for (int i = arr.length - 1 ; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                int num = arr[j-1] > arr[j] ? j : j-1;
                swap(arr, j-1, num);
            }
        }
    }
    public static void bubbleSort2(int[] arr) {
        // 边界原则
        if (arr == null || arr.length < 2) {
            return;
        }
        // 缩小边界
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                int num = arr[j] > arr[j+1] ? j+1 : j;
                swap(arr, j, num);
            }
        }
    }

    // 左神
    public static void bubbleSort3(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = N - 1; end >= 0; end--) {
            for (int second = 1; second <= end; second++) {
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second - 1, second);
                }
            }
        }
    }

    // 插入排序
    public static void insertSort1(int[] arr) {
        // 边界原则
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int num = arr[j] < arr[i] ? j : i;
                swap(arr, j, num);
            }
        }
    }

    // 左神
    public static void insertSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            int newNumIndex = end;
            while (newNumIndex - 1 >= 0 && arr[newNumIndex - 1] > arr[newNumIndex]) {
                swap(arr, newNumIndex - 1, newNumIndex);
                newNumIndex--;
            }
        }
    }

    // 左神2.0
    public static void insertSort3(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int pre = i - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                swap(arr, pre, pre+1);
            }
        }
    }
    // 错的
    public static void insertSort4(int[] arr) {
        // 边界原则
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int num = arr[j] < arr[i] ? j : i;
                swap(arr, j, num);
            }
        }
    }
    //这是一个main方法，程序的入口
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,0,9,1,5,6};
//        selectSort(arr);
        insertSort3(arr);
        System.out.println(Arrays.toString(arr));
//        bubbleSort1(arr);
//        bubbleSort2(arr);
//        inserSort1(arr);
//        long start = System.currentTimeMillis();
//        insertSort1(arr);
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
//        start = System.currentTimeMillis();
//        insertSort2(arr);
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//        System.out.println(Arrays.toString(arr));
    }
}
