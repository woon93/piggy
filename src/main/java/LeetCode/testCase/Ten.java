package LeetCode.testCase;

import LeetCode.TestCase;

/**
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 * <p>
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 * <p>
 * 说明:
 * <p>
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
 * 示例 1:
 * <p>
 * 输入:
 * s = "aa"
 * p = "a"
 * 输出: false
 * 解释: "a" 无法匹配 "aa" 整个字符串。
 * 示例 2:
 * <p>
 * 输入:
 * s = "aa"
 * p = "a*"
 * 输出: true
 * 解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
 * 示例 3:
 * <p>
 * 输入:
 * s = "ab"
 * p = ".*"
 * 输出: true
 * 解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
 * 示例 4:
 * <p>
 * 输入:
 * s = "aab"
 * p = "c*a*b"
 * 输出: true
 * 解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
 * 示例 5:
 * <p>
 * 输入:
 * s = "mississippi"
 * p = "mis*is*p*."
 * 输出: false
 */
public class Ten extends TestCase {
    @Override
    public void newParam() {
        super.newParam();
    }

    @Override
    public void initParam() {
        params[0].str = "wsaayaab";
        params[1].str = "wsaac*ya*b";
    }

    @Override
    public void test() {
        String s = params[0].str;
        String p = params[1].str;

        if (s.length() != p.length() && (s.length() == 0 || p.length() == 0)) {
            System.out.println(false);
            return;
        }

        char[] targets = s.toCharArray();
        char[] regexs = p.toCharArray();
        int i = targets.length - 1, j = regexs.length - 1;
        boolean result = doCompare(targets, regexs, i, j);
        System.out.println(result);
    }

    private boolean doCompare(char[] targets, char[] regexs, int i, int j) {
        while (i > 0 && j > 0 && isEq(targets[i], regexs[j])) {
            i--;
            j--;
        }
        if (i > 0 && j > 0 && regexs[j] == '*') {
            j--;
            if (regexs[j] == '.') {
                j--;
                while (i > 0) {
                    if (doCompare(targets, regexs, i, j)) {
                        return true;
                    } else {
                        i--;
                    }
                }
            } else {
                int n = 0;

                while (j > 0 && (regexs[j] == regexs[j - 1]) || regexs[j - 1] == '*') {
                    j--;
                    if (regexs[j] != '*') {
                        n++;
                    } else {
                        if (j < 0) {
                            System.err.println("input grammatical mistake !!! ");
                            return false;
                        }
                        if (regexs[j - 2] != regexs[j + 1]) {
                            j++;
                            break;
                        }
                        j = j - 2;

                    }
                }

                while (i >= 0 && regexs[j] == targets[i]) {
                    i--;
                }
                i = i + n;
                j--;
                return doCompare(targets, regexs, i, j);
            }
        }
        if (i == 0) {
            if (j > 0) {
                while (j > 0) {
                    if (regexs[j] == '*') {
                        j = j - 2;
                    } else {
                        break;
                    }
                }
                if (j != -1) {
                    return false;
                } else {
                    return true;
                }
            }
            if (j == 0 && targets[i] == regexs[j]) {
                return true;
            }
        }
        return false;
    }


    private boolean isEq(char target, char regex) {
        if (regex == target || regex == '.') {
            return true;
        }
        return false;
    }


    public void test02() {
        String s = params[0].str;
        String p = params[1].str;

        if (s.length() != p.length() && (s.length() == 0 || p.length() == 0)) {
            System.out.println(false);
            return;
        }

        char[] targets = s.toCharArray();
        char[] regexs = p.toCharArray();
        int i = 0, j = targets.length - 1;
        int x = 0, y = regexs.length - 1;
        boolean step = true, repeat = false;

        while (i < j && x < y) {
            if (step) {
                if (regexs[x] == targets[i] || regexs[x] == '.') {
                    i++;
                    x++;
                } else if (regexs[x] == '*') {
                    if (regexs[x - 1] == '.') {
                        if (!repeat) {
                            x++;
                            while (x < y && regexs[x] == targets[i]) {
                                i++;
                            }
                            step = false;
                        } else {
                            step = false;
                        }
                    } else {
                        x++;
                        while (x < y && i < j && regexs[x] == targets[i]) {
                            i++;
                        }
                    }
                } else {
                    System.out.println(false);
                    return;
                }
            } else {
                if (regexs[y] == targets[j] || regexs[y] == '.') {
                    j--;
                    y--;
                } else if (regexs[y] == '*') {
                    if (regexs[y - 1] == '.') {
                        if (!repeat) {
                            j++;
                            y++;
                            step = true;
                            repeat = true;
                        } else {
                            repeat = false;


                        }
                    } else {
                        y--;
                        while (y > x && j > i && regexs[y] == targets[j]) {
                            j--;
                        }
                    }

                } else {
                    System.out.println(false);
                    return;
                }
            }
        }
    }


