class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int UniqueCount=1;
        for(int i=1;i<candyType.length;i++){
            if(candyType[i]!=candyType[i-1]){
                UniqueCount++;
            }
        }
        return Math.min(UniqueCount,candyType.length/2);
    }
}