package class02;

import java.util.Arrays;

/**
 * 前缀和
 *
 * @author: zhanghp
 * @version: 1.0
 */
public class Code01_PreSum {
    /**
     * 打印数组
     *
     * @param arr
     */
    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    //这是一个main方法，程序的入口
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        // 方式1: 寻址相加
        RangeSum1 rs1 = new RangeSum1();
        int i1 = rs1.rangeSum(arr, 1, 2);
        System.out.println("寻址累加: " + i1);
        // 方式2: 前缀和
        RangeSum2 rs2 = new RangeSum2();
        int i2 = rs2.queryRangeSum(rs2.createPreSum(arr), 1, 2);
        System.out.println("前缀和: " + i2);


    }

    /**
     * 寻址相加
     */
    public static class RangeSum1 {
        private int sum = 0;

        public int rangeSum(int[] arr, int L, int R) {
            for (int i = L; i <= R; i++) {
                sum += arr[i];
            }
            return sum;
        }
    }

    /**
     * 前缀和
     */
    public static class RangeSum2 {
        private int[] preArr;

        /**
         * 创建前缀和数组
         *
         * @param arr
         * @return
         */
        public int[] createPreSum(int[] arr) {
            int N = arr.length;
            preArr = new int[N];
            preArr[0] = arr[0];
            int preArrSum = 0;
            for (int i = 1; i < N; i++) {
                preArr[i] = preArr[i - 1] + arr[i];
            }
            return preArr;
        }

        /**
         * 计算某一段数组之间的累加
         *
         * @param arr
         * @param L
         * @param R
         * @return
         */
        public int queryRangeSum(int[] arr, int L, int R) {
            return L == 0 ? arr[R] : arr[R] - arr[L - 1];
        }
    }
}
