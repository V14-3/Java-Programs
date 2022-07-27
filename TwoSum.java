class Solution {
    public int[] twoSum(int[] nums, int target) {
       // 3 2 4 5 => 9
        
        
        HashMap<Integer, Integer> hMap = new HashMap<>();
        
        
        
        for(int i = 0; i < nums.length;i++){
            int difference = target-nums[i];
            
            if(hMap.containsKey(difference)){
                return new int[]{i,hMap.get(difference)};
            }
            hMap.put(nums[i], i);
        }
        return null;
        
    }
}
