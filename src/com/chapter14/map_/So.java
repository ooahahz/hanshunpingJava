package com.chapter14.map_;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName So
 * @Author Oliver
 * @Date 2022/5/9 0:11
 * Description      TODO
 * @see ArrayList
 */
class So {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            while (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            if (nums[i] - 1 != i) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        So solution = new So();
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> ans = solution.findDuplicates(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}

