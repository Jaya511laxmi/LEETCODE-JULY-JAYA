class Solution {
    public int maxEvents(int[][] arr) {
        int n=arr.length ;
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int res=0,t=arr[0][0];
        int i=0;
        Queue<Integer> queue=new PriorityQueue<>() ;
        while(i<n || !queue.isEmpty()){
            if(queue.isEmpty()){
                t=Math.max(t,arr[i][0]);
            }
            while(i<n && arr[i][0]<=t){
                queue.offer(arr[i][1]) ;
                i +=1;
            }
            while(!queue.isEmpty() && queue.peek()<t){
                queue.poll() ;
            }
            if(!queue.isEmpty()){
                queue.poll();
                res += 1;
                t += 1 ;
            }

        }
        return res; 
    }
}
