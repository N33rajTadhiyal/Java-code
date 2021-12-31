public class GeeksKadensAlgo {
    public static void main(String[] args) {
        int a[]={-1 ,-2 ,-3, -4};
        int sum =0,maxSum=a[0];
       
        for(int i =0;i<a.length;i++)
        {
          sum+=a[i];
          if(sum>maxSum)
          {
              
              maxSum=sum;
          }
          if(sum<0)
          {
              sum=0;
          }
        }
        System.out.println(maxSum+"");
    }
    
}
