package LeetCode.testCase;

import LeetCode.TestCase;

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
        params[0].nums = new int[]{1, 2,5,6,7};
        params[1].nums = new int[]{3,4,8,9,10,11,12};
    }

    @Override
    public void test() {
        int[] nums1 = params[0].nums;
        int[] nums2 = params[1].nums;
        double target = 0;

        if (nums1.length > nums2.length) {
            int[] temp = nums2;
            nums2 = nums1;
            nums1 = temp;
        }

        System.out.println("nums1: " + Arrays.toString(nums1));
        System.out.println("nums2: " + Arrays.toString(nums2));

        int i = 0, j = 0;
        int min1 = 0, max1 = nums1.length;

        int time = 0;
        do {
            i = (min1 + max1) % 2 == 0 ? (min1 + max1) / 2 : (min1 + max1 + 1) / 2;
            j = (nums1.length + nums2.length) / 2 - i;

            System.out.println("--->" + ++time + "<---");
            System.out.print("i: " + i + " | ");
            System.out.println("j: " + j);

            if (i > 0 && nums1[i - 1] > nums2[j]) {
                max1 = i - 1;
                continue;
            }
            if (i < nums1.length && nums1[i] < nums2[j - 1]) {
                min1 = i + 1;
                continue;
            }

            int next = 0;
            if (i == nums1.length) next = nums2[j];
            else if (j == nums2.length) next = nums1[i];
            else next = nums1[i] <= nums2[j] ? nums1[i] : nums2[j];
            if ((nums1.length + nums2.length) % 2 != 0) {
                target = next;
                System.out.println("target-1: " + target);
                return;
            }

            int pre = 0;
            if (i == 0) pre = nums2[j - 1];
            else if (j == 0) pre = nums1[i - 1];
            else pre = nums1[i - 1] >= nums2[j - 1] ? nums1[i - 1] : nums2[j - 1];

            target = (pre + next) * 0.5;
            System.out.println("target-2: " + target);
            return;

        } while (true);
    }

    public void test2() {
        int[] nums1 = params[0].nums;
        int[] nums2 = params[1].nums;
        double target = 0;

        if (nums1.length > nums2.length) {
            int[] temp = nums2;
            nums2 = nums1;
            nums1 = temp;
        }

        System.out.println("nums1: " + Arrays.toString(nums1));
        System.out.println("nums2: " + Arrays.toString(nums2));

        // 如果有空集合
        if (nums1.length == 0) {
            if (nums2.length == 0) {
                System.out.println("target-1: " + target);
                return;
            }
            double med = nums2.length * 0.5;
            if (med * 10 % 10 == 0) {
                target = (nums2[(int) med] + nums2[(int) med - 1]) * 0.5;
            } else {
                target = nums2[(int) med];
            }
            System.out.println("target-2: " + target);
            return;
        }

        int i = 0, j = 0;
        int min1 = 0, max1 = nums1.length;

        do {
            i = (min1 + max1) * 0.5 * 100 % 100 == 0 ? (min1 + max1) / 2 : (min1 + max1 + 1) / 2;
            j = (nums1.length + nums2.length) / 2 - i;
            System.out.println("i: " + i);
            System.out.println("j: " + j);


            if (i == 0 && nums1[i] >= nums2[j - 1]) {
                double med = (nums2.length + nums1.length) * 0.5;
                if (med * 10 % 10 == 0) {
                    int next;
                    if (j == nums2.length) {
                        next = nums1[i];
                    } else {
                        next = nums1[i] <= nums2[j] ? nums1[i] : nums2[j];
                    }
                    target = (nums2[(int) med - 1] + next) * 0.5;
                } else {
                    target = nums1[0] <= nums2[j] ? nums1[0] : nums2[j];
                }

                System.out.println("target-3: " + target);
                return;

            }

            if (i == nums1.length && nums1[i - 1] <= nums2[j]) {

                double med = (nums2.length - nums1.length) * 0.5;
                if (med * 10 % 10 == 0) {
                    int pre;
                    if (j == 0) {
                        pre = nums1[i - 1];
                    } else {
                        pre = nums1[i - 1] >= nums2[j - 1] ? nums1[i - 1] : nums2[j - 1];
                    }

                    target = (pre + nums2[(int) med]) * 0.5;
                } else {
                    target = nums2[(int) med];
                }

                System.out.println("target-4: " + target);
                return;
            }

            if (j == 0 && nums2[j] >= nums1[i - 1]) {
                double med = (nums1.length + nums2.length) * 0.5;
                if (med * 10 % 10 == 0) {
                    int next;
                    if (i == nums1.length) {
                        next = nums2[j];
                    } else {
                        next = nums1[i] <= nums2[j] ? nums1[i] : nums2[j];
                    }
                    target = (nums1[(int) med - 1] + next) * 0.5;
                } else {
                    target = nums2[0] <= nums1[i] ? nums2[0] : nums1[i];
                }

                System.out.println("target-5: " + target);
                return;
            }

            if (j == nums2.length && nums2[j - 1] <= nums1[i]) {
                double med = (nums1.length - nums2.length) * 0.5;
                if (med * 10 % 10 == 0) {
                    int pre;
                    if (i == 0) {
                        pre = nums2[j - 1];
                    } else {
                        pre = nums1[i - 1] >= nums2[j - 1] ? nums1[i - 1] : nums2[j - 1];
                    }
                    target = (pre + nums1[(int) med]) * 0.5;
                } else {
                    target = nums1[(int) med];
                }

                System.out.println("target-6: " + target);
                return;
            }


            if (nums1[i - 1] > nums2[j]) {
                max1 = i - 1;
                continue;
            }

            if (nums1[i] < nums2[j - 1]) {
                min1 = i + 1;
                continue;
            }

            if ((nums1.length + nums2.length) * 0.5 * 10 % 10 == 0) {
                int pre = nums1[i - 1] >= nums2[j - 1] ? nums1[i - 1] : nums2[j - 1];
                int next = nums1[i] <= nums2[j] ? nums1[i] : nums2[j];
                target = (pre + next) * 0.5;
            } else {
                target = nums1[i] <= nums2[j] ? nums1[i] : nums2[j];
            }
            System.out.println("target-7: " + target);
            return;

        } while (true);
    }

    public void test3() {
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
                    System.out.println("target: " + target);
                    return;
                } else {
                    if (times > middle) {
                        minIdx = (detector == 0) ? 1 : detector;
                        target = (double) (listMin[minIdx - 1] + listMax[i]) / 2;
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
                    System.out.println("target: " + target);
                    return;
                }
            }

        }

    }
}
