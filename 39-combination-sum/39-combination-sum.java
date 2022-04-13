class Solution {
    /*public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combind = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        subfunc(candidates, target, combind, result);
        return result;
    }
    
    public void subfunc(int[] candidates, int target, List<Integer> combind, List<List<Integer>> result) {
        //base case : target이 0이면 결과 배열에 add
        if(target == 0 ){
            List<Integer> newEle = new ArrayList<Integer> (combind);
            
                //System.out.println(combind);
            result.add(newEle);      
            //result.add(newEle);
            HashSet<List<Integer>> hashSet = new HashSet<>();
            for(List<Integer> item : result){
                int k = 0;
                //System.out.println(item);
                hashSet.add(item);
                k++;
            }            
            System.out.println(hashSet);
            //System.out.println(result);
            //System.out.println(target);
            combind.remove(combind.size() - 1);
            return;
        }else if(target < 0) {
            combind.remove(combind.size() - 1);
            return;
        }
        
        //recursive case : 전체 배열을 다 보는데 -해도 음수가 되지 않으면 같은 숫자를 더 빼면서 index-1 까지 반복
        for (int i = 0; i < candidates.length; i++) {
            //if(!combind.contains(candidates[i])){
                combind.add(candidates[i]); 
            //}
            //combind.add(candidates[i]); 
            //System.out.println(combind);
            //System.out.println(target-candidates[i]);
            subfunc(candidates, target-candidates[i], combind, result);
        }
        if (combind.size() != 0)
            combind.remove(combind.size() - 1);
    }*/
   
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combind = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        subfunc(candidates, target, combind, result);
        return result;
    }
    
    public void subfunc(int[] candidates, int target, List<Integer> combind, List<List<Integer>> result) {
        //base case : target이 0이면 결과 배열에 add
        if(target == 0){
            boolean sameList = false;
            List<Integer> newEle = new ArrayList<Integer> (combind);
            for (List<Integer> eleList:result) {    // [2,2,3] == [3,2,2]? result [..[2,2,3]..]
                Collections.sort(newEle);           // [3,2,2] --> [2,2,3]
                Collections.sort(eleList);          // [2,2,3] —> [2,2,3] 
                if (eleList.equals(newEle)) {
                    sameList = true;
                    break;
                }
            }
            if (!sameList) {
                result.add(newEle);
            }
            combind.remove(combind.size() - 1);
            return;
        }else if(target < 0) {
            combind.remove(combind.size() - 1);
            return;
        }
        
        //recursive case : 전체 배열을 다 보는데 -해도 음수가 되지 않으면 같은 숫자를 더 빼면서 index-1 까지 반복
        for (int i = 0; i < candidates.length; i++) {
            combind.add(candidates[i]); 
            subfunc(candidates, target-candidates[i], combind, result);
        }
        if (combind.size() != 0)
            combind.remove(combind.size() - 1);
    }

}