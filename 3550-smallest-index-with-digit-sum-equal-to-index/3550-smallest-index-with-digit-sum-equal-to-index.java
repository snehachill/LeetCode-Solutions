class Solution {
    public int smallestIndex(int[] nums) {
        int smallest=0;
        for(int i=0;i<nums.length;i++){
           if (Sum(nums[i]) == i){
              return i;
           }
        }
        return -1;
    }
    private int Sum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}