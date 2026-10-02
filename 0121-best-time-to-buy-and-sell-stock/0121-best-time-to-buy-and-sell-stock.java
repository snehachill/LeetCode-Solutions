class Solution {
    public int maxProfit(int[] prices) {
        int  minprice=Integer.MAX_VALUE;
        int  Maxprofit=0;
        for(int i=0;i<prices.length;i++){
            minprice=Math.min(minprice,prices[i]);
            Maxprofit=Math.max(Maxprofit,prices[i]-minprice);
        }
        return Maxprofit;
    }
}