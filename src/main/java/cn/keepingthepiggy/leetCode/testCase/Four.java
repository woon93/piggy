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
        params[0].nums = new int[]{3};
        params[1].nums = new int[]{1,2};
    }

    @Override
    public void test() {
        int[] nums1 = params[0].nums;
        int[] nums2 = params[1].nums;


        int[] listMax = nums1.length >= nums2.length ? nums1 : nums2;
        int[] listMin = nums1.length < nums2.length ? nums1 : nums2;

        double middle = ((double) nums1.length + (double) nums2.length) / 2;
        boolean isOdd = middle * 100 % 100 != 0;

        System.out.println("listMax: " + Arrays.toString(listMax));
        System.out.println("listMin: " + Arrays.toString(listMin));
        System.out.println("middle: " + middle);
        System.out.println("isOdd: " + isOdd);

        int times = 0;
        int detector = 0;

        double target = 0;

        for (int i = 0; i < listMax.length; i++) {
            for (int j = detector; j < listMin.length; j++) {
                if (listMin[detector] > listMax[i]) {
                    break;
                }

                if (times >= middle) {
                    if (isOdd) {
                        target = listMin[detector - 1];
                        System.out.println("target: " + target);
                        return;
                    } else {
                        target = (double) (listMin[detector] + listMin[detector - 1]) / 2;
                        System.out.println("target: " + target);
                        return;
                    }
                }
                detector++;
                times++;
            }
            times++;

            int minIdx = 0;
            if (times >= middle) {
                if (isOdd) {
                    if (times - middle < 1.00) {
                        target = listMax[i];
                    } else {
                        minIdx = (detector == 0) ? 1 : detector;
                        target = listMin[minIdx - 1] >= listMax[i - 1] ? listMin[minIdx - 1] : listMax[i - 1];
                    }
                    System.out.println("is Odd");
                    System.out.println("minIdx: " + minIdx);
                    System.out.println("times: " + times);
                    System.out.println("target: " + target);
                    return;
                } else {
                    if (times > middle) {
                        minIdx = (detector == 0) ? 1 : detector;
//                        int maxIdx = i == 0 ? 1 : i;
//                        int pre = listMin[minIdx - 1] >= listMax[maxIdx - 1] ? listMin[minIdx - 1] : listMax[maxIdx - 1];
                        target = (double) (listMin[minIdx - 1] + listMax[i]) / 2;
                        System.out.println("listMin[minIdx - 1]：" + listMin[minIdx - 1]);
                        System.out.println("listMax[i]：" + listMax[i]);
                    } else {
                        minIdx = detector == listMin.length ? detector - 1 : detector;
                        int next = 0;
                        if (listMin.length != 0 && (i == listMax.length - 1 || listMin[minIdx] >= listMax[i]
                                && listMin[minIdx] <= listMax[i + 1])) {
                            next = listMin[minIdx];
                        } else {
                            next = listMax[i + 1];
                        }
                        target = (double) (listMax[i] + next) / 2;
                    }

                    System.out.println("is Not Odd");
                    System.out.println("minIdx: " + minIdx);
                    System.out.println("times: " + times);
                    System.out.println("target: " + target);
                    return;
                }
            }

        }

    }
}
