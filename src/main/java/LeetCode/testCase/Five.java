package LeetCode.testCase;

import LeetCode.TestCase;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class Five extends TestCase {
    @Override
    public void newParam() {
        super.newParam();
    }

    @Override
    public void initParam() {
        params[0].str = "";
    }

    @Override
    public void test() {
        String s = params[0].str;

        StringBuilder rs = new StringBuilder();
        int model = 0, count, start, temp, step;
        int[] idx = new int[]{0, 0};

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 多中心的情况
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                count = 0;
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j - 1) != s.charAt(j)) {
                        break;
                    }
                    count++;
                }
                idx[0] = i - 1;
                idx[1] = i + count - 1;
                i = idx[1];
            }
            // 单中心的情况
            else if (i > 1 && s.charAt(i) == s.charAt(i - 2)) {
                idx[0] = i - 1;
                idx[1] = i - 1;
            }

            //拿到对称中心，开始对比
            step = 0;
            start = idx[0] - 1;
            for (int j = idx[1] + 1; j < s.length(); j++) {
                if (start < 0 || s.charAt(start) != s.charAt(j))
                    break;
                start--;
                step++;
            }
            temp = (idx[1] - idx[0] + 1) + step * 2;
            if (temp > model) {
                model = temp;
                rs.setLength(0);
                rs.append(s.substring(idx[0]-step,idx[1]+step+1));
            }
        }
        System.out.println(rs.toString());
        return;
    }

}
