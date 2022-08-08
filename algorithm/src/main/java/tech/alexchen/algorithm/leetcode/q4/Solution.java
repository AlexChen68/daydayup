package tech.alexchen.algorithm.leetcode.q4;

import cn.hutool.core.util.StrUtil;

import java.util.Arrays;

/**
 * @author AlexChen
 */
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 3};
//        int[] nums1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] nums2 = {2, 4};
//        int[] nums2 = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("中位数为：" + median);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 设定 nums1 比 nums2 短或者相等
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        int m = nums1.length;
        int n = nums2.length;
        // 第一个数组的左指针，第一个数组的右指针，每次搜索的范围在 [left, right]
        int left = 0;
        int right = m;
        int median1 = 0, median2 = 0;
        // 结束搜索的条件
        while (left <= right) {
            // 前一部分包含 nums1[0 .. i-1] 和 nums2[0 .. j-1]
            // 后一部分包含 nums1[i .. m-1] 和 nums2[j .. n-1]
            // 下标从 0 开始，下标为 i 的数前面有 i 个数
            int i = (left + right) / 2;
            // 取(m + n + 1)/2 即可不用判断奇偶，因为 / 2 的整数结果是一样的
            int j = (m + n + 1) / 2 - i;

            // 考虑特殊情况，即数组都在左边或者都在右边的情况
            int nums1_l = (i == 0 ? Integer.MIN_VALUE : nums1[i - 1]);
            int nums1_r = (i == m ? Integer.MAX_VALUE : nums1[i]);
            int nums2_l = (j == 0 ? Integer.MIN_VALUE : nums2[j - 1]);
            int nums2_r = (j == n ? Integer.MAX_VALUE : nums2[j]);
            System.out.println(StrUtil.format("left = {}, right = {}", left, right));
            System.out.println(StrUtil.format("i = {}, j = {}, data = {}, {}, {}, {}", i, j, nums1_l, nums1_r, nums2_l, nums2_r));

            // 判断是否满足左边元素都小于右边元素，判断一个反例即可，因为两个数组是有序的
            if (nums1_l > nums2_r) {
                // 数组1左边大于数组2右边，搜索范围应该向左移动，一次减半
                right = i - 1;
            } else if (nums2_l > nums1_r) {
                left = i + 1;
            }  else {
                // 满足条件
                median1 = Math.max(nums1_l, nums2_l);
                median2 = Math.min(nums1_r, nums2_r);
                break;
            }
        }
        return (m + n) % 2 == 0 ? (median1 + median2) / 2.0 : median1;
    }
}
