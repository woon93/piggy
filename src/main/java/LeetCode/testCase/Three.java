package LeetCode.testCase;

import LeetCode.Paramz;
import LeetCode.TestCase;

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
        params[0].str = "dvdf";
    }
    // abcabcabcabc123451234512345123654123654
    // dvdf
    // aqwaerwtyqdfxvb

    @Override
    public void test() {
        String s = params[0].str;

        int maxSub = 0;
//        maxSub = recursion(s, 0, new ArrayList<>());
//        maxSub = comparator(s);
        maxSub = fiveMs(s);
//        maxSub = twoMs(s);
        System.out.println(maxSub);
    }

    // 递归解法
    private int recursion(String s, int maxSub, List<Character> currList) {
        currList.clear();
        for (int i = 0; i < s.length(); i++) {
            Character cr = s.charAt(i);
            if (currList.contains(cr)) {
                maxSub = Math.max(recursion(s.substring(s.indexOf(cr) + 1, s.length()), Math.max(maxSub, i), currList), i);
                break;
            } else {
                currList.add(cr);
                maxSub = i + 1;
            }
        }
        return maxSub;
    }

    // 列表映射解法
    private int comparator(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int startIdx = 0;
        int dist = 0;
        for (int i = 0; i < s.length(); i++) {
            Character cr = s.charAt(i);
            Integer preIdx = map.get(cr);
            if (preIdx != null ) {
                startIdx = Math.max(startIdx, preIdx + 1);
            }
            map.put(cr, i);
            dist = Math.max(dist, i - startIdx + 1);
        }
        return dist;
    }


    // 5ms -> 把map用数组实现了
    public int fiveMs(String s) {
        int l = 0, r = 0;
        int[] freq = new int[256];
        int res = 0;
        while (r < s.length()) {
            l = Math.max(l, freq[s.charAt(r)]);
            freq[s.charAt(r)] = ++r;
            res = Math.max(res, r - l);
        }
        return res;
    }


    // 2ms 把map的get和put用循环实现
    public int twoMs(String s) {
        char[] chars = s.toCharArray();
        int leftIndex = 0;
        int maxLength = 0;
        for (int j = 0; j < chars.length; j++) {
            for (int innerIndex = leftIndex; innerIndex < j; innerIndex++) {
                if (chars[innerIndex] == chars[j]) {
                    maxLength = Math.max(maxLength, j - leftIndex);
                    leftIndex = innerIndex + 1;
                    break;
                }
            }
        }
        return Math.max(chars.length - leftIndex, maxLength);
    }
}
