class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
                List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sorts array in O(n log n)
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break; // Early exit
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate first elements
            
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++; // Skip duplicates
                    while (left < right && nums[right] == nums[right - 1]) right--; // Skip duplicates
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Increase sum
                } else {
                    right--; // Decrease sum
                }
            }
        }
        return result;

        
    }
}