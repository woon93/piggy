package LeetCode.testCase;

import LeetCode.TestCase;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *
 * 示例 2:
 *
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 */
public class Seven extends TestCase {
    @Override
    public void newParam() {
        super.newParam();
    }

    @Override
    public void initParam() {
        params[0].target = -123;
    }

    @Override
    public void test() {
        int x = params[0].target;
//        long n = 0;
//        while(x != 0) {
//            n = n*10 + x%10;
//            x = x/10;
//        }
//        System.out.println((int)n==n? (int)n:0);

        long y = 0;
        while(x != 0){
            y = y * 10 + x % 10;
            x = x / 10;
        }
        System.out.println((int) y == y ? (int) y : 0);
        return;
    }

}
