public class BinarySearch{

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
         int k=search(a,1);
        if(k==-1)
        {
            System.out.println("Element dosnt exist");
        }
        else{
            System.out.println(k+" :is the position");
        }
        
        
    }
    public static int search(int a[],int s)
    {
        int k=0;      
        int l=0,r=a.length-1;
        while(l<=r)
        {
         int mid =(l+r)/2;
         if(a[mid]==s)
         {
             return mid;
         }
         if(s<a[mid])
         {
             r=mid-1;
         }
         if(s>a[mid])
         {
             l=mid+1;
         }
        }

        return -1;

    }
}