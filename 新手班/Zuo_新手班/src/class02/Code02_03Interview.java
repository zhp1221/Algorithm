package class02;

/**
 * 随机机制，只能用fixed()，fixed生成1-5是等概率的
 * 在不改变原有fixed()的基础上得到1-7等概率的
 *
 * @author: zhanghp
 * @version: 1.0
 */
public class Code02_03Interview {
    private static int testTime = 100000;
    private static int count;

    public static void print(int count, int testTime) {
        System.out.println("计算的结果: " + (double) count / (double) testTime);
    }

    /**
     * 测试1-5是否等概率
     */
    public static void test1To5P() {
        count = 0;
        for (int i = 0; i < testTime; i++) {
            int ans = (int) (Math.random() * 5) + 1;
            if (ans == 3) {
                count++;
            }
        }
        print(count, testTime);
    }

    public static int fix() {
        return (int) (Math.random() * 5) + 1;
    }

    /**
     * 加工fix(),
     * 获得等概率的0和1
     *
     * @return 等概率的0, 1
     */
    public static int processFixGet0or1() {
        int ans = 0;
        do {
            ans = fix();
        } while (ans == 3);
        if (ans == 1 || ans == 2) {
            return 0;
        }
        return 1;
    }

    /**
     * 利用processFixGet0or1()
     * 等概率返回0-7
     *
     * @return
     */
    public static int get0To7() {
        return (processFixGet0or1() << 2) + (processFixGet0or1() << 1) + (processFixGet0or1() << 0);
    }

    /**
     * 等概率返回1~7
     * @return
     */
    public static int get1To7() {
        int ans = 0;
        do {
            ans = get0To7();
        } while (ans == 0);
        return ans;
    }

    //这是一个main方法，程序的入口
    public static void main(String[] args) {
        count = 0;
        for (int i = 0; i < testTime; i++) {
            int x = get1To7();
            if (x == 7) {
                count++;
            }
        }
        print(count, testTime);
    }
}
