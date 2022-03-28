class Solution {
    public static String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1);
        String r = "";
        
        for(int i=0;i<s.length();i++) {
           int j=1;
           while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
              i++;
              j++;
           }
           r+= j+""+s.charAt(i);
        }
        return r;
    }
}