package com.pinkstone;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] test1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(test1, 9)));
    }

    /**
     *
     * @param numbers a sorted array of int values in non-decreasing order
     * @param target a target value resulting from the addition of two int values from numbers array
     * @return a 2-element array with index values for the two int values in numbers array which add to target value.
     *         The return value includes indices assuming an array starts at index 1, per the example provided.
     *         In unexpected case of no solution, will return [0, 0].
     */
    private static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) { // two pointer indices to sum values
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[]{(start + 1), (end + 1)}; // target found!
            }

            if (sum < target) {
                start++; // Current sum < target, so sum must be increased by incrementing start pos
            } else {
                end--; // Current sum > target, so sum must be decreased by decrementing end pos
            }
        }

        // Constraints do not allow for this:
        return new int[] {0, 0};
    }
}
