class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int maxVal=0;

        for(int num:nums){
            maxVal = Math.max(maxVal, num);
        }
        int freq[]=new int[maxVal+1];
        long windowSum=0;
        long maxSum=0;
        int duplicateCount=0;

        for(int i=0;i<k;i++){
            windowSum+=nums[i];
            freq[nums[i]]++;

            if(freq[nums[i]]==2){
              duplicateCount++;
            }
        }
        if(duplicateCount==0){
            maxSum=windowSum;
        }

        for(int i=k;i<n;i++){
            int in=nums[i];
            freq[in]++;
            if(freq[in]==2){
                duplicateCount++;
            }
            windowSum += in;
            int out=nums[i-k];
            if(freq[out]==2){
                duplicateCount--;
            }
            freq[out]--;
            windowSum -= out;
            
            if (duplicateCount == 0) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }
        return maxSum;
    }
}