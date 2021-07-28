class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> tempMap = new HashMap<>();
        //index , target - num[i]  2,1 \\ 11,2 \\ 7,3
        // map: 2,1 3,2 4,3  x = 4 3 2 
        for(int i = 0; i < numbers.length; i++){
            int x = target - numbers[i];
            
            if(tempMap.containsKey(x)){
                return new int[] {tempMap.get(x) , i+1};
            }
            tempMap.put(numbers[i] , i+1);
            
           
        }
       return null;
    }
}