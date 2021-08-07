class Solution {
    public int majorityElement(int[] nums) {
        // 전체의 반
        // count 세서 
        Map<Integer,Integer> tempMap = new HashMap<Integer,Integer>(); // 더 적합한 자료구조?
        //int[] count = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            //map에 한번도 없었던 거면 넣어주고 count를 1로 
            if(tempMap.containsKey(nums[i])){
                int count = tempMap.get(nums[i]);
                tempMap.put(nums[i],count+1);
            }else{
                tempMap.put(nums[i],1);    
            }
        }
        System.out.println(tempMap);
        // 맵에서 가장 count가 높은 숫자 return
        //tempMap.highestvalue(); 
        // 갖고있는건 value의 최대값 <- 이용해서 해당 iterator의 key값 갖고오기 마지막 for loop 의 key를 갖고와야하는데 
        // 마지막 for loop인지 어떻게 알지...
        int maxVal = 0;
        int tempKey = 0;
        for (int key : tempMap.keySet()) {
    	    int value = tempMap.get(key);
            
            if(maxVal < value){
                maxVal = value;
                 tempKey = key;
            }
           // System.out.println(maxVal);
            System.out.println("[key]:" + key + ", [value]:" + value);
        }
        System.out.println(tempKey);
        
        return tempKey;
    }
}