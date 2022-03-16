class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = (start+end)/2;
        int[] retVal = {-1, - 1};
        
        if (end == -1) return retVal;
        
        int idx = binarySearch(nums, target, 0, nums.length-1);
        //System.out.println(idx);
        
        int leftIdx = idx;
        while (leftIdx >= 1 && nums[leftIdx - 1] == target) {
            leftIdx = binarySearch(nums, target, 0, leftIdx - 1);
        }
        
        int rightIdx = idx;
        while (rightIdx < nums.length - 1 && nums[rightIdx + 1] == target) {
            rightIdx = binarySearch(nums, target, rightIdx + 1, nums.length - 1);
        }
        
        retVal[0] = leftIdx;
        retVal[1] = rightIdx;
        return retVal;
    }
    
    int binarySearch(int[] nums, int target, int start, int end) {
        int mid = (start+end)/2;
        //System.out.println(start + " ," + mid + " ," + end);
        if (end == mid + 1 && nums[end] == target) return end;
        if (start == mid && nums[mid] != target) return -1;
        
        int retVal = -1;
        if (nums[mid] > target) {
            retVal = binarySearch(nums, target, start, mid - 1);
        } else if (nums[mid] == target) {
            retVal = mid;
        } else {
            retVal = binarySearch(nums, target, mid, end);
        }
        return retVal;
    }
}