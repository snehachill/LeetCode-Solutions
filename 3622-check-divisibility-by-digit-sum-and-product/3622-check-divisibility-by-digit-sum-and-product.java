class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int digitsum=0;
       int digitmultiply=1;
       while(n>0){
            int digit=n%10;
            digitsum += digit;
            digitmultiply *= digit;
            n/=10;
       }
       int totalsum=digitsum + digitmultiply;
       return temp % totalsum == 0;
    }
}