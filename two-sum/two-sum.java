class Solution {
    public int[] twoSum(int[] nums, int target) {
        //target - nums
        // map
        Map<Integer,Integer> map = new HashMap();
		int[] returnVal2 = new int[] {};
		
		for(int i = 0; i < nums.length; i++) {
			if(!(map.containsKey(target - nums[i]))) {
				map.put(nums[i],i); // 2,0  
			}else {
				int[] returnVal = {i,map.get(target - nums[i])};
				returnVal2 = returnVal;
			}
		}
		return  returnVal2;
	}
        
    }
