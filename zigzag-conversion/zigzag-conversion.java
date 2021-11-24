class Solution {
    // row만큼 1char씩 내려감 row 다 채우면 우측위로 한칸씩 1char채우다가 다시 첫번째 row로 돌아오면 다시 row만큼 1char씩 내려감
    // 2차원 배열의 가로규칙은 s를 2로 나눈 값 XX 
    // 좌표에 넣을 규칙성 
    // 00 10 20 31 03 13 23 33 24 05 15 25 35 --> numrow 3
    // 00 10 20 30 21 13 04 
    //length가 0이면 하나씩 세로로 넣어주고  세로 width ++ 하면서 length가 numRows까지 닿으면 2번째 세로로 이동하는데 지그재그로 우측 위     (우측 위 = [-1][+1])
    //length가 0이 아닐 때 우측 위로 이동해야 한다.  
    //코드로는 while? while(width==)
    
    public String convert(String s, int numRows) {
        //String[] a = a.add(s);
        String[][] array;
       //int arrayWidth = s.length()/2;
        //array = new String[numRows][arrayWidth]; 
        array = new String[numRows][s.length()]; 
            
        //String oneChar =  s.substring(a,a+1);
        //array[i][k] = oneChar;
        //array[1][0] = "a";
        //System.out.println(Arrays.toString(array[i]));    
        int row = 0;
        int col = 0;
        boolean inCol = true; //[0][0]일 때 아래로 쓰는 구간이면
        //String oneChar =  s.substring(i,i+1);
        String oneChar =  "";
        for(int i = 0; i < s.length(); i++){
            oneChar = s.substring(i,i+1);
            //System.out.println(row);
            //System.out.println(col);
            array[row][col] = oneChar; //row 세로 col 가로고 row가 증가하여 numrows에 도달하면 col 증가하고 row 감소해서 우측 위로 이동 incol로 판단
            //System.out.println(oneChar);
            //System.out.println(inCol);
            // A 0
            // 
            //
            if(numRows != 1){
                if(inCol){
                    if(row < numRows-1){ //
                        row++;
                    }else{
                        row--;
                        col++;
                        inCol = false;
                    }
                }else{
                    if(0 < row){
                        row--;
                        col++;
                    }else{
                        //row--;
                        //col++;
                        row++;
                        inCol = true;
                    }
                }
            }else{
                col++;
            }
            //String oneChar =  s.substring(i,i+1);
            //while(row != numRows){
            //    oneChar =  s.substring(row,row+1);
            //  if(row==0){
            //      array[row][i] = oneChar;
            //  }
            //  row++;
            //  array[row][i] = oneChar;
            //System.out.println(Arrays.toString(array[i]));
            //
        }
         String returnVal = "";
        //찍는 용도
        for(int i = 0; i < numRows; i++){
            String line = "";
            for(int j = 0; j < s.length(); j++){
                //System.out.println(Arrays.toString(array[i][j]));
                if(array[i][j] != null){
                    //System.out.println(array[i][j]);
                    //line+= array[i][j];
                    returnVal += array[i][j];
                }else{
                    //System.out.println(0);
                    //line+= "0";
                }
            }
            //System.out.println(line);
        }
        
        return returnVal;
    }
}