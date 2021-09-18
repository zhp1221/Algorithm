package class01;

import java.awt.print.PrinterGraphics;

/**
 * @author: zhanghp
 * @version: 1.0
 */
public class Code01_PrintBinary {
    /**
     * 打印传入整数类型"int"的二进制
     */
    public static void print(int num){
        int result = 0;
        //int -》 4 bytes 32位
        for (int i = 31; i >= 0; i--) {
            // 位运算: "左移" 在 "与" 运算
            System.out.print((num & (1 << i)) == 0 ? 0 : 1 );
        }
        System.out.println();
    }

    //这是一个main方法，程序的入口
    public static void main(String[] args) {
        //二进制引用
//        int a = 1;
//        print(a);

        // 左移例子
//        int b = 123;
//        int c = 123 << 1;
//        print(b << 1);
//        print(c);
//        print(b << 2);
//        print(b << 4);

        // 非负数：int的最大值范围
//        int a = Integer.MAX_VALUE;
//        System.out.println("Max:" + a);
//        print(a);
//
        // 负数：int最小值范围
//        int b = Integer.MIN_VALUE;
//        System.out.println("Min:" + b);
//        print(-1);
//        print(b);

        // 非运算
//        int a = 123;
//        int b = ~a;
//        print(a);
//        print(b);

        // 取反 = ~ + 1
//        int a = 1;
//        int b = -a;
//        print(a);
//        print(b);
//        print(~a + 1);


//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

        // 与，或，与或运算
//        int a = 1;
//        int b = 3;
        // 有1为1
//        print(a | b);
        // 都有1 为 1
//        print(a & b);
        // 相同为0 ，不相同为0
//        print(a ^ b);

        // 有符号右移: 用1填充
//        int a = Integer.MIN_VALUE;
//        print(a >> 1);
        // 无符号右移: 用0填充
//        print(a >>> 1);

        // -a = ~a + 1
//        int a = 10;
//        int b = -10;
//        print(a);
//        print(b);
//        print(~a + 1);

        print(Integer.MIN_VALUE);
        print(~Integer.MIN_VALUE + 1);
        print(0);
        print(~0 + 1);
    }
}
