class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int nums_len = nums.length;
        //Map<> 
        if(nums_len == 3){return nums[0] + nums[1] + nums[2];}
        Arrays.sort(nums);
        //출력용
        /*for(int i = 0; i < nums_len; i++){
        System.out.print(nums[i] + ",");
        }*/
        int minSum = -3001;
        //System.out.print(Math.abs(-1));
        //-2
        for(int i = 0; i < nums_len - 2; i++){
                //[-4, -1, -1, 0, 1, 2]
				int low = i + 1;
				int high = nums_len - 1;
                //절대값 차이랑
                //min sum
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == target){
                    return sum;
                //}else if( Math.abs(sum+Math.abs(target)) < Math.abs(minSum+Math.abs(target)) ){
                //sum < target low++ sum 과 타겟과의 거리가 minsum과 타겟과의 거리가 더 가까우면 new minsum
                }else if(sum < target){
                    //high++; // out of range?    
                    low++;
                    //high--;
                }else if(sum > target){
                    high--;
                }
                //System.out.println("\n"+"low and high" + low + " , " + high); //2,2.. low < high 일떄 while인데 
                //System.out.println("\n"+"sum == " + sum);//반복문 while 더 생각하기
                //System.out.println("\n"+"Math.abs(sum - target) == " + Math.abs(sum - target));
                //System.out.println("\n"+"Math.abs(minSum - target) == " + Math.abs(minSum - target));
                if(Math.abs(sum - target) < Math.abs(minSum - target)){
                    minSum = sum;
                }
            }
            
        }
        
        return minSum;
    }
}

/*
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int nums_len = nums.length;
		List<List<Integer>> result = new ArrayList<>();
		
		if(nums_len == 0 || nums_len < 3) { return result; }
		
		Arrays.sort(nums);
		
		// 하나는 지정해두고 나머지를 비교하기 때문에 -2
		// ex) [-4, -1, -1, 0, 1, 2] 에서 나는 -4, 그러면 나머지 5개중에서 찾기 시작
		for(int i = 0; i < nums_len - 2; i++) {
			if(i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                //[-4, -1, -1, 0, 1, 2]
				int low = i + 1;
				int high = nums_len - 1;
				
				// a + b + c = 0   ⇒   a + b = -c
				// 나 자신에서 -를 붙인 그 값을 찾으면 됨
				// ex) 내가 3이면, 이제 나머지 두 개를 더해서 -나(= -3)를 하면 결국 나(3) + 나머지2개의합(-3) = 0 이 됨
				int sum = 0 - nums[i]; 
				
				while(low < high) {
					if(nums[low] + nums[high] == sum) {
						result.add(Arrays.asList(nums[i], nums[low], nums[high]));
						// 중복 제거!
						while(low < high && nums[low] == nums[low + 1]) { low++; } // nums[low]가 다음 값과 같으면 다를 때까지 low를 증가
						while(low < high && nums[high] == nums[high - 1]) { high—; } // nums[high]가 전 값과 같으면 다를 때까지 high를 감소
						low++;
						high—;
					} else if(nums[low] + nums[high] > sum) {
						high—;
					} else {
						low++;
					} // if ~ else if ~ else end
				} // while end
			} // if end
		} // for end
		return result;
    }
}
*/