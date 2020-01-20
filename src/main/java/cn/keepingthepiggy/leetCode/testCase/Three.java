package cn.keepingthepiggy.leetCode.testCase;

import cn.keepingthepiggy.leetCode.Paramz;
import cn.keepingthepiggy.leetCode.TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * <p>
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * <p>
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class Three extends TestCase {
    @Override
    public void newParam() {
        params = new Paramz[]{new Paramz()};
    }

    @Override
    public void initParam() {
        params[0].str = "abcabcabcabc123451234512345123654123654";
    }
    // abcabcabcabc123451234512345123654123654
    // dvdf

    @Override
    public void test() {
        String s = params[0].str;

        int maxSub = comparator(s, 0, new ArrayList<>());
        System.out.println(maxSub);
    }

    // dvdf    abcabcbb
    // dvdvdfasd
    private int comparator(String s, int maxSub, List currList) {
        currList.clear();
        for (int i = 0; i < s.length(); i++) {
            Character cr = s.charAt(i);
            if (currList.contains(cr)) {
                maxSub = Math.max(comparator(s.substring(s.indexOf(cr)+1,s.length()), Math.max(maxSub, i), currList), i);
                break;
            } else {
                currList.add(cr);
                maxSub = Math.max(currList.size(), i);
            }
        }
        return maxSub;
    }

}
