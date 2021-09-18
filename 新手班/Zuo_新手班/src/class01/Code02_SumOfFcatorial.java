package class01;

/**
 * 1! + 2! + 3! + ... + N!
 * @author: zhanghp
 * @version: 1.0
 */
public class Code02_SumOfFcatorial {
    // factorial
    public static int factorial(int fc){
        int fcNum = 1;
        for (int i = 1; i <= fc; i++) {
            fcNum *= i;
        }
        return fcNum;
    }
    // Method1: 一个一个算
    public static int method1(int N){
        int result = 0;
        for (int i = 1; i <= N; i++) {
            result += factorial(i);
        }
        return result;
    }
    // Method2: 2! = 1!*2  3! = 2!*3 ... N! = (N-1)!*N
    public static int method2(int N){
        int result = 0;
        int cur = 1;
        for (int i = 1; i <= N; i++) {
            cur *= i;
            result += cur;
        }
        return result;
    }

    //这是一个main方法，程序的入口
    public static void main(String[] args) {
        int i = method1(3);
        System.out.println(i);
        int b = method2(3);
        System.out.println(b);
    }
}
