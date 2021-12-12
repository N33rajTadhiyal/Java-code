public class rainwater_trapping_probluem {
    public static void main(String[] args) {
        int a[] ={3,1,2,4,0,1,3,2};

        int left[]=new int[a.length];
        int right[]= new int[a.length];
        right[0]=a[0];
        System.out.println("aaho baka");

        for(int i =1;i<a.length;i++)
        {
           right[i]=Math.max(a[i], right[i-1]);

        }
        left[a.length-1]=a[a.length-1];

        for(int i =a.length-2;i>=0;i--)
        {
           left[i]=Math.max(left[i+1], a[i]);
        }       
 
        int water =0;
        for(int i=0;i<a.length;i++)
        {
           water += Math.min(right[i], left[i])-a[i];
        }
        System.out.println(water+" :unit");
        
    }
    
}
