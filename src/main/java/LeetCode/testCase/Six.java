package LeetCode.testCase;

import LeetCode.TestCase;

/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * <p>
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * <p>
 * 请你实现这个将字符串进行指定行数变换的函数：
 * <p>
 * string convert(string s, int numRows);
 * 示例 1:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 * <p>
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 */
public class Six extends TestCase {
    @Override
    public void newParam() {
        super.newParam();
    }

    @Override
    public void initParam() {
        params[0].str = "LEETCODEISHIRING";
        params[0].target = 4;
    }

    @Override
    public void test() {
        String s = params[0].str;
        int numRows = params[0].target;

        if (s == null || "".equals(s))
            return;

        if (numRows < 1)
            numRows = 1;

        if (numRows > s.length())
            numRows = s.length();

        StringBuilder[] sbArry = new StringBuilder[numRows];
        char[] charArry = s.toCharArray();
        int step = 0;
        boolean sign = true;
        for (char c : charArry) {
            if (sbArry[step] == null)
                sbArry[step] = new StringBuilder();

            sbArry[step].append(c);

            if (numRows == 1)
                continue;
            if (step == 0)
                sign = true;
            if (step == numRows-1)
                sign = false;

            if (sign)
                step++;
            else
                step--;
        }
        for (int i = 1; i < sbArry.length; i++) {
            sbArry[0].append(sbArry[i]);
        }

        System.out.println(sbArry[0].toString());
        return;
    }

}
