class Solution {
    public int[] constructRectangle(int area) {
        //곱해서 인풋값이 되는 경우의 수를 구하고 그중에서 l의 길이가 길고 차이가 가장 적은 경우를 구하라
        //1. 경우의 수 구하는 법
        //area = a*b 만족하는 a,b를 전부 어딘가에 담는다.(map?arraylist)
        
        //2. width가 크고 차가 가장 적은 배열 찾는법
        //담은 짝이같은 a,b 를 a-b해서 0에 가장 가까운 가장 작은 양수인 짝을 리턴한다.
        
        int[] listArea = new int[2];
        
        int L = -1;
        int W = -1;
        //listArea[0] = L;
        if(area == 1){
            listArea[0] = 1;
            listArea[1] = 1;
        }
        for(int i = 1; i <= area/2; i++){
            //i값으로 나누어 떨어질 때 L과 W의 짝
            if(area%i == 0 && area/i >= i){
                    L = area/i;
                    W = i;
                    listArea[0] = L;
                    listArea[1] = W;
                System.out.println(L+""+","+W);
            }
           //L-W의값이 0이되면 무조건 리턴
            //if(L-W == 0){
            //    //System.out.println("L-W==0  "+L+""+","+W); //3번도는이유
            //    listArea[0] = L;
            //    listArea[1] = W;
           // }
            // L-W의 값이 짝들중 가장 작은값 
            
        }
        
        
        return listArea;
    }
}