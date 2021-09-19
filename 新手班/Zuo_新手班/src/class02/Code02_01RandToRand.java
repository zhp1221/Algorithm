package class02;

/**
 * Math 使用
 *
 * @author: zhanghp
 * @version: 1.0
 */
public class Code02_01RandToRand {
    private static int testTime = 100000;
    private static int count;
    public static void print(int count, int testTime) {
        System.out.println("计算的结果: " + (double) count / (double) testTime);
    }

    private static int[] MathRandomTestP3Arr;
    //这是一个main方法，程序的入口

    public static void main(String[] args) {
//        MathRandomTestP1.mathRandomP(0.23);
        MathRandomTestP2.mathRandomP(8, 4.7);
//        MathRandomTestP3.mathRandomP(6);
    }

    /**
     * 测试Math.random的[0,1)概率
     */
    public static class MathRandomTestP1 {
        public static void mathRandomP(double a) {
            // 边界原则
            if (a >= 1 && a < 0) {
                System.out.println("输入0-1之间的小数");
                return;
            }
            count = 0;
            for (int i = 0; i < testTime; i++) {
                if (Math.random() < a) {
                    count++;
                }
            }
            print(count, testTime);
            System.out.println(a + "/" + 1 + " : " + a / (double) 1);

        }
    }

    /**
     * 测试Math.random*a的[0,a)概率
     */
    public static class MathRandomTestP2 {
        public static void mathRandomP(int a, double b) {
            // 重置count 防止其他类用完没回归为0
            count = 0;
            for (int i = 0; i < testTime; i++) {
                if (Math.random() * a < b) {
                    count++;
                }
            }
            print(count, testTime);
            System.out.println(b + "/" + a + " : " + b / (double) a);

        }
    }

    /**
     * 测试 数组 Math.random
     * 测试结果：等概率的
     */
    public static class MathRandomTestP3{
        public static void mathRandomP(int arrlengthAndRange){
            MathRandomTestP3Arr = new int[arrlengthAndRange];
            for (int i = 0; i < testTime; i++) {
                int ans = (int)(Math.random()*arrlengthAndRange);
                MathRandomTestP3Arr[ans]++;
            }
            for (int i = 0; i < arrlengthAndRange; i++) {
                System.out.println(i + "出现了: " + MathRandomTestP3Arr[i] + "次");
            }
        }
    }
}
