import java.util.Arrays;
class Solution {
    
    //brute force 말고 다른 방법으로 생각해야함.
    //특정구간의 []의 height.length()-1 x 높이가 가장 큰 수 찾기
    //구간찾는 규칙 -> 각 숫자 x 특정구간의 []의 height.length()-1 전부 돌려보기
    // 가장 큰 숫자부터 아래로 내려가면서 
    // 1. 88 87 이런식으로 내려가기
    // sort 먼저 
   /* public int maxArea(int[] height) {
    /*  int[] temp = new int[height.length];
        int maxNum = 0;
        int lowerHeight = 0;
        for(int i = 0; i < height.length; i++){
            
            for(int j = i+1; j < height.length; j++){
                
                if(height[i] < height[j]){
                    lowerHeight = height[i];
                }else{
                    lowerHeight = height[j];
                }
                
                if(maxNum < lowerHeight * (j-i)){
                    //System.out.println(lowerHeight +","+ (j-i));
                    maxNum = lowerHeight * (j-i);
                }
                //System.out.println(height[i] +","+ j);
                    //maxNum = lowerHeight * ;
            }
            
        }
        return maxNum;
    }
        //int[] sortArr = Arrays.sort(height,Collections.reverseOrder());
        //int[] sortArr = Arrays.sort(height);
        //Arrays.sort(height);
        //Arrays.sort(height,Collections.reverseOrder());
        
        //index를 미리 가지고 있어야 함
        int [] copy = height;
  
        //System.out.print(System.identifyHashCode(copy));
        reverseSort(height); //우선 내림차순으로 sorting 한다
        
        // sorting한 값 출력
        for (int i : height) {
            System.out.print("["+i+"]");
        }
        for (int i : copy) {
            System.out.print("["+i+"]");
        }
        for(int i = 0; i < height.length/2; i++){
            
        }
        
        
        return 0;
    } 
    //배열을 내림차순 정렬한다 : void
    public static void reverseSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
*/
    public int maxArea(int[] height) {
        int containerStart = 0, containerEnd = height.length - 1;
        int maxDiff = Integer.MIN_VALUE;
        
        while (containerStart < containerEnd) {
            int diff = ((containerEnd ) - (containerStart)) * Math.min(height[containerStart], height[containerEnd]);
            maxDiff = Math.max(maxDiff, diff);
            if (height[containerEnd] > height[containerStart])
                containerStart++;
            else
                containerEnd--;
        }
        
        return maxDiff;
    }
}