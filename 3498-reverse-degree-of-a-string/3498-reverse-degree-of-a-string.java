class Solution {
    public int reverseDegree(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

        int alphaPos = 26 - (ch - 'a');

        int StringPos=i+1;

        total += alphaPos * StringPos;
        }
        return total;
    }
}