    class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> retList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j-1]) 
                    continue;
                int sum = target - nums[i]; // nums[j] + nums[low] + nums[high] == target - nums[i]
                int low = j + 1;
                int high = nums.length - 1;
                while (low < high) {
                    int tempSum = nums[j] + nums[low] + nums[high];
                    if (tempSum == sum) {
                        retList.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        low++;
                        while (low < high && nums[low] == nums[low-1]) {
                            low++;
                        }
                    } else if (tempSum < sum) {
                        low++;
                        while (low < high && nums[low] == nums[low-1])
                            low++;
                    } else {
                        high--;
                        while (low < high && nums[high] == nums[high+1])
                            high--;
                    }
                }
            }
        }
        return retList;
    }
}
/* class Solution {
   public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> returnVal = new ArrayList<>();
        int nums_len = nums.length;
        Arrays.sort(nums);
        
        //numslength가 4 아래일때 -> 
        
        //출력용
        for(int i = 0; i < nums.length; i++){
            if(i != 0){
                System.out.print(",");
            }
            System.out.print(nums[i]);
        }
        
        for(int i = 0; i < nums_len-3; i++ ){
            //int i = 0;
            int start = i + 1;
            int end = nums_len -1;
            int mid = i + 2;
            while(start < end){
                while(mid < end){
                    if((nums[i] + nums[start] + nums[mid] + nums[end] == target) && i != start && i != mid && i != end
                      && start != end && start != mid && mid != end){ 
                        System.out.println("\n" +"add:: "+ i + ","+ start + "," + mid + "," + end);
                        for (int i = 0; i < dataList.size(); i++) {
                            if (!resultList.contains(dataList.get(i))) {
                                resultList.add(dataList.get(i));
                            }
                        }
                            returnVal.add(Arrays.asList(nums[i] , nums[start] , nums[mid] , nums[end]));  
                        mid++;
                    }else{
                        System.out.println("\n" + i + ","+ start + "," + mid + "," + end);
                        mid++;
                    }
                    //debug는 같은곳을 4개의 숫자가 전부 가리키지 않게
                    if(start != end && mid == end){
                        //System.out.println("test");
                        mid = i + 2;
                        start++;
                    }
                }
                start++;
                
            }
        }
        
        return returnVal;
    }
}
*/
/*
 public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
         if(n < 3 || nums[0] > 0 || nums[n-1] < 0) 
            return ans;
        for(int i =0 ; i < n-2;i++){ [i , n-2 , n-1]
            if(nums[i]>0)
                break ;
            if (i>0 && nums[i]==nums[i-1])
                continue;
            int requiredSum =  0-nums[i];
            int start = i+1;
            int end = n-1;
            while(start<end){
                if((nums[start]+nums[end])==requiredSum){
                    ans.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start+=1;
                    end-=1;
                    while(start<end && nums[start]==nums[start-1])
                        start+=1;
                    while(start<end && nums[end]==nums[end+1])
                        end-=1;
    
                }
                else if (nums[start]+nums[end] < requiredSum){
                    start+=1;
                    while(start<end && nums[start]==nums[start-1])
                        start+=1;
                }
                    
                else
                {
                    end-=1;
                    while(start<end && nums[end]==nums[end+1])
                        end-=1;
                }
                
                
            }
            
        }
        return ans;
*/

/*
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
*/