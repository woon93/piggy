package cn.keepingthepiggy.leetCode.testCase;

import cn.keepingthepiggy.leetCode.Paramz;
import cn.keepingthepiggy.leetCode.TestCase;
import sun.font.DelegatingShape;

import java.util.Arrays;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 则中位数是 2.0
 * <p>
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 则中位数是 (2 + 3)/2 = 2.5
 */
public class Four extends TestCase {
    @Override
    public void newParam() {
        super.newParam();
    }

    @Override
    public void initParam() {
        params[0].nums = new int[]{1, 3, 5, 6, 9, 9, 9, 9};
        params[1].nums = new int[]{2, 4, 6};
    }

    @Override
    public void test() {
        int[] nums1 = params[0].nums;
        int[] nums2 = params[1].nums;


        int[] listMax = nums1.length >= nums2.length ? nums1 : nums2;
        int[] listMin = nums1.length < nums2.length ? nums1 : nums2;
        System.out.println("listMax: " + Arrays.toString(listMax));
        System.out.println("listMin: " + Arrays.toString(listMin));

        int lenMIn = listMin.length;

        double middle = ((double) nums1.length + (double) nums2.length) / 2;
        System.out.println("middle: " + middle);
        System.out.println("middle * 100 % 100: " + middle * 100 % 100);
        boolean isOdd = middle * 100 % 100 != 0;
        System.out.println("isOdd: " + isOdd);

        int times = 0;
        int detector = 0;

        double target = 0;

        for (int i = 0; i < listMax.length; i++) {

            if (i < lenMIn && listMin[detector] <= listMax[i]) {
                times++;
                detector++;
            }
            times++;

            if (times >= middle) {
                if (isOdd) {
                    if (times - middle < 1.00) {
                        target = listMax[i];
                    } else {
                        target = listMin[detector - 1];
                    }
                    System.out.println("is Odd");
                    System.out.println("detector: " + detector);
                    System.out.println("times: " + times);
                    System.out.println("target: " + target);
                    break;
                } else {
                    if (times > middle) {
                        target = (double) (listMin[detector - 1] + listMax[i]) / 2;
                    } else {
                        int next = (listMin[detector] <= listMax[i + 1]) ? listMin[detector] : listMax[i + 1];
                        target = (double) (listMax[i] + next) / 2;
                    }

                    System.out.println("is Not Odd");
                    System.out.println("detector: " + detector);
                    System.out.println("times: " + times);
                    System.out.println("target: " + target);
                    break;
                }
            }

        }

    }
}