    public void testDemo() {
        String s = params[0].str;
        String p = params[1].str;

        if (s.length() != p.length() && (s.length() == 0 || p.length() == 0)) {
            System.out.println(false);
            return;
        }

        char[] targets = s.toCharArray();
        char[] regexs = p.toCharArray();
        int j = regexs.length - 1;
        for (int i = targets.length - 1; i >= 0; i--) {
            if (regexs[j] == targets[i] || (regexs[j] == '.' && i > 0)) {
                j--;
            } else if (regexs[j] == '*') {
                j--;
                if (j > -1) {
                    if (regexs[j] == '.') {
                        if (j == 0) {
                            System.out.println(true);
                            return;
                        }
                        j--;
                        while (i > 0 && targets[i - 1] == targets[i]) {
                            i--;
                        }
                    } else {
                        while (i >= 0 && regexs[j] == targets[i]) {
                            i--;
                        }
                        j--;
                        continue;
                    }
                }
            }
            if (j < 0 && i != 0 || i < 0 && j != 0) {
                System.out.println(false);
                return;
            }
        }
        if (j > 0) {
            j--;
            while (j >= 0) {
                if (regexs[j] != '*') {
                    System.out.println(false);
                    return;
                }
                j = j - 2;
            }
        }
        System.out.println(true);
        return;
    }


    public void testError() {
        String s = params[0].str;
        String p = params[1].str;

        if (s.length() != p.length() && (s.length() == 0 || p.length() == 0)) {
            System.out.println(false);
            return;
        }

        char[] targets = s.toCharArray();
        char[] regexs = p.toCharArray();
        int j = 0;

        for (int i = 0; i < targets.length; i++) {
            if (regexs[j] == '.') {
                j++;
                if (j < regexs.length && regexs[j] == '*') {
                    if (j == regexs.length - 1 || i == targets.length - 1) {
                        System.out.println(true);
                        return;
                    }
                    /**
                     * 遇到.*组合应该逆序匹配
                     */
                    j++;
                    while (regexs[j] != targets[i] && regexs[j] != '.') {
                        i++;
                    }
                }
            } else if (regexs[j] == '*') {
                while (i < targets.length - 1 && regexs[j - 1] == targets[i + 1]) {
                    i++;
                }
                j++;
            } else if (targets[i] == regexs[j]) {
                j++;
            } else {
                if (j < regexs.length - 1 && regexs[j + 1] != '*') {
                    System.out.println(false);
                    return;
                }
                j = j + 2;
            }
            if (j >= regexs.length && i < targets.length - 1 || i >= targets.length && j < regexs.length - 1) {
                System.out.println(false);
                return;
            }
        }
        if (j != regexs.length) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        return;
    }

    /**
     * 不符合题意
     * '*'当作通配符处理了
     */
    public void wildcardDemo() {
        String s = params[0].str;
        String p = params[1].str;

        if (s.length() != p.length() && (s.length() == 0 || p.length() == 0)) {
            System.out.println(false);
            return;
        }

        char[] targets = s.toCharArray();
        char[] regexs = p.toCharArray();
        int j = 0;

        for (int i = 0; i < targets.length; i++) {
            if (j == regexs.length) {
                System.out.println(false);
                return;
            }
            if (regexs[j] == '*') {
                for (int k = j + 1; k < regexs.length; k++) {
                    if (regexs[k] != '.' && regexs[k] != '*') {
                        break;
                    }
                    if (regexs[k] == '.') {
                        if (i == targets.length - 1 && k != regexs.length - 1) {
                            System.out.println(false);
                            return;
                        }
                        i++;
                    }
                    if (k == regexs.length - 1) {
                        System.out.println(true);
                        return;
                    }
                    j++;
                }
                continue;
            }
            if (targets[i] == regexs[j] || regexs[j] == '.') {
                j++;
            } else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        return;
    }
}
