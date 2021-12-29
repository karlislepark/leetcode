class Solution {
    //똑같은 문자는 숫자 + 중첩
    //뒤에 하위문자가 나오면 상위숫자 - 하위숫자
    //숫자를 자릿수별로 나누어서 방법 나누기 ex) 4자리 3자리 case 4개
    //4자리인데 앞자리 3 MMM
    //ex) 3자리 933 CMXXXIII 
    //자리 숫자가 4혹은 9일경우 더 큰 자리 5의 배수 숫자가 사용됨 ex) M혹은 D와 C가 사용됨
    
    // 각 자리 숫자 구하기 o
    // 1~9를 case로 나누기 map에 넣어서 출력해서 stirng + 해서 합치면? map.get(해당자리 숫자) X
    //9 4 는 10의제곱수에서 빼기 혹은 5의 10배수 에서 빼야하므로 케이스 나누어 주어야 함
    
    public String intToRoman(int num) {
        //num.length
        System.out.println((int)( Math.log10(num)+1 ));
        System.out.println("1000자리  : "+num/1000); 
        System.out.println("100자리  : "+num/100%10);
        System.out.println("10자리  : "+num%100/10);
        System.out.println("1자리  : "+num%10); 
        String returnVal = "";
         HashMap<Integer,String> map1000 = new HashMap<Integer,String>();
            map1000.put(0,"");
            map1000.put(1,"M");
            map1000.put(2,"MM");
            map1000.put(3,"MMM");
            HashMap<Integer,String> map100 = new HashMap<Integer,String>();
            map100.put(0,"");
            map100.put(1,"C");
            map100.put(2,"CC");
            map100.put(3,"CCC");
            map100.put(4,"CD");
            map100.put(5,"D");
            map100.put(6,"DC");
            map100.put(7,"DCC");
            map100.put(8,"DCCC");
            map100.put(9,"CM");
            HashMap<Integer,String> map10 = new HashMap<Integer,String>();
            map10.put(0,"");
            map10.put(1,"X");
            map10.put(2,"XX");
            map10.put(3,"XXX");
            map10.put(4,"XL");
            map10.put(5,"L");
            map10.put(6,"LX");
            map10.put(7,"LXX");
            map10.put(8,"LXXX");
            map10.put(9,"XC");
            HashMap<Integer,String> map1 = new HashMap<Integer,String>();
            map1.put(0,"");
            map1.put(1,"I");
            map1.put(2,"II");
            map1.put(3,"III");
            map1.put(4,"IV");
            map1.put(5,"V");
            map1.put(6,"VI");
            map1.put(7,"VII");
            map1.put(8,"VIII");
            map1.put(9,"IX");
        if(num/1000 > 0){
            System.out.println("4자리 숫자 입니다."); 
            //각 자리숫자 추출
            //map4개 생성
            returnVal = map1000.get(num/1000);
            returnVal += map100.get(num/100%10);
            returnVal += map10.get(num%100/10);
            returnVal += map1.get(num%10);
        }else if(num/1000==0 && num/100%10 > 0){
            returnVal = map100.get(num/100%10);
            returnVal += map10.get(num%100/10);
            returnVal += map1.get(num%10);
        }else if(num/1000==0 && num/100%10==0 && num%100/10 > 0){
            returnVal += map10.get(num%100/10);
            returnVal += map1.get(num%10);
        }else if(num/1000==0 && num/100%10==0 && num%100/10==0 && num%10>0){
            returnVal += map1.get(num%10);
        }
        
        
        return returnVal;
    }
}