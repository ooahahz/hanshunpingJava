package com.chapter13.wrapper;

/**
 * @author ooah
 * @version 1.0
 */
public class SortArray {
    public static void main(String[] args) {
        int[] nums = {5, 4, 8, 6, 2, 7, 3, 10};
        SortArray sortArray = new SortArray();
        int[] res = sortArray.sortArrayByParity(nums);
        for (int num : res) {
            System.out.println(num);
        }


    }

    int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0, right = n - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                res[left++] = num;
            } else {
                res[right--] = num;
            }
        }
        return res;
    }
}
