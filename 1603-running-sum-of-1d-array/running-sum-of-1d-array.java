class Solution {
    public int[] runningSum(int[] nums) {
                int currentSum = 0;
        int[] result = new int[nums.length]; 
        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
            result[i] = currentSum; 
            }

        return result; 

    }
}