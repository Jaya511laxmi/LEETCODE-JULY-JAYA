class FindSumPairs {
    int[] nums1;
    int[] nums2;
    HashMap<Integer,Integer> map=new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        for(int i=0;i<nums2.length;i++ ){
            if(map.get(nums2[i])!=null){
                map.put(nums2[i],map.get(nums2[i])+1);
            }else{
                map.put(nums2[i],1);
            }
        }

        
    }
    
    public void add(int index, int val) {
        int oldval=nums2[index];
        int newVal=nums2[index]+val;
       map.put(nums2[index], map.get(nums2[index])-1);
       if( map.get(nums2[index])==0){
        map.remove(nums2[index]);
       }
       if(map.get(newVal)!=null){
        map.put(newVal,map.get(newVal)+1);
       }else{
        map.put(newVal,1);
       }
       nums2[index]=newVal;
        
    }
    
    public int count(int tot) {
        int n=nums1.length;
        int m=nums2.length;
        int count=0;
        for(int num : nums1){
            int rem=tot-num;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
        }

       

        return count;
        
    }
}

