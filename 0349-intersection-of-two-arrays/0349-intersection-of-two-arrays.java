class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer>s1=new HashSet<>();
      for(int num:nums1){
        s1.add(num);
      }
      
      Set<Integer>ResultSet=new HashSet<>();
      for(int num:nums2){
        if(s1.contains(num)){
            ResultSet.add(num);
        }
      }

      int result[]=new int[ResultSet.size()];
      int index=0;
      for(int num:ResultSet){
         result[index++]=num;
      }
      return result;
    }
}