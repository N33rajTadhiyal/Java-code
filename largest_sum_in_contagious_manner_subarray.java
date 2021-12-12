public class largest_sum_in_contagious_manner_subarray {
    public static void main(String[] args) {
        int a[]={1,2,3,-4,2,5};
        int max =0;
        int realmax=0;
        for(int i =0;i<a.length;i++)
        {
            max=max+a[i];
            if(max>realmax)
            {
                realmax=max;
            }
            if(max<0)
            {
                max=0;
            }
        }
        System.out.println(realmax+"  ");
    }
    
}
