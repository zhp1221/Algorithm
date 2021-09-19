package class02;

import java.util.Arrays;

/**
 * @author: zhanghp
 * @version: 1.0
 */
public class Code03_Comp {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int num = arr[i] > arr[j] ? j : i;
                swap(arr, i, num);
            }
        }
        print(arr);

    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    /**
     * 随机长度，值的数组
     *
     * @param length
     * @param value
     * @return
     */
    public static int[] lenAndValueRandom(int length, int value) {
        int len = (int) (Math.random() * length);
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * value);
        }
        return arr;
    }

    /**
     * arr是指向地址，若直接赋值，则还是排序的，所以新创建
     * @param arr
     * @return
     */
    public static int[] copyArr(int[] arr) {
        int len = arr.length;
        int[] copy = new int[len];
        for (int i = 0; i < len; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    /**
     * 是否为从小到大
     *
     * @param arr
     * @return
     */
    public static boolean isSort(int[] arr) {
        // 边界原则
        if (arr.length < 2) {
            return true;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]) {
                return false;
            }
            max = Math.max(max, arr[i]);
        }
        return true;
    }

    //这是一个main方法，程序的入口
    public static void main(String[] args) {
        int lenMax = 10;
        int valueMax = 100;
        int testTime = 10000;
        for (int i = 0; i < testTime; i++) {
            int[] arr = lenAndValueRandom(lenMax, valueMax);
            int[] copy = copyArr(arr);
            insertSort(arr);
            if (!isSort(arr)) {
                print(copy);
                System.out.println("出错");
                break;
            }
        }
    }
}
