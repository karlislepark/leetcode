class Solution {
    //2147483647
    //1
    //-2147483648
    //1
    /*
    public int divide(int dividend, int divisor) {
        int returnVal = dividend/divisor;
        //if(returnVal == Integer.MAX_VALUE){
        //    returnVal = Integer.MIN_VALUE;
        if(returnVal == Integer.MIN_VALUE && dividend != Integer.MIN_VALUE){
            //returnVal = Integer.MIN_VALUE;
            returnVal = Integer.MAX_VALUE;
        }else if(){
            
        }else if(returnVal == Integer.MIN_VALUE && dividend == Integer.MIN_VALUE){
            System.out.println("test");
            returnVal = Integer.MIN_VALUE;
        }
        return returnVal;
    }
    */
    
    public int divide(int dividend, int divisor) {
        long returnVal = (long)dividend/divisor;
        if(returnVal > Integer.MAX_VALUE){
            returnVal = Integer.MAX_VALUE;
        }else if(returnVal < Integer.MIN_VALUE){
            returnVal = Integer.MIN_VALUE;
        }
        return (int)returnVal;
    }
}