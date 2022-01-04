public class SerchinginsortedRotatedArray {
    public static void main(String[] args) {
        /**
         * 
         */
        int a[]={4,5,6,7,1,2,3};
       int b= search(a, 4);
     if(b==-1)
     {
         System.out.println("number dosnt exist");
     }
     else{
         System.out.println(b+" is the position of the element");
     }

    }
    public static int search(int a[],int k)
    {
        int low =0,high=a.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid]==k)
            {
                return mid;

            }
            if(a[low]<a[mid])
            {
                if(k>=a[low] && k<a[mid])
                {
                    high=mid-1;
                }
                else{
                    low = mid+1;
                }

            }
            else{
               if(k>a[mid] && k<=a[high])
               {
                   low =mid+1;
               }
               else{
                   high= mid-1;
               }
               
            }
        }
        return -1;
    }
}
