class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++)
            hm.put(nums[i], i);
        for(int i = 0; i < nums.length; i++){
            int lookup = target - nums[i];
            if(hm.containsKey(lookup) && hm.get(lookup) != i) {
                res[0] = i;
                res[1] = hm.get(lookup);
                break;
            }
        }
        return res;
    }

}