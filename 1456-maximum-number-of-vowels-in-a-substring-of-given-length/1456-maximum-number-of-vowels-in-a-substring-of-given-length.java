class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels=0;
        int currentVowels=0;

        for(int i=0;i<k;i++){
            if(isVowels(s.charAt(i))){
                currentVowels++;
            }
        }

        maxVowels=currentVowels;
        if (maxVowels == k) {
            return k;
        }

        if(maxVowels==k){
            return k;
        }

        for(int i=k;i<s.length();i++){
            if(isVowels(s.charAt(i))){
                currentVowels++;
            }
            if (isVowels(s.charAt(i - k))) {
                currentVowels--;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
            if (maxVowels == k) {
                return k;
            }
        }
        return maxVowels;
    }
    private boolean isVowels(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}