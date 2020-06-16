package LeetCode.testCase;

import LeetCode.TestCase;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class Nine extends TestCase {
    @Override
    public void newParam() {
        super.newParam();
    }

    @Override
    public void initParam() {
        params[0].target = 112;
    }

    @Override
    public void test() {
        int x = params[0].target;
        if (x < 0) {
            System.out.println(false);
            return;
        }
        if (x < 10) {
            System.out.println(true);
            return;
        }
        int y = 0, z = x;
        while (z != 0) {
            y = y * 10 + z % 10;
            z = z / 10;
        }
        if (x == y) {
            System.out.println(true);
            return;
        } else {
            System.out.println(false);
            return;
        }
    }

}
