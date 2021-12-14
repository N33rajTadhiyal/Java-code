public class Missing_number {
    public static void main(String[] args) {
        int a[]={1,2,3,4,0,6,7,8,9,10};
        int ms =10*(10+1)/2;
        int s=0;
        for(int i =0;i<a.length;i++)
        {
          s=s+a[i];
        }
        System.out.println(ms+" : max sum");
        System.out.println(s+" is the sum");
        System.out.println((ms-s)+" : is the missing number");
    }
    
}
