class Solution {
    
    public int myAtoi(String s) {
        int returnVal = 0;
        boolean isPlus = true;
        StringBuilder temp = new StringBuilder("");
        
        int i = 0;
        //1. 공백체크 for 문
        for(; i < s.length(); i++){
            String target = s.substring(i,i+1);
            // 1.공백이면 무시  
            if(!isStringEmpty(target)){
                break;
            }
        }
        // 2. + - 체크 for 문
        for(; i < s.length(); i++){
            String target = s.substring(i,i+1);
            // 2. - or + 체크
            if(target.equals("+")){
                isPlus = true;
                i++;
            }else if(target.equals("-")){
                isPlus = false;
                i++;
            }
            break;
        }
        // 3. 숫자가 아닌 경우까지 혹은 끝까지 탐색
         for(; i < s.length(); i++){
            String target = s.substring(i,i+1);
            if(target.equals("0") || target.equals("1") || target.equals("2") || target.equals("3") || target.equals("4") || target.equals("5") || target.equals("6") || target.equals("7") || target.equals("8") || target.equals("9")){
                if (!(temp.length() == 0 && target.equals("0"))) {
                    temp.append(target);
                }
            }else{
                break;
            }
        }
        //남은 조건 ::
        // 1. 0이 앞에 올경우 0032 => 32 parse int에서 자동 처리
        // 2. 숫자가 하나도 안나올 경우 return 0;(-0은 0) 
        
        // 3. 제일 중요 정수범위 벗어날 경우 가장 가까운 최대 정수범위 혹은 최소 정수범위로 리턴
       
        //stringbuilder의 범위가 정수범위를 벗어나면 바로 파싱하지말고 integer 최대 최소 범위로 고정해서 리턴
        //temp.length() > 11 무조건 2147483648 temp.length() == 11 이고 앞자리가 22면 무조건 int 최대 //  21이면 뒤의 값 탐색해서 1,2,3,4가 아니면 최대값 , 89면 최대값 , 코드가 지저분해짐
        //47483648만 int로 파싱해서 해당값이 47483648보다 크면 int 최대값
        if(temp.length() == 0){
            return 0;
        }else if((temp.length() >= 11)
                || (temp.length() == 10 && temp.substring(0,2).equals("22"))
                || (temp.length() == 10 && temp.substring(0,1).compareTo("2") > 0)){
            if(isPlus){
                return Integer.MAX_VALUE;
            }else{
                return Integer.MIN_VALUE;
            }
        }else if(temp.length() == 10 && temp.substring(0,2).equals("21")){
            String checkBehind = temp.substring(2,10);
            //System.out.println(checkBehind);
            int parseCheckBehind= Integer.parseInt(checkBehind.toString());
            if(parseCheckBehind > 47483647){
                if(isPlus){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                } 
            } else {
                returnVal = Integer.parseInt(temp.toString());
                if(!isPlus){
                    returnVal = returnVal - returnVal - returnVal;
                }
                return returnVal;
            }
        }else{
            returnVal = Integer.parseInt(temp.toString());
            if(!isPlus){
                returnVal = returnVal - returnVal - returnVal;
            }
            return returnVal;
        }
    }
    
    //공백체크 메서드 생성
    boolean isStringEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
}