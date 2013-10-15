public int maxTriple(int[] nums) {
  int largest = Math.max(nums[0], nums[nums.length / 2]);
  return Math.max(largest, nums[nums.length-1]);
}
