package class02;

/**
 * 给13,17，求其区间内等概率
 *
 * @author: zhanghp
 * @version: 1.0
 */
public class Code02_05Interview {
    private static int testTime = 100000;
    private static int count;

    public static void print(int count, int testTime) {
        System.out.println("计算的结果: " + (double) count / (double) testTime);
    }

    //这是一个main方法，程序的入口
    public static void main(String[] args) {
        count = 0;
        int a = (int)(Math.random()*5) + 13;
        System.out.println(a);
        for (int i = 0; i < testTime; i++) {
            int i1 = (int) (Math.random() * (17 - 13 + 1)) + 13;
            if (i1 == 13) {
                count++;
            }
        }
        print(count, testTime);
//        RandomBox randomBox = new RandomBox(13, 17);
//        count = 0;
//        for (int i = 0; i < testTime; i++) {
//            int x = randomBox.random();
//            if (x == 13) {
//                count++;
//            }
//        }
//        print(count, testTime);
    }

    public static class RandomBox {
        private final int MIN;
        private final int MAX;

        // 初始化时请一定不要让mi==ma
        public RandomBox(int MIN, int MAX) {
            this.MIN = MIN;
            this.MAX = MAX;
        }

        public int random() {
            return MIN + (int) (Math.random() * (MAX - MIN + 1));
        }
    }
}
