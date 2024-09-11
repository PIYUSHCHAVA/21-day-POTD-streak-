import java.util.PriorityQueue;

class MinimumCostofRopes{
    public static  long minCost(long[] arr)
    {
      int n=arr.length;
      PriorityQueue<Long> pq=new PriorityQueue<>();
      for(int i=0; i<n; i++)
       pq.add(arr[i]);
   
       long res=0;
       while(pq.size() > 1)
       {
        long firstSecond=pq.poll()+pq.poll();
        res+=firstSecond;
        pq.add(firstSecond);
       }
     return res;
    }
    public static void main(String[] args) 
    {
        long arr[]={4,3,2,6};
        long res=minCost(arr);
        System.out.println(res);
    }

}