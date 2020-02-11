package cn.keepingthepiggy.LeetCode.testCase;




import cn.keepingthepiggy.LeetCode.Paramz;
import cn.keepingthepiggy.LeetCode.TestCase;

import java.util.*;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 *
 */
public class One extends TestCase {
    @Override
    public void newParam() {
        params = new Paramz[]{new Paramz(),new Paramz()};
    };

    @Override
    public void initParam(){

        params[0].nums = new int[]{5,3,1,4,7,6,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
                ,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
                ,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
                ,1,1,1,1,1,1,1,1,9};
        params[1].target = 16;
    }

    @Override
    public void test() {
        Map<Integer,Integer> map = new HashMap<>();
        int[] returnList = new int[2];
        for (int i = 0; i < params[0].nums.length; i++) {
            int differ = params[1].target - params[0].nums[i];
            Integer idx = map.get(differ);
            if(idx != null){
                returnList[0] = idx;
                returnList[1] = i;
                System.out.println("第一个：["+idx+"]-【"+ differ +"】");
                System.out.println("第二个：["+i+"]-【"+ params[0].nums[i] +"】");
                System.out.println(returnList);
            }
            else {
                map.put(params[0].nums[i], i);
            }
        }
    }


//    private void test2(int[] nums, int target) {
//        List list = new ArrayList();
//        list.contains(target);
//        int x = list.indexOf(target);
//        for (int i = 0; i < nums.length; i++) {
//
//        }
//    }

}
