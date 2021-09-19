package class02;

/**
 * 01不等概率随机到01等概率随机
 *
 * @author: zhanghp
 * @version: 1.0
 */
public class Code02_04Interview {
    private static int testTime = 100000;
    private static int count;

    public static void print(int count, int testTime) {
        System.out.println("计算的结果: " + (double) count / (double) testTime);
    }

    /**
     * 测试0,1 的概率
     */
    public static void test0Or1P() {
        count = 0;
        for (int i = 0; i < testTime; i++) {
            int ans = Math.random() < 0.84 ? 0 : 1;
            if (ans == 1) {
                count++;
            }
        }
        print(count, testTime);
    }

    // 你只能知道，x会以固定概率返回0和1，但是x的内容，你看不到！
    public static int fix() {
        return Math.random() < 0.84 ? 0 : 1;
    }

    /**
     * 加工fix(), 获得等概率的0和1
     *
     * @return 等概率的0, 1
     */
    public static int processFixGet0or1() {
        int ans = 0;
        do {
            ans = fix();
        } while (ans == fix());
        return ans;
    }

    //这是一个main方法，程序的入口
    public static void main(String[] args) {
        count = 0;
        for (int i = 0; i < testTime; i++) {
            int x = processFixGet0or1();
            if (x == 1) {
                count++;
            }
        }
        print(count, testTime);
    }
}
