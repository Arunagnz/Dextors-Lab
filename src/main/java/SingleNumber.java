/**
 * Created by arunagirinathanr
 * on 21/10/19 8:53 PM
 * for project dexters-lab
 *
 * https://leetcode.com/problems/single-number/
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 **/
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}
