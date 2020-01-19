package cn.keepingthepiggy.leetCode.testCase;

import cn.keepingthepiggy.leetCode.Paramz;
import cn.keepingthepiggy.leetCode.TestCase;
import sun.rmi.server.InactiveGroupException;

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
public class ThreeAlter extends TestCase {
    @Override
    public void newParam() {
        params = new Paramz[]{new Paramz()};
    }

    @Override
    public void initParam() {
        params[0].str = "abcabcabcabc123451234512345123654123654";
    }
    // abcabcabcabc123451234512345123654123654

    @Override
    public void test() {
        String s = params[0].str;

        String sub = compent(s);

        System.out.println(sub);
    }

    private String compent(String s) {
        String subs = "";
        StringBuilder sb = new StringBuilder("");
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character cr = s.charAt(i);
            if (map.get(cr) != null) {
                sb.setLength(0);
                i = compare(map, sb, s, i);
                if (subs.length() < sb.length()) {
                    subs = sb.toString();
                }
            } else {
                map.put(cr, i);
            }
        }

//        return subs;

        if (!"".equals(subs) && subs.length() > 2) {
            s = compent(subs);
        } else {
            return s;
        }
        return s;
    }

    private int compare(Map<Character, Integer> map, StringBuilder sb, String s, int i) {
        sb.append(s.charAt(i));
        int front = map.get(s.charAt(i));
        if (i < s.length() - 1 && s.charAt(front + 1) == s.charAt(i + 1)) {
            i = compare(map, sb, s, i + 1);
        } else {
            return i;
        }
        return i;
    }
}
