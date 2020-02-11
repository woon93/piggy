package cn.keepingthepiggy.LeetCode;

public abstract class TestCase{
    public Paramz[] params;

    public void newParam() {
        params = new Paramz[]{new Paramz(),new Paramz()};
    };

    public void initParam() {};

    public void test() {};
}
