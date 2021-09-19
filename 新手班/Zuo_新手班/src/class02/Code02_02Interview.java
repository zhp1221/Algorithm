package class02;

import java.util.Map;

/**
 * 如果利用Math.random()函数，
 * 把得到[0,x)范围上的数的概率从x调整成x^2
 * @author: zhanghp
 * @version: 1.0
 */
public class Code02_02Interview {
    private static int testTime = 100000;
    private static int count;
    public static void print(int count, int testTime) {
        System.out.println("计算的结果: " + (double) count / (double) testTime);
    }
    public static void xToXPower2(){
        count = 0;
        // p = 1 - x^2
//        for (int i = 0; i < testTime; i++) {
//            if (Math.max(Math.random(), Math.random()) > 0.8) {
//                count ++ ;
//            }
//        }
        // p = x^2
//        for (int i = 0; i < testTime; i++) {
//            if (Math.max(Math.random(), Math.random()) < 0.2) {
//                count ++ ;
//            }
//        }
        // p = 1 - (1-p)^2
//        for (int i = 0; i < testTime; i++) {
//            if (Math.min(Math.random(), Math.random()) < 0.2) {
//                count ++ ;
//            }
//        }
        // p = (1-p)^2
        for (int i = 0; i < testTime; i++) {
            if (Math.min(Math.random(), Math.random()) > 0.2) {
                count ++ ;
            }
        }
        print(count,testTime);
    }

    //这是一个main方法，程序的入口
    public static void main(String[] args) {
        xToXPower2();
        System.out.println(Math.pow(1-0.2, 2));
    }
}
